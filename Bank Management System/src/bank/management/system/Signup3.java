package bank.management.system;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import java.util.*;

public class Signup3 extends JFrame implements ActionListener {

    JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9, l10, l11, l12;
    JRadioButton r1, r2, r3, r4;
    JButton b1, b2;
    JCheckBox c1, c2, c3, c4, c5, c6, c7;
    String formno;

    Signup3(String formno) {
        this.formno = formno;
        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 3");

        // Main panel to hold all components
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new GridBagLayout());  // Using GridBagLayout for flexible component placement
        mainPanel.setBackground(Color.WHITE);

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.anchor = GridBagConstraints.NORTHWEST;

        // Adding components to the mainPanel with appropriate constraints
        int y = 0;  // To keep track of grid y position

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l14 = new JLabel(i3);
        gbc.gridx = 0;
        gbc.gridy = y;
        gbc.gridwidth = 2;
        mainPanel.add(l14, gbc);

        l1 = new JLabel("Page 3: Account Details");
        l1.setFont(new Font("Raleway", Font.BOLD, 22));
        gbc.gridy = ++y;
        gbc.gridwidth = 2;
        mainPanel.add(l1, gbc);

        l2 = new JLabel("Account Type:");
        l2.setFont(new Font("Raleway", Font.BOLD, 18));
        gbc.gridy = ++y;
        gbc.gridwidth = 1;
        mainPanel.add(l2, gbc);

        r1 = new JRadioButton("Saving Account");
        r1.setFont(new Font("Raleway", Font.BOLD, 16));
        r1.setBackground(Color.WHITE);
        gbc.gridx = 1;
        mainPanel.add(r1, gbc);

        r2 = new JRadioButton("Fixed Deposit Account");
        r2.setFont(new Font("Raleway", Font.BOLD, 16));
        r2.setBackground(Color.WHITE);
        gbc.gridy = ++y;
        gbc.gridx = 1;
        mainPanel.add(r2, gbc);

        r3 = new JRadioButton("Current Account");
        r3.setFont(new Font("Raleway", Font.BOLD, 16));
        r3.setBackground(Color.WHITE);
        gbc.gridy = ++y;
        gbc.gridx = 1;
        mainPanel.add(r3, gbc);

        r4 = new JRadioButton("Recurring Deposit Account");
        r4.setFont(new Font("Raleway", Font.BOLD, 16));
        r4.setBackground(Color.WHITE);
        gbc.gridy = ++y;
        gbc.gridx = 1;
        mainPanel.add(r4, gbc);

        ButtonGroup groupgender = new ButtonGroup();
        groupgender.add(r1);
        groupgender.add(r2);
        groupgender.add(r3);
        groupgender.add(r4);

        l3 = new JLabel("Card Number:");
        l3.setFont(new Font("Raleway", Font.BOLD, 18));
        gbc.gridx = 0;
        gbc.gridy = ++y;
        gbc.gridwidth = 1;
        mainPanel.add(l3, gbc);

        l4 = new JLabel("XXXX-XXXX-XXXX-4184");
        l4.setFont(new Font("Raleway", Font.BOLD, 18));
        gbc.gridx = 1;
        mainPanel.add(l4, gbc);

        l5 = new JLabel("(Your 16-digit Card number)");
        l5.setFont(new Font("Raleway", Font.BOLD, 12));
        gbc.gridy = ++y;
        mainPanel.add(l5, gbc);

        l6 = new JLabel("It would appear on ATM Card/Cheque Book and Statements");
        l6.setFont(new Font("Raleway", Font.BOLD, 12));
        gbc.gridy = ++y;
        mainPanel.add(l6, gbc);

        l7 = new JLabel("PIN:");
        l7.setFont(new Font("Raleway", Font.BOLD, 18));
        gbc.gridx = 0;
        gbc.gridy = ++y;
        mainPanel.add(l7, gbc);

        l8 = new JLabel("XXXX");
        l8.setFont(new Font("Raleway", Font.BOLD, 18));
        gbc.gridx = 1;
        mainPanel.add(l8, gbc);

        l9 = new JLabel("(4-digit password)");
        l9.setFont(new Font("Raleway", Font.BOLD, 12));
        gbc.gridy = ++y;
        mainPanel.add(l9, gbc);

        l10 = new JLabel("Services Required:");
        l10.setFont(new Font("Raleway", Font.BOLD, 18));
        gbc.gridx = 0;
        gbc.gridy = ++y;
        mainPanel.add(l10, gbc);

