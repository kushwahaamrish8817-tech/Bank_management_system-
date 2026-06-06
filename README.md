# Bank Management System

A backend banking application developed using Spring Boot, JDBC, and MySQL.

## Features

- Create Account
- Deposit Money
- Withdraw Money
- Balance Inquiry
- Fund Transfer
- Global Exception Handling
- Transaction Management

## Tech Stack

- Java
- Spring Boot
- JDBC
- MySQL
- Maven
- Postman

## Project Structure

src/main/java/com/bank

├── Account.java
├── AccountRepository.java
├── AccountRepositoryImpl.java
├── AccountService.java
├── AccountServiceImpl.java
├── AccountController.java
├── AccountNotFoundException.java
├── InsufficientBalanceException.java
├── GlobalExceptionHandler.java
└── BankApplication.java

src/main/resources

└── application.properties

## API Endpoints

POST /accounts

POST /accounts/{id}/deposit

POST /accounts/{id}/withdraw

GET /accounts/{id}/balance

POST /accounts/transfer

## Author

Amrish Kushwaha
