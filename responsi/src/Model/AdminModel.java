/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author ASUS
 */
import View.AdminPageView;
import java.sql.*;
import javax.swing.JOptionPane;

public class AdminModel extends Connector {
    public void deleteData(Data d){
        String query=DELETE from responsi WHERE name='"+d.get+"'
    }
}
