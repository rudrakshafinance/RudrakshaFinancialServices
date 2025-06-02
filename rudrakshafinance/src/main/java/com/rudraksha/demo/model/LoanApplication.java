package com.rudraksha.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "loan_applications")
public class LoanApplication {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String number;
    private Double amount;
    private String message;
    private String loanType; // To distinguish between home, mortgage, etc.
	
    // 🔥 Add All Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getLoanType() {
        return loanType;
    }

    public void setLoanType(String loanType) {
        this.loanType = loanType;
    }

    // ✅ Constructor(s) - optional but good
    public LoanApplication() {
    }

    public LoanApplication(String name, String number, Double amount, String message, String loanType) {
        this.name = name;
        this.number = number;
        this.amount = amount;
        this.message = message;
        this.loanType = loanType;
    }
}

