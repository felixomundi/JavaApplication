
package javaapplication;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Database {
    public static Connection dbConnect() {
        try{
         Class.forName("com.mysql.cj.jdbc.Driver");
         Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java","root","");          
        return con;
        }
        catch(ClassNotFoundException ex){
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
           return null;
    }
}
    

