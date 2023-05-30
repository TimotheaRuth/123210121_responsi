/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author ASUS
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Connector {
    public Connection connection;
    public Statement statement;
    static final String JDBC_DRIVER="com.mysql.cj.jdbc.Driver";
    static final String DB_URL="jdbc:mysql://localhost/responsi";
    static final String USER="root";
    static final String PASS="";

    public Connector() {
        try{
            Class.forName(JDBC_DRIVER);
            connection = (java.sql.Connection) DriverManager.getConnection(DB_URL, USER, PASS);
            System.out.println("Connected Successfully!");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Connection Failed!");
        }
    }
    
    
}
