package Lab5;
import javax.swing.*;
import java.awt.*;
public class NotepadDemo extends JFrame{
    NotepadDemo(){
        setLayout(new BorderLayout());
        setTitle("Notepad");
        JMenuBar mb = new JMenuBar();
        JMenu m1 = new JMenu("File");
        mb.add(m1);
        JMenu m2 = new JMenu("Edit");
        mb.add(m2);
        JMenu m3 = new JMenu("View");
        mb.add(m3);
        JMenu m4 = new JMenu("Help");
        mb.add(m4);
        JMenuItem i6 = new JMenuItem("New");
        m1.add(i6);
        JMenuItem i7 = new JMenuItem("Open");
        m1.add(i7);
        JMenuItem i8 = new JMenuItem("Save");
        m1.add(i8);
        JMenuItem i9 = new JMenuItem("Save as");
        m1.add(i9);
        setJMenuBar(mb);
        JMenuItem i10 = new JMenuItem("Cut");
        m2.add(i10);
        JMenuItem i11 = new JMenuItem("Copy");
        m2.add(i11);
        JMenuItem i12 = new JMenuItem("Paste");
        m2.add(i12);
        JMenuItem i13 = new JMenuItem("Delete");
        m2.add(i13);
        JMenuItem i14 = new JMenuItem("Zoom");
        m3.add(i14);
        JMenuItem i15 = new JMenuItem("Word wrap");
        m3.add(i15);
        JMenuItem i16 = new JMenuItem("Status bar");
        m3.add(i16);
        JMenuItem i19 = new JMenuItem("View help");
        m4.add(i19);
        JMenuItem i20 = new JMenuItem("Send feedback");
        m4.add(i20);
        JTextArea a = new JTextArea();
        JScrollPane sp = new JScrollPane(a);
        sp.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        add(sp,BorderLayout.CENTER);
        setJMenuBar(mb);
        setSize(400,400);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new NotepadDemo();
    }
}

