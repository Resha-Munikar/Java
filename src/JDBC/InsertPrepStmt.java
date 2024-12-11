package JDBC;

import java.sql.*;
public class InsertPrepStmt {
    public static void main(String[] args) {
        try {
            String url = "jdbc:mysql://localhost:3306/student"; // Database URL
            Class.forName("com.mysql.cj.jdbc.Driver"); // Load MySQL JDBC Driver
            Connection con = DriverManager.getConnection(url, "root", "root"); // Establish connection
            String query = "INSERT INTO student (id, name, email, semester) VALUES (?, ?, ?, ?)";
            PreparedStatement preparedStatement = con.prepareStatement(query);
            preparedStatement.setInt(1, 5); // ID
            preparedStatement.setString(2, "Sita"); // Name
            preparedStatement.setString(3, "sita@gmail.com"); // Email
            preparedStatement.setInt(4, 1); // Semester
            preparedStatement.executeUpdate();

            preparedStatement.setInt(1, 6); // ID
            preparedStatement.setString(2, "Shyam"); // Name
            preparedStatement.setString(3, "shyam@gmail.com"); // Email
            preparedStatement.setInt(4, 1); // Semester
            preparedStatement.executeUpdate();

            preparedStatement.setInt(1, 7); // ID
            preparedStatement.setString(2, "Alka"); // Name
            preparedStatement.setString(3, "alka@gmail.com"); // Email
            preparedStatement.setInt(4, 5); // Semester
            preparedStatement.executeUpdate();
            System.out.println(" record inserted successfully."); // Print success message
        } catch (Exception e) {
            e.printStackTrace(); // Print the error stack trace
        }
    }
}