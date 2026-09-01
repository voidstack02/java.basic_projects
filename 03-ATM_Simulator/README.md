# 💳 ATM Simulator - Java

A simple console-based ATM Simulator built using Java. This project simulates basic ATM operations such as PIN authentication, balance checking, cash withdrawal, and cash deposit.

## 📌 About the Project

This ATM Simulator is a beginner-level Java project created to practice Java fundamentals by implementing a simple real-world banking application.

The program first asks the user to enter a PIN. The user gets a maximum of 3 attempts. After successful login, the user can perform different ATM operations through a menu.

## 🚀 Features

- PIN authentication
- Maximum 3 PIN attempts
- ATM lockout after 3 incorrect attempts
- Savings Account balance check
- Current Account balance check
- Cash withdrawal
- Cash deposit
- Menu-driven interface
- Basic input validation

## 🔑 Default PIN

**PIN:** `2345`

This PIN is used only for demonstration purposes.

## 🛠️ Technologies Used

- Java
- Scanner
- VS Code
- GitHub

## 📚 Java Concepts Used

- Variables
- Data Types
- Scanner
- User Input
- If-Else Statements
- While Loop
- Switch-Case
- Boolean
- Arithmetic Operators
- Comparison Operators
- Logical Operators
- Break Statement

## ▶️ How to Use

1. Run the `ATM_Simulator.java` program.
2. Enter the default PIN `2345`.
3. After successful login, choose an option from the ATM menu.
4. Select Balance Check to view the account balance.
5. Select Cash Withdraw to withdraw money.
6. Select Cash Deposit to deposit money.
7. If the wrong PIN is entered 3 times, the ATM will be locked.

## 🖥️ Sample Output

### Successful Login

```text
========== ATM ==========

Enter Your PIN
2345

Login successful!

CHOOSE YOUR ACTION

1 - Balance check
2 - Cash withdraw
3 - Cash Deposit
