package com.exam.financeadvisor.model;

import jakarta.persistence.*;
import lombok.Data;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "expenses")
@Data
public class Expense {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;      // e.g., "Grocery", "Netflix"
    private BigDecimal amount;
    private String category;   // e.g., "Food", "Entertainment"
    private LocalDate date;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user; // Ye kharcha kis user ka hai
}
