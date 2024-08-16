package bank.management.system;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class Pin extends JFrame implements ActionListener {

    JPasswordField t1, t2, t3;
    JButton b1, b2;
    JLabel l1, l2, l3, l4;
    String pin;

    Pin(String pin) {
        this.pin = pin;

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1000, 1180, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l5 = new JLabel(i3);
        l5.setBounds(0, 0, 960, 1080);
        add(l5);

        l1 = new JLabel("CHANGE YOUR PIN");
        l1.setFont(new Font("System", Font.BOLD, 16));
        l1.setForeground(Color.WHITE);

        l2 = new JLabel("Current PIN:");
        l2.setFont(new Font("System", Font.BOLD, 16));
        l2.setForeground(Color.WHITE);

        l3 = new JLabel("New PIN:");
        l3.setFont(new Font("System", Font.BOLD, 16));
        l3.setForeground(Color.WHITE);

        l4 = new JLabel("Re-Enter New PIN:");
        l4.setFont(new Font("System", Font.BOLD, 16));
        l4.setForeground(Color.WHITE);

        t1 = new JPasswordField();
        t1.setFont(new Font("Raleway", Font.BOLD, 25));

        t2 = new JPasswordField();
        t2.setFont(new Font("Raleway", Font.BOLD, 25));

        t3 = new JPasswordField();
        t3.setFont(new Font("Raleway", Font.BOLD, 25));

        b1 = new JButton("SAVE");
        b2 = new JButton("BACK");

        b1.addActionListener(this);
        b2.addActionListener(this);

        setLayout(null);

        l1.setBounds(280, 330, 800, 35);
        l5.add(l1);

        l2.setBounds(180, 390, 150, 35);
        l5.add(l2);

        l3.setBounds(180, 440, 150, 35);
        l5.add(l3);

        l4.setBounds(180, 490, 200, 35);
        l5.add(l4);

        t1.setBounds(350, 390, 180, 25);
        l5.add(t1);

        t2.setBounds(350, 440, 180, 25);
        l5.add(t2);

        t3.setBounds(350, 490, 180, 25);
        l5.add(t3);

        b1.setBounds(390, 588, 150, 35);
        l5.add(b1);

        b2.setBounds(390, 633, 150, 35);
        l5.add(b2);

        setSize(960, 1080);
        setUndecorated(true);
        setLocation(500, 0);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        try {
            String a = t1.getText();
            String b = t2.getText();
            String c = t3.getText();

            if (!b.equals(c)) {
                JOptionPane.showMessageDialog(null, "Entered PIN does not match");
                return;
            }

            if (ae.getSource() == b1) {
                Conn c1 = new Conn();
                String q1 = "update bank set pin = '" + b + "' where pin = '" + a + "' ";
                String q2 = "update login set pin = '" + b + "' where pin = '" + a + "' ";
                String q3 = "update signup3 set pin = '" + b + "' where pin = '" + a + "' ";

                c1.s.executeUpdate(q1);
                c1.s.executeUpdate(q2);
                c1.s.executeUpdate(q3);

                JOptionPane.showMessageDialog(null, "PIN changed successfully");

                setVisible(false);
                new Transactions(b).setVisible(true);
            } else if (ae.getSource() == b2) {
                setVisible(false);
                new Transactions(pin).setVisible(true);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Pin("").setVisible(true);
    }
}
