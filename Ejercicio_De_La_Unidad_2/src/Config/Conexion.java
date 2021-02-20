
package Config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


public class Conexion {
    private Connection connect = null;

    Connection con;

    public Conexion(){

        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/app", "root", "");
        }catch (Exception e){

        }
    }

    public Connection getConnection(){
        return con;
    }  

    public Statement createStatement() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
