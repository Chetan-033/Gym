
package project;
import java.sql.*;
/**
 *
 * @author chetan_nerkar
 */
public class ConnectionProvider {
    public static Connection getCon()
    {
       try
       {
          //Class.forName("org.postgresql.Driver");
          //Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/gms","postgres","G@y@tri@1402");
           Class.forName("con.mysql.cj.jdbc.Driver");
           Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/gym","root","root");
           return con;
       }
       catch(Exception e)
       {     
        return null;
       }
    }
}
