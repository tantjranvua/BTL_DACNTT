/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CSDL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author tantanmanh
 */
public class tbUser {
    public boolean Kiemtra(String u, String p)
    {
        boolean ketqua = false;
        Connection cnn = Database.KetnoiCSDL();
        if(cnn!=null)
        {
            String sql = "SELECT * FROM tblUser WHERE user = ? and password = ?";
            try {
                PreparedStatement stm = cnn.prepareStatement(sql);
                stm.setString(1, u);
                stm.setString(2, p);
//                System.out.print(stm);
                ResultSet rs = stm.executeQuery();
                if(rs.next()){
                    ketqua = true;
                }
            } catch (SQLException ex) {
                ketqua = false;
//                Logger.getLogger(tbLophoc.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        return ketqua;
    }
}
