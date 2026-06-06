package com.bank.model;

public class Account {

    private Long accountId;
    private String holderName;
    private Double balance;

    // Constructor
    public Account() {
    }

    public Account(Long accountId, String holderName, Double balance) {
        this.accountId = accountId;
        this.holderName = holderName;
        this.balance = balance;
    }

    // Getters and Setters
    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public Double getBalance() {
        return holderName;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }
}