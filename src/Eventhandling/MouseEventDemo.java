package Eventhandling;
import javax.swing.*;
import java.awt.event.*;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MouseEventDemo extends JFrame{
    MouseEventDemo(){
        setLayout(new FlowLayout());
        JButton btn1 = new JButton("Click Me");
        btn1.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                System.out.println("Pressed");
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                System.out.println("Released");
            }

            @Override
            public void mouseExited(MouseEvent e) {
                System.out.println("Exited");
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                System.out.println("Entered");
            }
        });
        add(btn1);
        setSize(300,300);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new MouseEventDemo();
    }
}
