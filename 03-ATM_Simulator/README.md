# 💳 ATM Simulator – Java

A simple console-based ATM Simulator built using Java. This project is part of my step-by-step Java learning journey and focuses on applying basic Java concepts to a real-world application.

## 📌 About the Project

The ATM Simulator allows a user to log in using a PIN and perform basic banking operations.

The program provides a maximum of **3 attempts** to enter the correct PIN. If the user enters the wrong PIN three times, the ATM is locked.

After successful login, the user can:

- Check Balance
- Withdraw Cash
- Deposit Cash

## 🚀 Features

- 🔐 PIN Authentication
- 🚫 Maximum 3 PIN Attempts
- 🔒 ATM Lockout after 3 incorrect attempts
- 💰 Balance Check
- 💸 Cash Withdrawal
- 💵 Cash Deposit
- 📋 Menu-Driven Interface

## 🛠️ Technologies Used

- Java
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
- Basic Program Flow

## 🔄 Program Flow

```text
START
  ↓
Enter PIN
  ↓
Check PIN
  ↓
Correct?
 ├── NO → Increase Attempts
 │          ↓
 │       Attempts < 3?
 │          ↓
 │       Try Again
 │
 └── YES
      ↓
Login Successful
      ↓
ATM MENU
      ↓
1. Balance Check

##Default PIN:**
```text
2345
2. Cash Withdrawal
3. Cash Deposit
      ↓
Perform Operation
