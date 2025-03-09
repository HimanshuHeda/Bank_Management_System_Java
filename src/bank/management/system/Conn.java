package bank.management.system;

import java.sql.*;

public class Conn {
    Connection c; 
    Statement s;
    
    public Conn() {
        try {
            // Register the Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Create Connection
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankmanagementsystem", "root", "S86900@harma");

            // Create Statement
            s = c.createStatement();
            
            System.out.println("Database Connected Successfully");
        } 
        catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
