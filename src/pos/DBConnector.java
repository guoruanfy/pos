/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pos;

import java.sql.Connection;
import java.sql.DriverManager;


/**
 *
 * @author fangyuan01
 */
public class DBConnector {

    private static Connection connection = null;

    public static Connection getConnection() {
        if(connection == null) {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/pos?useUnicode=true&characterEncoding=utf-8","root","password");
          
            } catch(Exception e) {
                System.err.println(e.getMessage());
            }
        }
        return connection;
    }
    
}
