
package com.example.banking.dao;

import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class TransactionReader {

    private final JdbcTemplate jdbcTemplate;

    public TransactionReader(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    // READ: Retrieve all transactions
    public void displayTransactions() {

        String sql = "SELECT * FROM transactions";

        List<Map<String, Object>> transactions =
                jdbcTemplate.queryForList(sql);

        for (Map<String, Object> transaction : transactions) {
            System.out.println(transaction);
        }
    }

    // INSERT: Add a new transaction
    public void addTransaction(
            String accountNumber,
            String transactionType,
            double amount,
            String description) {

        String sql = """
                INSERT INTO transactions
                (account_number, transaction_type, amount, description)
                VALUES (?, ?, ?, ?)
                """;

        int rowsAffected = jdbcTemplate.update(
                sql,
                accountNumber,
                transactionType,
                amount,
                description
        );

        System.out.println("Rows inserted: " + rowsAffected);
    }
}
