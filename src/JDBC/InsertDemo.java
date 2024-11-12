package JDBC;
import java.sql.*;
public class InsertDemo {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/student";
            Connection con = DriverManager.getConnection(url, "root", "root");
            Statement stmt = con.createStatement();
            String a = ("insert into student values (1,'Resha','resa.munikar@gmail.com',4)");
            stmt.executeUpdate(a);
            String b = ("insert into student values (2,'Aakash','aakash7@gmail.com',4)");
            stmt.executeUpdate(b);
            String c = ("insert into student values (3,'Rashika','rashika1.munikar@gmail.com',4)");
            stmt.executeUpdate(c);
            String d = ("insert into student values (4,'Deepa','deepa123@gmail.com',4)");
            stmt.executeUpdate(d);
            String e = ("insert into student values (5,'Laxmi','laxmi10@gmail.com',4)");
            stmt.executeUpdate(e);
            System.out.println("Records inserted successfully");
            stmt.close();
            con.close();;
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
