package GUI;
import javax.imageio.stream.ImageInputStream;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class AccountForm extends JFrame {
    AccountForm() {
        setLayout(null);
        JLabel l1 = new JLabel("Account Type *");
        l1.setBounds(5,10,100,60);
        add(l1);
        JRadioButton jb1 = new JRadioButton("Personal Account");
        jb1.setBounds(120,10,150,60);
        JRadioButton jb2 = new JRadioButton("Business Account");
        jb2.setBounds(290,10,150,60);
        ButtonGroup btngroup = new ButtonGroup();
        btngroup.add(jb1);
        btngroup.add(jb2);
        add(jb1);
        add(jb2);
        JLabel lb2 = new JLabel("First name *");
        lb2.setBounds(5,50,100,60);
        add(lb2);
        JTextField tf2 = new JTextField();
        tf2.setBounds(120,70,300,30);
        add(tf2);
        JLabel lb3 = new JLabel("Last name *");
        lb3.setBounds(5,90,100,60);
        add(lb3);
        JTextField tf3 = new JTextField();
        tf3.setBounds(120,110,300,30);
        add(tf3);
        setSize(500,500);
        setVisible(true);
    }

    public static void main(String[] args) {
        new AccountForm();
    }
}
