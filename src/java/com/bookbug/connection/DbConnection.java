
package com.bookbug.connection;


import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;



public class DbConnection{
    
    public Connection con;
    public ResultSet rs;
    public Statement st;
    
    public DbConnection()
    {
        try{
           Class.forName("com.mysql.jdbc.Driver"); 
        }
        catch(ClassNotFoundException ex){
            Logger.getLogger(DbConnection.class.getName()).log(Level.SEVERE,null,ex);
        }
        try{
            con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/bookbug1","root","root");
               // con=(Connection)DriverManager.getConnection("jdbc:mysql://sql202.epizy.com:3306/epiz_25956025_bookbug1","epiz_25956025","zeIglCzgvhjh");
        }
        catch(SQLException ex){
            Logger.getLogger(DbConnection.class.getName()).log(Level.SEVERE,null,ex);
        }
        
    }
}

