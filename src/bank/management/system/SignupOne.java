package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.util.*;

public class SignupOne extends JFrame {
    
    SignupOne() {
        
        setLayout(null);
        
        Random ran = new Random();
        long random = Math.abs((ran.nextLong() % 9000L) + 1000L);
        
        JLabel formno = new JLabel("APPLICATION FORM NUMBER :" + random);
        formno.setFont(new Font("Raleway", Font.BOLD, 30));
        formno.setBounds(140, 20, 600, 40);
        add(formno);
        
        getContentPane().setBackground(Color.WHITE);
        
        setSize(850,800);
        setLocation(350, 10);
        setVisible(true);
    }
    
    
    public static void main(String[] args) {
        new SignupOne();
    }
}
