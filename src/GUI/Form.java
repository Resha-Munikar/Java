package GUI;

import javax.swing.*;
import java.awt.*;

public class Form {

    public static void main(String[] args) {
        // Create the frame
        JFrame frame = new JFrame("Account Form");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 550);

        // Create the panel to hold components
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(11, 2, 10, 10)); // 11 rows, 2 columns with spacing

        // Create components
        JLabel accountTypeLabel = new JLabel("Account Type *");
        JRadioButton personalAccount = new JRadioButton("Personal Account");
        JRadioButton businessAccount = new JRadioButton("Business Account");
        ButtonGroup accountTypeGroup = new ButtonGroup();
        accountTypeGroup.add(personalAccount);
        accountTypeGroup.add(businessAccount);
        personalAccount.setSelected(true); // Set default selection

        JLabel firstNameLabel = new JLabel("First Name *");
        JTextField firstNameField = new JTextField();

        JLabel lastNameLabel = new JLabel("Last Name *");
        JTextField lastNameField = new JTextField();

        JLabel countryLabel = new JLabel("Country/Region *");
        String[] countries = {"United States", "Canada", "Mexico"};
        JComboBox<String> countryBox = new JComboBox<>(countries);

        JLabel addressLabel = new JLabel("Street Address *");
        JTextField addressField = new JTextField();

        JLabel address2Label = new JLabel("Street Address 2");
        JTextField address2Field = new JTextField();

        JLabel cityLabel = new JLabel("City *");
        JTextField cityField = new JTextField();

        JLabel stateLabel = new JLabel("State/Province *");
        String[] states = {"Select State or Province", "California", "New York", "Texas"};
        JComboBox<String> stateBox = new JComboBox<>(states);

        JLabel zipLabel = new JLabel("ZIP/Postal Code *");
        JTextField zipField = new JTextField();

        JLabel phoneLabel = new JLabel("Phone Number *");
        JTextField phoneField = new JTextField();

        // Add components to panel
        panel.add(accountTypeLabel);
        panel.add(new JPanel()); // Empty placeholder
        panel.add(personalAccount);
        panel.add(businessAccount);
        panel.add(firstNameLabel);
        panel.add(firstNameField);
        panel.add(lastNameLabel);
        panel.add(lastNameField);
        panel.add(countryLabel);
        panel.add(countryBox);
        panel.add(addressLabel);
        panel.add(addressField);
        panel.add(address2Label);
        panel.add(address2Field);
        panel.add(cityLabel);
        panel.add(cityField);
        panel.add(stateLabel);
        panel.add(stateBox);
        panel.add(zipLabel);
        panel.add(zipField);
        panel.add(phoneLabel);
        panel.add(phoneField);

        // Add panel to frame
        frame.add(panel);
        frame.setVisible(true);
    }
}

