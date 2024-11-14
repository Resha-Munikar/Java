package JDBC;

import java.sql.*;

public class UpdateDemo {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/student";
            Connection con = DriverManager.getConnection(url,"root","root");
            Statement statement = con.createStatement();
            String q = "update student set semester=5 where semester=4";
            System.out.println("Records updates successfully");
            statement.executeUpdate(q);
            statement.close();
            con.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