        c1 = new JCheckBox("ATM CARD");
        c1.setBackground(Color.WHITE);
        c1.setFont(new Font("Raleway", Font.BOLD, 16));
        gbc.gridx = 1;
        mainPanel.add(c1, gbc);

        c2 = new JCheckBox("Internet Banking");
        c2.setBackground(Color.WHITE);
        c2.setFont(new Font("Raleway", Font.BOLD, 16));
        gbc.gridy = ++y;
        mainPanel.add(c2, gbc);

        c3 = new JCheckBox("Mobile Banking");
        c3.setBackground(Color.WHITE);
        c3.setFont(new Font("Raleway", Font.BOLD, 16));
        gbc.gridy = ++y;
        mainPanel.add(c3, gbc);

        c4 = new JCheckBox("EMAIL Alerts");
        c4.setBackground(Color.WHITE);
        c4.setFont(new Font("Raleway", Font.BOLD, 16));
        gbc.gridy = ++y;
        mainPanel.add(c4, gbc);

        c5 = new JCheckBox("Cheque Book");
        c5.setBackground(Color.WHITE);
        c5.setFont(new Font("Raleway", Font.BOLD, 16));
        gbc.gridy = ++y;
        mainPanel.add(c5, gbc);

        c6 = new JCheckBox("E-Statement");
        c6.setBackground(Color.WHITE);
        c6.setFont(new Font("Raleway", Font.BOLD, 16));
        gbc.gridy = ++y;
        mainPanel.add(c6, gbc);

        c7 = new JCheckBox("I hereby declare that the above entered details are correct to the best of my knowledge.", true);
        c7.setBackground(Color.WHITE);
        c7.setFont(new Font("Raleway", Font.BOLD, 12));
        gbc.gridy = ++y;
        gbc.gridwidth = 2;
        mainPanel.add(c7, gbc);

        b1 = new JButton("Submit");
        b1.setFont(new Font("Raleway", Font.BOLD, 14));
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        gbc.gridy = ++y;
        gbc.gridx = 0;
        gbc.gridwidth = 1;
        mainPanel.add(b1, gbc);

        b2 = new JButton("Cancel");
        b2.setFont(new Font("Raleway", Font.BOLD, 14));
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        gbc.gridx = 1;
        mainPanel.add(b2, gbc);

        // Create JScrollPane with the mainPanel
        JScrollPane scrollPane = new JScrollPane(mainPanel, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        scrollPane.getVerticalScrollBar().setUnitIncrement(16); // Adjust scrolling speed

        // Set the JFrame's content pane to the scroll pane
        setContentPane(scrollPane);

        // Set window properties
        setSize(850, 850);
        setLocation(500, 120);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        b1.addActionListener(this);
        b2.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae) {
        String atype = null;
        if (r1.isSelected()) {
            atype = "Saving Account";
        } else if (r2.isSelected()) {
            atype = "Fixed Deposit Account";
        } else if (r3.isSelected()) {
            atype = "Current Account";
        } else if (r4.isSelected()) {
            atype = "Recurring Deposit Account";
        }

        Random ran = new Random();
        long first7 = (ran.nextLong() % 90000000L) + 5040936000000000L;
        String cardno = "" + Math.abs(first7);

        long first3 = (ran.nextLong() % 9000L) + 1000L;
        String pin = "" + Math.abs(first3);

        String facility = "";
        if (c1.isSelected()) {
            facility = facility + " ATM Card";
        }
        if (c2.isSelected()) {
            facility = facility + " Internet Banking";
        }
        if (c3.isSelected()) {
            facility = facility + " Mobile Banking";
        }
        if (c4.isSelected()) {
            facility = facility + " EMAIL Alerts";
        }
        if (c5.isSelected()) {
            facility = facility + " Cheque Book";
        }
        if (c6.isSelected()) {
            facility = facility + " E-Statement";
        }

        try {
            if (atype == null) {
                JOptionPane.showMessageDialog(null, "Fill all the required fields");
            } else {
                Conn c1 = new Conn();
                String q1 = "insert into signup3 values('" + formno + "','" + atype + "','" + cardno + "','" + pin + "','" + facility + "')";
                String q2 = "insert into login values('" + formno + "','" + cardno + "','" + pin + "')";
                c1.s.executeUpdate(q1);
                c1.s.executeUpdate(q2);

                JOptionPane.showMessageDialog(null, "Card Number: " + cardno + "\n Pin:" + pin);

                new Deposit(pin).setVisible(true);
                setVisible(false);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Signup3("").setVisible(true);
    }
}
