# MyFinanceBuddy

# Personal Finance Management System

## Overview
The **Personal Finance Management System** is a console-based Java application designed to help users manage their personal finances. The system allows users to register, log in, and manage their income, expenses, and view financial reports. It provides an easy-to-use interface for adding transactions, viewing the balance, and generating financial reports.

## Features
- **User Registration & Login**: Allows users to create an account and securely log in.
- **Income Management**: Users can add income transactions and categorize them.
- **Expense Management**: Users can add expense transactions and categorize them.
- **Balance Calculation**: Calculate the current balance by subtracting expenses from income.
- **Financial Reports**: Generate reports displaying income, expenses, and balance summaries.
- **Easy Navigation**: Simple text-based menus for interacting with the system.

## Requirements
- Java 11 or higher
- IDE or text editor (e.g., IntelliJ IDEA, Eclipse)

## System Workflow

### 1. Main Menu
Upon starting the application, the user is greeted with a welcome message and presented with three options:
- **Register**: Create a new account by providing a username and password.
- **Login**: Log in to an existing account with valid credentials.
- **Exit**: Exit the application.

### 2. User Registration
- Users can create a new account by selecting the **Register** option.
- They are prompted to provide a **username** and **password**.
- If the username already exists, the user is notified.
- If successful, the user is registered and can proceed to log in.

### 3. User Login
- After registration, users can log in by selecting the **Login** option.
- The system validates the provided **username** and **password**.
- If the credentials are correct, the user gains access to the **Finance Management Menu**.
- If the credentials are invalid, an error message is displayed.

### 4. Finance Management Menu
After logging in, users can manage their finances through the **Finance Management Menu**, which provides the following options:
- **Add Income**: Allows users to input income details (description, amount, category) and adds it to the system.
- **Add Expense**: Allows users to input expense details (description, amount, category) and adds it to the system.
- **View Balance**: Displays the current balance, calculated as **Total Income - Total Expenses**.
- **Generate Report**: Generates and displays a detailed financial report that includes:
  - Total income
  - Total expenses
  - Current balance
  - Categorized transaction details (both income and expense).
- **Logout**: Logs the user out and returns to the main menu.

### 5. Report Generation
The **Generate Report** option presents a summary of the user's financial status:
- **Total Income**: Displays the sum of all income transactions.
- **Total Expenses**: Displays the sum of all expense transactions.
- **Balance**: Displays the current balance (Total Income - Total Expenses).
- **Categorized Transaction Details**:
  - Lists all recorded income and expense transactions, grouped by category.
  - For each transaction, details such as the description, category, and amount are shown.


## Future Improvements

- **Database Integration**: Store user and transaction data persistently using a database.
- **User Authentication**: Implement secure password hashing and encryption.
- **GUI Support**: Add a graphical interface for better user experience.
- **Multi-Currency Support**: Allow users to manage finances in multiple currencies.
- **Data Analytics**: Provide insights into spending patterns and savings tips.


