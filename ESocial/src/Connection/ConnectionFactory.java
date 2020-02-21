
package Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class ConnectionFactory {
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String URL ="jdbc:mysql://localhost:3306/dbfuncionarios?useTimezone=true&serverTimezone=UTC";
    private static final String USER ="root";
    private static final String PASS ="";
    
    public Connection getConnection (){
        try {
            Class.forName(DRIVER);
        } catch (ClassNotFoundException ex) {
            System.err.println("#Erro na função ClassforName()!!!");
        }
        
        try {
            
            return DriverManager.getConnection(URL,USER,PASS);
        } catch (SQLException e) {
            throw new RuntimeException(e+"Erro na função DriverManager.getConnection(URL,USER,PASS)!!!");
        }
    }
    
    
}
