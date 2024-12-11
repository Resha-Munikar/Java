package JDBC;
import java.sql.*;
public class DisplayDemo {
    public static void main(String[] args) {
        try {
            String url = "jdbc:mysql://localhost:3306/STUDENTS";
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, "root", "Bri$ti1010");
            Statement statement = con.createStatement();
            String query = "SELECT * FROM student"; // Define the query as a String
            ResultSet resultSet = statement.executeQuery(query); // Pass the query variable
            while (resultSet.next()) {
                System.out.print(resultSet.getInt("id") + " ");
                System.out.print(resultSet.getString("name") + " ");
                System.out.print(resultSet.getString("email") + " ");
                System.out.print(resultSet.getInt("Semester") + "\n");
            }
        } catch (Exception e) {
            System.out.println("Error");
        }
    }
}