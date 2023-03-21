/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CSDL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author tantanmanh
 */
public class Database {
    static String user = "root";
    static String pass = "";
    static String url = "jdbc:mysql://localhost:3306/QLSV?useUnicode=true&characterEncoding=utf8";
    public static Connection KetnoiCSDL()
    {
        Connection cnn = null;
        try {
            cnn = DriverManager.getConnection(url, user, pass);
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Lỗi Kết nối CSDL");
        }
        return cnn;
    }
}
