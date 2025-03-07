🏦 Bank Management System (ATM Machine)
=======================================

✨ Introduction
--------------

The **Bank Management System (ATM Machine)** is a **Java-based** application that simulates basic banking operations through an **ATM-like interface**. Users can perform essential transactions such as **PIN change, cash withdrawal, deposits, balance inquiry**, and more.

The application is built using **Java Swing** for a graphical user interface and **JDBC** for secure database connectivity.

💳 Features
-----------

*   ➕ **Deposit**: Add money to your bank account.
*   ➖ **Cash Withdrawal**: Withdraw money from your account.
*   ⏫ **Fast Cash**: Quick withdrawal of pre-defined amounts.
*   📈 **Balance Inquiry**: Check your current account balance.
*   📝 **Mini Statement**: View a summary of recent transactions.
*   🔑 **PIN Change**: Securely update your ATM PIN.
*   ❌ **Exit**: Safely log out of the application.
    

💻 Technologies Used
--------------------

*   **Programming Language**: Java
*   **GUI Framework**: Swing (Java)
*   **Database**: MySQL
*   **Database Connectivity**: JDBC
*   **IDE**: IntelliJ IDEA / Eclipse / NetBeans (or any Java IDE)
    

🛠️ Installation and Setup
--------------------------

### ⚡ Prerequisites

*   **JDK 8** or higher installed on your machine.
*   **MySQL Server** installed and configured.
*   **Java IDE** (e.g., IntelliJ IDEA, Eclipse, or NetBeans).
    

### ⭐ Steps to Run the Project

1.  git clone https://github.com/HimanshuHeda/Bank_Management_System_Java.git
    
2.  **Open the project** in your Java IDE.
    
3.  **Set up the database**:
    
    *   Import the provided SQL script (database\_setup.sql) to create the required tables in MySQL.
    *   Update the Conn class with your **MySQL credentials**.
        
4.  **Compile and run the project**:
     Execute the Transactions or Main class to launch the application.
        

📚 Database Structure
---------------------

The project uses the following tables:

### **1\. ```bank``` Table** (Stores user account details and transactions)
```
   CREATE TABLE bank (     
       account_no INT PRIMARY KEY,     
       name VARCHAR(50),     
       balance DOUBLE,     
       pin VARCHAR(4)  
       );   
```
### **2\. ```login``` Table** (Manages user authentication)
### **3\. ```signupthree``` Table** (Contains user registration details)

💻 How to Use
-------------

1.  **Run the application.**
2.  **Log in** using your account PIN.
3.  **Select** the desired operation from the menu.
4.  **Follow** the on-screen prompts to complete the transaction.
5.  **Log out** when finished by clicking the **Exit** button.

Screenshots
------------
##### **Login Page**:
![image](https://github.com/user-attachments/assets/157a9ab2-c827-46a7-8beb-b5097593ffe5)

##### **SignUpOne**: 
![image](https://github.com/user-attachments/assets/7f986c75-4d0a-4a23-9a40-6a80fe834694)

##### **Main Transactions Menu**:
![image](https://github.com/user-attachments/assets/d4e070d5-2b15-4db3-b6bd-90fd6de99eb1)

##### **PIN Change Interface**:
![image](https://github.com/user-attachments/assets/d349c918-646e-4aa6-8ed1-33596f92e993)

##### **Withdrawl**:
![Screenshot 2025-01-15 153737](https://github.com/user-attachments/assets/02f58ef8-7729-45d4-975b-0c5c4f613bc8)

##### **FastCash**:
![image](https://github.com/user-attachments/assets/2a8dd60d-27f2-46c2-a75f-5f1d4ab4ce49)


⚠️ Known Issues
---------------

*   Ensure all **database credentials** are correct to **avoid connection issues**.
*   Add **input validation** for robust error handling and to **prevent SQL injection attacks**.
    

🚀 Future Enhancements
----------------------

*   ✅ **Multi-User Support**: Implement unique account numbers for multiple users.
    
*   🔒 **OTP Verification**: Add an extra layer of security during login and transactions.
    
*   🎨 **Enhanced GUI**: Upgrade the user interface for a more **modern and intuitive** experience.
    

🤝 Contributing
---------------

Contributions are welcome! If you want to contribute:

1.  **Fork** the repository.
2.  **Create** a new feature branch.
3.  **Commit** your changes with meaningful messages.
4.  **Submit** a pull request.
    

📜 License
----------

This project is licensed under the **MIT License**. See the [LICENSE](https://github.com/HimanshuHeda/Bank_Management_System_Java?tab=MIT-1-ov-file) file for details.

📞 Contact
----------

For any queries or suggestions, feel free to reach out:

*   **👤 Name:** Himanshu Heda
*   📧 **Email:** himanshuheda123@gmail.com
*   💻 **GitHub:** [HimanshuHeda](https://github.com/HimanshuHeda)
*   🔗 **LinkedIn:** [Himanshu Heda](https://www.linkedin.com/in/himanshu-heda/)