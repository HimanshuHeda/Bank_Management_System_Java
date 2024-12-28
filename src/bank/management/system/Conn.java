package bank.management.system;

import java.sql.*;

public class Conn {
    
    // We will Perform Exception Handling bcz MySql is and External Entity it will thow the error at the run time not 
    // compile time
    public Conn(){
        Connection c; 
        Statement s;
        try {
            Class.forName(com.mysql.cj.jdbc.Driver);
            c = DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem", "root", "");                // localhost:3306 is the bydefault port for mysql
            s = c.createStatement();
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}





// Steps in the connection of Sql 
// 1. Register the Driver 
// 2. Create Connection 
// 3. Create Statement
// 4. Execute Querry 
// 5. Close Connection 
