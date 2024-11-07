package Eventhandling;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class LoginForm extends JFrame implements ActionListener{
    JLabel l1,l2;
    JTextField tf1;
    JPasswordField tf2;
    JButton btn1;
    LoginForm(){
        setTitle("Login Form");
        setLayout(new GridLayout(3,2));
        l1 = new JLabel("Username *");
        l2 = new JLabel("Password *");
        tf1 = new JTextField(15);
        tf2 = new JPasswordField(15);
        btn1 = new JButton("Login");
        btn1.addActionListener(this);
        add(l1);
        add(tf1);
        add(l2);
        add(tf2);
        add(btn1);
        setSize(350,150);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new LoginForm();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String username = tf1.getText();
        String password = tf2.getText();
        if(username.isEmpty() || password.isEmpty()){
            JOptionPane.showMessageDialog(this,"Please fill all the required field marked as *","Error",JOptionPane.ERROR_MESSAGE);
        }
        else{
            JOptionPane.showMessageDialog(this,"Login successful","Success",JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
