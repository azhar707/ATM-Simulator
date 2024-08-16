# ATM Simulator

This project is an ATM (Automated Teller Machine) simulator that mimics the core functionalities of a real-world ATM. The application is built using Java and includes a range of features, such as account creation, deposits, withdrawals, balance inquiries, and mini statements. The project is ideal for understanding how a basic banking system operates and is a great learning tool for those interested in Java programming and database management.

## Table of Contents

- [Project Structure](#project-structure)
- [Features](#features)
- [Installation](#installation)
- [Usage](#usage)
- [Database Setup](#database-setup)
- [Screenshots](#screenshots)
- [Contributing](#contributing)
- [License](#license)

## Project Structure
    src/: Contains all Java source files.
    dist/: Contains the compiled JAR file.
    images/: Directory for storing images used in the application (e.g., logos, icons).
    The project consists of the following Java files:

- conn.java: Handles the database connection using JDBC for executing SQL queries.
- login.java: Handles user authentication by validating card number and PIN.
- signup1.java: Collects basic user information for account creation.
- signup2.java: Gathers additional details such as religion, income, and category.
- signup3.java: Finalizes the account creation by selecting account type and issuing a card number.
- transactions.java: Manages the main transaction menu, allowing users to choose actions like withdrawal, deposit, and balance inquiry.
- withdrawl.java: Handles cash withdrawal operations.
- ministatement.java: Displays a mini-statement of recent transactions.
- **`deposit.java: Manages deposit transactions.
- fastcash.java: Enables quick withdrawal of predefined amounts.
- pin.java: Allows users to change their PIN.
- practice.java: A supplementary file for testing or practice purposes.

## Features

- User Authentication: Secure login with card number and PIN.
- Account Creation: Step-by-step user account creation.
- Balance Inquiry: Check available account balance.
- Cash Withdrawal: Withdraw cash from the account, with balance updates.
- Deposit: Deposit cash into the account.
- Mini Statement: View recent transaction history.
- Fast Cash: Quickly withdraw common amounts.
- PIN Change: Change the account PIN.

## Installation

1. Clone the repositor:
   ```bash
   git clone https://github.com/yourusername/atm-simulator.git
   cd atm-simulator
   ```

2. Set up the database (see [Database Setup](#database-setup)).

3. Compile and run the project using NetBeans, Eclipse, or the command line.

# Build the Project:
ant -f "D:\\Bank Management System" -Dnb.internal.action.name=rebuild clean jar

# Run the Application:

java -jar "D:\\Bank Management System\\dist\\Bank_Management_System.jar"

## Usage

- Launch the application by running the `Bank_Management_System.jar` file.
- Navigate through the main menu to access different functionalities.
- Ensure that the MySQL database is running and properly configured.

## Database Setup

            CREATE DATABASE bankmanagementsystem;
            
            USE bankmanagementsystem;
            
            CREATE TABLE signup (
                formno VARCHAR(20), 
                name VARCHAR(20), 
                father_name VARCHAR(20), 
                dob VARCHAR(20), 
                gender VARCHAR(20),
                email VARCHAR(30), 
                marital_status VARCHAR(20), 
                address VARCHAR(40), 
                city VARCHAR(25), 
                pincode VARCHAR(20), 
                state VARCHAR(25)
            );
            
            CREATE TABLE signup2 (
                formno VARCHAR(20), 
                religion VARCHAR(20), 
                category VARCHAR(20), 
                income VARCHAR(20), 
                education VARCHAR(20), 
                occupation VARCHAR(20), 
                pan VARCHAR(20), 
                aadhar VARCHAR(20), 
                seniorcitizen VARCHAR(20), 
                existingaccount VARCHAR(20)
            );
            
            CREATE TABLE signup3 (
                formno VARCHAR(20), 
                accountType VARCHAR(40), 
                cardnumber VARCHAR(25), 
                pin VARCHAR(10), 
                facility VARCHAR(100)
            );
            
            CREATE TABLE login (
                formno VARCHAR(20), 
                cardno VARCHAR(25), 
                pin VARCHAR(10)
            );
            
            CREATE TABLE bank (
                pin VARCHAR(10), 
                date VARCHAR(50), 
                type VARCHAR(20), 
                amount VARCHAR(20)
            );

3. Ensure the table structure matches the one used in your Java files.

## Screenshots
![Screenshot (1)](https://github.com/user-attachments/assets/ff0fa0bd-859c-4aa5-88bf-863357ed16ed)
![Screenshot (2)](https://github.com/user-attachments/assets/2b57c6b6-3b2e-41df-942b-b337706be27f)
![Screenshot (3)](https://github.com/user-attachments/assets/58ac518f-459f-4a8f-969d-776b2ebd1d6d)
![Screenshot (4)](https://github.com/user-attachments/assets/daaa3761-5500-4b7d-bb32-559d80add6ff)
![Screenshot (5)](https://github.com/user-attachments/assets/0b016cb2-f48b-442b-8f03-2d1c2c7dd1d0)
![Screenshot (6)](https://github.com/user-attachments/assets/b33c3ae6-adc4-4a03-89dc-e4be8cb19e6c)
![Screenshot (7)](https://github.com/user-attachments/assets/e8e701ae-2673-48eb-a05b-84a9e3690b9d)



## Contributing

Contributions are welcome! Please fork the repository and create a pull request with your changes.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
