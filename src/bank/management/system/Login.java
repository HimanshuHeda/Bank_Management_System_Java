package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Login extends JFrame implements ActionListener {
    
    // Now we have to define the buttons Globally to access each of them outside the constructor also
    // If we declear the JButton Globally then we do not need to mentioned it Locally 
    JButton login, signup, clear;
    JTextField cardTextField;
    JPasswordField pinTextField;
    
    // Lets Define a Constructor Named Login 
    Login(){
        // This is Title 
        setTitle("AUTOMATED TELLER MACHINE");
        
        // This is the layout which is use for the customizations 
        setLayout(null);
        
        // This is the logo
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label = new JLabel(i3);
        label.setBounds(70, 10, 100, 100);
        add(label);
        
        // This is the Text 
        JLabel text = new JLabel("Welcome To ATM");
        text.setFont(new Font("Osward", Font.BOLD, 38));
        text.setBounds(200, 40, 400, 40);
        add(text);
        
        // This is the Card No. 
        JLabel cardno = new JLabel("Card No. :");
        cardno.setFont(new Font("Raleway", Font.BOLD, 28));
        cardno.setBounds(120, 150, 150, 30);
        add(cardno);
        
        // TextBox for the Card No.
        cardTextField = new JTextField();
        cardTextField.setBounds(300, 150, 230, 30);
        cardTextField.setFont(new Font("Arial", Font.BOLD, 14));
        add(cardTextField);
        
        // This is the pin  
        JLabel pin = new JLabel("Pin :");
        pin.setFont(new Font("Osward", Font.BOLD, 28));
        pin.setBounds(120, 220, 250, 40);
        add(pin);
        
        // TextBox for the pin
        pinTextField = new JPasswordField();
        pinTextField.setBounds(300, 220, 230, 30);
        pinTextField.setFont(new Font("Arial", Font.BOLD, 14));
        add(pinTextField);
        
        // Lets Create a Button of Sign In
        login = new JButton("SIGN IN");
        login.setBounds(300, 300, 100, 30);
        login.setBackground(Color.BLACK);
        login.setForeground(Color.WHITE);
        login.addActionListener(this);
        add(login);
        
        // Lets Create a Button of Clear
        clear = new JButton("CLEAR");
        clear.setBounds(430, 300, 100, 30);
        clear.setBackground(Color.BLACK);
        clear.setForeground(Color.WHITE);
        clear.addActionListener(this);
        add(clear);
        
        // Lets Create a Button of Sign Up
        signup = new JButton("SIGN UP");
        signup.setBounds(300, 350, 230, 30);
        signup.setBackground(Color.BLACK);
        signup.setForeground(Color.WHITE);
        signup.addActionListener(this);
        add(signup);
        
        // It is use the change the background color 
        getContentPane().setBackground(Color.WHITE);
        
        // This is use the create a basic frame in which we can design everything 
        setSize(800,480);
        setVisible(true);
        setLocation(350,200);
    }
    
    // Abstact Method Override
    // ActionEvent ae is use to define what action you need to perform or on what component it is performaed 
    public void actionPerformed(ActionEvent ae){
        if (ae.getSource() == clear){
            cardTextField.setText("");
            pinTextField.setText("");
        }
        else if (ae.getSource() == login){
            Conn conn = new Conn();
            String cardnumber = cardTextField.getText();
            String pinnumber = pinTextField.getText();
            String query = "select * from login where cardnumber = '"+cardnumber+"' and pin = '"+pinnumber+"'";
            try{
                ResultSet rs = conn.s.executeQuery(query);
                if (rs.next()) {
                    setVisible(false);
                    new Transactions(pinnumber).setVisible(true);
                }
                else {
                    JOptionPane.showMessageDialog(null,"Incorrect Card Number or Pin");
                }
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
        else if (ae.getSource() == signup){
            setVisible(false);
            new SignupOne().setVisible(true);
        }
    }
    
    public static void main(String[] args) {
        new Login();
    }
}
