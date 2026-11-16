package com.example.idempotency_demo.repository;

import com.example.idempotency_demo.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment, Long> {
}
