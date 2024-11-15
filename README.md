# Online Quiz Platform

A beginner-friendly Java application simulating basic banking operations, including deposits, withdrawals, and balance checking. This project covers essential Java concepts like the `Scanner` class, methods, conditional statements, and loops, making it an ideal foundation for learning Java.

## Table of Contents
- [Project Overview](#project-overview)
- [Features](#features)
- [Technologies Used](#technologies-used)
- [Installation](#installation)
- [Usage](#usage)
- [Code Structure](#code-structure)

## Project Overview
The **Simple Banking Application** allows users to manage an account with basic functions:
1. Checking the account balance.
2. Depositing funds into the account.
3. Withdrawing funds from the account.

This project is part of a Java Development internship, focusing on building practical applications and enhancing problem-solving skills in Java.

## Features
- **Check Balance**: Display the current account balance.
- **Deposit Funds**: Add money to the account balance.
- **Withdraw Funds**: Deduct money from the account balance with checks for sufficient funds.
- **User-Friendly Menu**: Simple text-based menu for easy navigation.

## Technologies Used
- **Java**: Core language for application logic.
- **Scanner**: Used for user input.

## Installation
1. **Clone the Repository**:
   ```bash
   git clone https://github.com/Nikhith-08/CodeAlpha_Online-Quiz-Platform.git
2. **Navigate to the Project Directory:**
   ```bash
   cd simple-banking-application

4. **Compile the Program:**
   ```bash
   javac Online_Quiz_Platform.java
 
6. **Run the Program:**
   ```bash
   java Online_Quiz_Platform
   
## Usage
1. Run the program, and the main menu will display:
2. Select an option by entering the corresponding number.
3. For option `2`, you will be prompted to enter a deposit amount.
4. Choose option `3` to enter a withdrawal amount, provided funds are sufficient.
5. Select option `4` to exit the application.

## Code Structure
### `SimpleBankingApp` Class
- **Fields**:
- `balance` - Stores the current account balance.

- **Methods**:
- `checkBalance()`: Returns the account balance.
- `deposit(double amount)`: Adds a specified amount to the balance, if valid.
- `withdraw(double amount)`: Deducts a specified amount from the balance if funds are sufficient.

- **Menu Loop**:
- The `main` method provides a menu interface, allowing users to interact with the program to check balance, deposit, or withdraw funds until they choose to exit.


