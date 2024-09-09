package Eventhandling;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionEventDemo extends JFrame {
    ActionEventDemo(){
        setLayout(null);
        JLabel l1 = new JLabel("Number 1");
        l1.setBounds(40,40,150,30);
        add(l1);
        JTextField tf1 = new JTextField();
        tf1.setBounds(130,40,150,30);
        add(tf1);
        JLabel l2 = new JLabel("Number 2");
        l2.setBounds(40,80,150,30);
        add(l2);
        JTextField tf2 = new JTextField();
        tf2.setBounds(130,80,150,30);
        add(tf2);
        JButton button = new JButton("Sum");
        button.setBounds(40,120,80,30);
        add(button);
        JTextField tf3 = new JTextField();
        tf3.setBounds(130,120,150,30);
        add(tf3);
        ActionListener obj = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int sum = 0, num1 =0, num2 =0;
                    num1 = Integer.parseInt(tf1.getText());
                    num2 = Integer.parseInt(tf2.getText());
                    sum = num1 + num2;
                    tf3.setText(String.valueOf(sum));
                }catch(NumberFormatException ex){
                    System.out.println("Invalid input.");
                }
            }
        };
        button.addActionListener(obj);
        setSize(400,400);
        setVisible(true);
        setDefaultCloseOperation((EXIT_ON_CLOSE));
    }
    public static void main(String[] args) {
        new ActionEventDemo();
    }
}
