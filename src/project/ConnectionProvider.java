/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;
import java.sql.*;

/**
 *
 * @author 91814
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
