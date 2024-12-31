package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SignupTwo extends JFrame implements ActionListener {
    
    long random;
    JTextField aadhar,pan;
    JButton next;
    JRadioButton syes, sno, eyes, eno;
    JComboBox religion, category, income, occupation, education;
    String formno;
    
    
    SignupTwo(String formno) {
        
        this.formno = formno;
        
        setLayout(null);
        
        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");
        
        // This is the section of Personal Details text
        JLabel additionalDetails = new JLabel("Page 2 : Additional Details");
        additionalDetails.setFont(new Font("Raleway", Font.BOLD, 22));
        additionalDetails.setBounds(290, 80, 300, 30);
        add(additionalDetails);
        
        
        // This is the section of Religion
         JLabel religionLabel = new JLabel("Religion :");
        religionLabel.setFont(new Font("Raleway", Font.BOLD, 20));
        religionLabel.setBounds(100, 140, 100, 30);
        add(religionLabel);
        
        // Lets Create a Combo Box of Religion 
        String valReligion[] = {"Hindu", "Muslim", "Sikh", "Christian", "Other"};
        religion = new JComboBox(valReligion);
        religion.setBounds(300, 140, 400, 30);
        religion.setBackground(Color.WHITE);
        add(religion);
        
        
        // This is the section of Category
        JLabel categoryLabel = new JLabel("Category :");
        categoryLabel.setFont(new Font("Raleway", Font.BOLD, 20));
        categoryLabel.setBounds(100, 190, 200, 30);
        add(categoryLabel);
        
        // Lets Create a Combo Box of Category
        String valCategory[] = {"General", "OBC", "SC", "ST", "Other"};
        category = new JComboBox(valCategory);
        category.setBounds(300, 190, 400, 30);
        category.setBackground(Color.WHITE);
        add(category);
        
        
        // This is the section of Income
         JLabel incomeLabel = new JLabel("Income :");
        incomeLabel.setFont(new Font("Raleway", Font.BOLD, 20));
        incomeLabel.setBounds(100, 240, 200, 30);
        add(incomeLabel);
        
        // Lets Create a Combo Box of Category
        String valIncome[] = {"Null", "< 1,50,000", "< 2,50,000", "< 5,00,000", "Upto 10,00,000"};
        income = new JComboBox(valIncome);
        income.setBounds(300, 240, 400, 30);
        income.setBackground(Color.WHITE);
        add(income);
        
      
        // This is the section of Education
        JLabel gender = new JLabel("Educational :");
        gender.setFont(new Font("Raleway", Font.BOLD, 20));
        gender.setBounds(100, 290, 200, 30);
        add(gender);
        
        // This is the section of Qualification
        JLabel email = new JLabel("Qualification :");
        email.setFont(new Font("Raleway", Font.BOLD, 20));
        email.setBounds(100, 315, 200, 30);
        add(email);
        
        // Lets Create a Combo Box of Education Qualification 
        String valeducationvalues[] = {"Non-Graducation", "Graducate", "Post - Graducation", "Doctrate", "Others"};
        education = new JComboBox(valeducationvalues);
        education.setBounds(300, 315, 400, 30);
        education.setBackground(Color.WHITE);
        add(education);
        
        
        // This is the section of Occupation
        JLabel marital = new JLabel("Occupation :");
        marital.setFont(new Font("Raleway", Font.BOLD, 20));
        marital.setBounds(100, 390, 200, 30);
        add(marital);
        
        // Lets Create a Combo Box of Education Qualification 
        String occupationValues[] = {"Salaried", "Self-Employed", "Bussiness", "Student", "Retired", "Others"};
        occupation = new JComboBox(occupationValues);
        occupation.setBounds(300, 390, 400, 30);
        occupation.setBackground(Color.WHITE);
        add(occupation);
        
      
        // This is the section of PAN Number
        JLabel address = new JLabel("PAN Number :");
        address.setFont(new Font("Raleway", Font.BOLD, 20));
        address.setBounds(100, 440, 200, 30);
        add(address);
        
        // Lets create a Text Field for PAN Number 
        pan = new JTextField();
        pan.setFont(new Font("Raleway", Font.BOLD, 14));
        pan.setBounds(300, 440, 400, 30);
        add(pan);
        
        
        // This is the section of Aadhar Number
        JLabel city = new JLabel("Aadhar Number :");
        city.setFont(new Font("Raleway", Font.BOLD, 20));
        city.setBounds(100, 490, 200, 30);
        add(city);
        
        // Lets create a Text Field for Aadhar Number
        aadhar = new JTextField();
        aadhar.setFont(new Font("Raleway", Font.BOLD, 14));
        aadhar.setBounds(300, 490, 400, 30);
        add(aadhar);
        
        
        // This is the section of Senior Citizen
        JLabel senior = new JLabel("Senior Citizen :");
        senior.setFont(new Font("Raleway", Font.BOLD, 20));
        senior.setBounds(100, 540, 200, 30);
        add(senior);
        
        // Lets create the Radio Buttons for Senior Citizen
        syes = new JRadioButton("Yes");
        syes.setBounds(300, 540, 60, 30);
        syes.setBackground(Color.WHITE);
        add(syes);
        
        sno = new JRadioButton("No");
        sno.setBounds(450, 540, 120, 30);
        sno.setBackground(Color.WHITE);
        add(sno);
        
        // As we are selecting senior citizen it will select both of them so we just need to create a buttonGroup Object
        ButtonGroup seniorgroup = new ButtonGroup();
        seniorgroup.add(syes);
        seniorgroup.add(sno);
        
        
        // This is the section of Existing Account 
        JLabel existing = new JLabel("Existing Account :");
        existing.setFont(new Font("Raleway", Font.BOLD, 20));
        existing.setBounds(100, 590, 200, 30);
        add(existing);
        
        // Lets create the Radio Buttons for Senior Citizen
        eyes = new JRadioButton("Yes");
        eyes.setBounds(300, 590, 60, 30);
        eyes.setBackground(Color.WHITE);
        add(eyes);
        
        eno = new JRadioButton("No");
        eno.setBounds(450, 590, 120, 30);
        eno.setBackground(Color.WHITE);
        add(eno);
        
        // As we are selecting senior citizen it will select both of them so we just need to create a buttonGroup Object
        ButtonGroup existinggroup = new ButtonGroup();
        existinggroup.add(eyes);
        existinggroup.add(eno);
        
        next = new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Ralway", Font.BOLD, 14));
        next.setBounds(620, 660, 80, 30);
        next.addActionListener(this);
        add(next);
        
        getContentPane().setBackground(Color.WHITE);
        
        setSize(850,800);
        setLocation(350, 10);
        setVisible(true);
    }
    
    // Abstact Method Override
    // ActionEvent ae is use to define what action you need to perform or on what component it is performaed 
    public void actionPerformed(ActionEvent ae){
        String formno = "" + random;                // Long (""+) -- it will conver it in string
        String sreligion = (String) religion.getSelectedItem();
        String scategory = (String) category.getSelectedItem();    
        String sincome = (String) income.getSelectedItem();    
        String seducation = (String) education.getSelectedItem();    
        String soccupation = (String) occupation.getSelectedItem();    
        String seniorcitizon = null;
        if (syes.isSelected()) {
            seniorcitizon = "Yes";
        }
        else if(sno.isSelected()){
            seniorcitizon = "No";
        }
        // String seniorcitizen = syes.isSelected() ? "Yes" : "No";
        
        String existingaccount = null;
        if (eyes.isSelected()) {
            existingaccount = "Yes";
        }
        else if(eno.isSelected()){
            existingaccount = "No";
        }
        // String existingaccount = eyes.isSelected() ? "Yes" : "No";
        
        String span = pan.getText();
        String saadhar = aadhar.getText();
        
        // For Database Hit we just need to use the exception Handling 
        try {
            if (span.equals("") || saadhar.equals("")) {
                JOptionPane.showMessageDialog(null,"All fields are required!");
            }
            else {
                Conn c = new Conn();                // We are trying to insert the data in MySql By using DDL or DML commands
                String query = "insert into signup values ('"+formno+"', '"+sreligion+"', '"+scategory+"', '"+sincome+"', '"+seducation+"', '"+soccupation+"', '"+span+"', '"+saadhar+"', '"+seniorcitizon+"', '"+existingaccount+"')";     
                c.s.executeUpdate(query);
                
                // Navigate to SignupThree (uncomment once implemented)
                // new SignupThree(formno).setVisible(true);
                // setVisible(false);
            }
        }
        catch (Exception e){
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "An error occurred!");
        }
    }
    
    public static void main(String[] args) {
        new SignupTwo("");
    }
}
