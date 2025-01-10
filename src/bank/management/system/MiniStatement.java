package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.sql.*;

public class MiniStatement extends JFrame {

    MiniStatement(String pinnumber) {
        setTitle("Mini Statement");
        setLayout(null);

        JLabel mini = new JLabel();
        add(mini);

        JLabel bank = new JLabel("Indian Bank");
        bank.setBounds(150, 20, 200, 20);
        bank.setFont(new Font("System", Font.BOLD, 16));
        add(bank);

        JLabel card = new JLabel();
        card.setBounds(20, 60, 300, 20);
        add(card);

        JLabel balance = new JLabel();
        balance.setBounds(20, 400, 300, 20);
        add(balance);

        try {
            Conn conn = new Conn();

            // Retrieve card number
            ResultSet rs1 = conn.s.executeQuery("SELECT * FROM login WHERE pin = '" + pinnumber + "'");
            if (rs1.next()) {
                card.setText("Card Number: " + rs1.getString("cardnumber").substring(0, 4) + "XXXXXXXX" + rs1.getString("cardnumber").substring(12));
            }

            // Retrieve transactions and calculate balance
            int bal = 0;
            ResultSet rs2 = conn.s.executeQuery("SELECT * FROM bank WHERE pin = '" + pinnumber + "'");
            StringBuilder transactions = new StringBuilder("<html>");
            while (rs2.next()) {
                transactions.append(rs2.getString("date"))
                        .append("&nbsp;&nbsp;&nbsp;&nbsp;")
                        .append(rs2.getString("type"))
                        .append("&nbsp;&nbsp;&nbsp;&nbsp;")
                        .append("Rs.").append(rs2.getString("amount"))
                        .append("<br>");
                if (rs2.getString("type").equalsIgnoreCase("Deposit")) {
                    bal += Integer.parseInt(rs2.getString("amount"));
                } else {
                    bal -= Integer.parseInt(rs2.getString("amount"));
                }
            }
            transactions.append("</html>");
            mini.setText(transactions.toString());
            balance.setText("Your current account balance is Rs. " + bal);

        } catch (Exception e) {
            System.out.println(e);
        }

        mini.setBounds(20, 140, 360, 200);

        setSize(400, 600);
        setLocation(20, 20);
        getContentPane().setBackground(Color.WHITE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new MiniStatement("1234"); // Pass a valid PIN for testing
    }
}
