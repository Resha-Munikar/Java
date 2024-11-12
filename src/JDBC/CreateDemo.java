package JDBC;
import java.sql.*;
public class CreateDemo {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/student";
            Connection con = DriverManager.getConnection(url,"root","root");
            Statement statement = con.createStatement();
            String q ="create table Student (Id int, Name varchar(40), Email varchar(100), Semester int)";
            statement.executeUpdate(q);
            System.out.println("Table created in database");
            con.close();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
