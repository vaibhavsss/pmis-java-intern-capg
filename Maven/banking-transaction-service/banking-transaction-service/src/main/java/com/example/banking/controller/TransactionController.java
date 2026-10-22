
package com.example.banking.controller;

import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.ResponseStatus;

@RestController
@RequestMapping("/api/transactions")
public class TransactionController {

    private final JdbcTemplate jdbcTemplate;

    public TransactionController(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    // GET: Retrieve all transactions
    @GetMapping
    public List<Map<String, Object>> getAllTransactions() {

        String sql = """
                SELECT transaction_id, account_number,
                       transaction_type, amount, description,
                       transaction_date
                FROM transactions
                ORDER BY transaction_id
                """;

        return jdbcTemplate.queryForList(sql);
    }

    // POST: Create a new transaction
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Map<String, Object> createTransaction(
            @RequestBody Map<String, Object> request) {

        String sql = """
                INSERT INTO transactions
                (account_number, transaction_type, amount, description)
                VALUES (?, ?, ?, ?)
                """;

        String accountNumber =
                (String) request.get("accountNumber");

        String transactionType =
                (String) request.get("transactionType");

        double amount =
                Double.parseDouble(request.get("amount").toString());

        String description =
                (String) request.get("description");

        jdbcTemplate.update(
                sql,
                accountNumber,
                transactionType,
                amount,
                description
        );

        return jdbcTemplate.queryForMap(
                "SELECT transaction_id, account_number, " +
                "transaction_type, amount, description, transaction_date " +
                "FROM transactions WHERE transaction_id = " +
                "(SELECT MAX(transaction_id) FROM transactions)"
        );
    }
}
