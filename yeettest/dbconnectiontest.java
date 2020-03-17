import java.util.Scanner;
import java.sql.*;

public class dbconnectiontest
{
    public static void main(String[] args)
    {
         try
         {
         
             Class.forName("com.mysql.jdbc.Driver");
             Connection con = DriverManager.getConnection("jdbc:mysql://10.1.63.200/CUNT", "1805617","1805617");
             Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM TEST_TABLE");
             
             while(rs.next())
             {
                 System.out.println(rs.getString(1));
                 System.out.println("YEET");
                 con.close();
             }
             
         }catch (Exception e) {System.out.println(e);}
    }
}
