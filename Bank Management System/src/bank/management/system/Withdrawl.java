package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Withdrawl extends JFrame implements ActionListener {

    JTextField amountField;
    JButton withdrawButton, backButton;
    String pin;

    Withdrawl(String pin) {
        this.pin = pin;

        setLayout(null);

        JLabel text = new JLabel("Enter Amount You Want To Withdraw");
        text.setFont(new Font("Raleway", Font.BOLD, 22));
        text.setBounds(170, 50, 400, 30);
        add(text);

        amountField = new JTextField();
        amountField.setFont(new Font("Raleway", Font.BOLD, 22));
        amountField.setBounds(170, 100, 320, 25);
        add(amountField);

        withdrawButton = new JButton("Withdraw");
        withdrawButton.setBounds(355, 150, 150, 30);
        withdrawButton.addActionListener(this);
        add(withdrawButton);

        backButton = new JButton("Back");
        backButton.setBounds(355, 200, 150, 30);
        backButton.addActionListener(this);
        add(backButton);

        getContentPane().setBackground(Color.WHITE);

        setSize(800, 600);
        setLocation(300, 200);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == withdrawButton) {
            String amount = amountField.getText();
            String date = new java.util.Date().toString();  // or use a specific format
            String type = "Withdraw";
            String mode = "Cash";  // Assuming a default value, you can modify as needed

            if (amount.equals("")) {
                JOptionPane.showMessageDialog(null, "Please enter the amount to withdraw");
            } else {
                try {
                    Conn c1 = new Conn();

                    // Check the current balance
                    ResultSet rs = c1.s.executeQuery("SELECT SUM(CASE WHEN type = 'Deposit' THEN amount WHEN type = 'Withdraw' THEN -amount ELSE 0 END) AS balance FROM bank WHERE pin = '" + pin + "'");
                    
                    int balance = 0;
                    if (rs.next()) {
                        balance = rs.getInt("balance");
                    }

                    int withdrawAmount = Integer.parseInt(amount);
                    
                    if (balance >= withdrawAmount) {
                        // Perform the withdrawal
                        String query = "INSERT INTO bank (pin, date, type, amount, mode) VALUES ('" + pin + "', '" + date + "', '" + type + "', '" + amount + "', '" + mode + "')";
                        c1.s.executeUpdate(query);
                        JOptionPane.showMessageDialog(null, "Rs. " + amount + " Withdrawn Successfully");
                        setVisible(false);
                        new Transactions(pin).setVisible(true);
                    } else {
                        JOptionPane.showMessageDialog(null, "Insufficient Balance");
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } else if (ae.getSource() == backButton) {
            setVisible(false);
            new Transactions(pin).setVisible(true);
        }
    }

    public static void main(String[] args) {
        new Withdrawl("").setVisible(true);
    }
}
