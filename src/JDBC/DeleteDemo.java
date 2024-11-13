package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DeleteDemo {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/student";
            Connection con = DriverManager.getConnection(url,"root","root");
            Statement statement = con.createStatement();
            String q = "delete from student where semester <5";
            statement.executeUpdate(q);
            System.out.println("Records deleted successfully.");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
