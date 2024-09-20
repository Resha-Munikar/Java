package Eventhandling;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.lang.reflect.Field;
public class SetColor extends JFrame implements ActionListener{
    JLabel l1,l2;
    JTextField tf1;
    JButton btn1;
    SetColor(){
        setLayout(null);
        l1 = new JLabel("Enter a colour name : ");
        l1.setBounds(10,20,160,30);
        add(l1);
        tf1 = new JTextField();
        tf1.setBounds(180,20,100,30);
        add(tf1);
        btn1 = new JButton("Click");
        btn1.setBounds(10,60,100,30);
        add(btn1);
        btn1.addActionListener(this);
        l2 = new JLabel();
        l2.setBounds(10,100,200,30);
        add(l2);
        setSize(400,400);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new SetColor();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String colorName = tf1.getText().toLowerCase();
        try {
            // Use reflection to convert color name to actual Color object
            Field field = Class.forName("java.awt.Color").getField(colorName);
            Color color = (Color) field.get(null);

            // Set the text color in the JTextField to the selected color
            tf1.setForeground(color);
            l2.setText("Text color changed to " + colorName);
        } catch (Exception ex) {
            // If color name is invalid, show error message
            l2.setText("Invalid color. Try again.");
            tf1.setForeground(Color.BLACK);
        }
    }
}
