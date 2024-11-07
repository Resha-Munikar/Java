package Eventhandling;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class SwapSquareDemo extends JFrame implements ActionListener{
    JTextField tf1,tf2;
    JButton btn1,btn2;
    SwapSquareDemo(){
        setLayout(null);
        tf1 = new JTextField();
        tf1.setBounds(10,20,100,30);
        add(tf1);
        tf2 = new JTextField();
        tf2.setBounds(10,60,100,30);
        add(tf2);
        btn1 = new JButton("Swap");
        btn1.setBounds(10,100,100,30);
        btn1.addActionListener(this);
        add(btn1);
        btn2 = new JButton("Square");
        btn2.setBounds(130,100,100,30);
        btn2.addActionListener(this);
        add(btn2);
        setSize(300,300);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }
    public static void main(String[] args) {
        new SwapSquareDemo();
    }
    public void actionPerformed(ActionEvent e){
        try{
            int num1,num2;
            num1 = Integer.parseInt(tf1.getText());
            num2 = Integer.parseInt(tf2.getText());
            if(e.getSource() == btn1){
                int temp = num1;
                num1 = num2;
                num2 = temp;
                tf1.setText(String.valueOf(num1));
                tf2.setText(String.valueOf(num2));
            }
            else{
                tf1.setText(String.valueOf(num1*num1));
                tf2.setText(String.valueOf(num2*num2));
            }
        }catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(this,"Invalid input.");
        }
    }
}
