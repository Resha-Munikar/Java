package JDBC;
import java.sql.*;
public class DisplayPrepStmt {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/student";
            Connection con = DriverManager.getConnection(url,"root","root");
            String query = "select * from student";
            PreparedStatement preparedStatement = con.prepareStatement(query);
            ResultSet rs = preparedStatement.executeQuery();
            while(rs.next()){
                System.out.println(rs.getInt("Id")+" "+ rs.getString("Name")+" "+rs.getString("Email")+" "+rs.getInt("Semester"));
                System.out.println();
            }
            preparedStatement.close();
            con.close();
        }catch (Exception e){
            System.out.println("Error");
        }
    }
}
