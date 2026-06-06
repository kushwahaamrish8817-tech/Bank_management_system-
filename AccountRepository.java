package com.bank.repository;

public interface AccountRepository {

    void createAccount(Account account);
    void deposit(Long accountId, Double amount);
    void withdraw(Long accountId, Double amount);
    Double getBalance(Long accountId);
    void transfer(Long fromId, Long toId, Double amount);
}