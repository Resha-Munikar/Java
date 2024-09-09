package Eventhandling;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class ClearDemo extends JFrame implements ActionListener{
    JTextField tf1, tf2, tf3;
    JButton btn1, btn2;
    ClearDemo(){
        setLayout(null);
        tf1 = new JTextField();
        tf1.setBounds(30,40,100,30);
        add(tf1);
        tf2 = new JTextField();
        tf2.setBounds(30,80,100,30);
        add(tf2);
        tf3 = new JTextField();
        tf3.setBounds(30,120,100,30);
        add(tf3);
        btn1 = new JButton("Add");
        btn1.setBounds(30,160,100,30);
        btn1.setActionCommand("add");
        btn1.addActionListener(this);
        add(btn1);
        btn2 = new JButton("Clear");
        btn2.setBounds(30,200,100,30);
        btn2 .setActionCommand("clear");
        btn2.addActionListener(this);
        add(btn2);
        setSize(400,400);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new ClearDemo();
    }
    public void actionPerformed(ActionEvent e){
        String command = e.getActionCommand();
        if(command.equals("add")){
            int num1 = Integer.parseInt(tf1.getText());
            int num2 = Integer.parseInt(tf2.getText());
            int sum = num1 + num2;
            tf3.setText(String.valueOf(sum));
        }
        else{
            tf3.setText("");
        }
    }
}


