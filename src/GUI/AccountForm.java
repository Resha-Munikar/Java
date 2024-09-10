package GUI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AccountForm extends JFrame{
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
        JLabel lb4 = new JLabel("Country/Region *");
        lb4.setBounds(5,130,100,60);
        add(lb4);
        String[] countries = {"Nepal","India","China","Bhutan","Maldives","Australia","USA"};
        JComboBox<String> combo = new JComboBox<>(countries);
        combo.setBounds(120,150,300,30);
        add(combo);
        JLabel lb5 = new JLabel("Street Address *");
        lb5.setBounds(5,170,100,60);
        add(lb5);
        JTextField tf4 = new JTextField();
        tf4.setBounds(120,190,300,30);
        add(tf4);
        JLabel lb6 = new JLabel("Street Address 2");
        lb6.setBounds(5,210,100,60);
        add(lb6);
        JTextField tf5 = new JTextField();
        tf5.setBounds(120,230,300,30);
        add(tf5);
        JLabel lb7 = new JLabel("City *");
        lb7.setBounds(5,250,100,60);
        add(lb7);
        JTextField tf6 = new JTextField();
        tf6.setBounds(120,270,300,30);
        add(tf6);
        JLabel lb8 = new JLabel("State/Province *");
        lb8.setBounds(5,290,100,60);
        add(lb8);
        String[] province = {"Bagmati","Gandaki","Karnali","Koshi","Sudurpaschim"};
        JComboBox<String> provincebox = new JComboBox<>(province);
        provincebox.setBounds(120,310,220,30);
        add(provincebox);
        JLabel lb9 = new JLabel("Zip/Postal Code *");
        lb9.setBounds(5,330,100,60);
        add(lb9);
        JTextField tf7 = new JTextField();
        tf7.setBounds(120,350,100,30);
        add(tf7);
        JLabel lb10 = new JLabel("Only used for questions related to your order.");
        lb10.setBounds(120,390,270,15);
        add(lb10);
        JLabel lb11 = new JLabel("Phone Number *");
        lb11.setBounds(5,400,100,60);
        add(lb11);
        JTextField tf8 = new JTextField();
        tf8.setBounds(120,420,300,30);
        add(tf8);
        JButton btn3 = new JButton("Submit");
        btn3.setBounds(5,460,100,30);
        add(btn3);
        JTextArea info = new JTextArea();
        info.setBounds(5,500,400,200);
        add(info);
        info.setVisible(false);
        ActionListener obj = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                info.setVisible(true);
                if(jb1.isSelected()){
                    info.append("Account Type : " + jb1.getText() + "\n");
                }
                if(jb2.isSelected()){
                    info.append("Account Type : "+ jb2.getText()+ "\n");
                }
                info.append("First Name : " + tf2.getText()+ "\n");
                info.append("Last Name : " + tf3.getText()+ "\n");
                info.append("Country : " + combo.getSelectedItem()+ "\n");
                info.append("Street Address : " + tf4.getText()+ "\n");
                info.append("Street Address 2 : " + tf5.getText()+ "\n");
                info.append("City : " + tf6.getText()+ "\n");
                info.append("Province : " + provincebox.getSelectedItem()+ "\n");
                info.append("Zip/Postal Code : " + tf7.getText()+ "\n");
                info.append("Phone Number : " + tf8.getText()+ "\n");
            }
        };
        btn3.addActionListener(obj);
        setSize(900,900);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new AccountForm();
    }
}
