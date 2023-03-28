/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CSDL;

import Models.clsMon;
import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author tantanmanh
 */
public class tbMon {
    public Vector<clsMon> LayDSBangDiem()
    {
        Vector<clsMon> dsmon = new Vector<clsMon>();
        Connection cnn = Database.KetnoiCSDL();
        if(cnn!=null)
        {
            String sql = "SELECT * FROM tblBangdiem";
            try {
                Statement stm = cnn.createStatement();
                ResultSet rs = stm.executeQuery(sql);
                while(rs.next())//duyệt từng bản ghi kết quả select
                {
                    clsMon mon = new clsMon();
                    mon.tenMon = rs.getString("Msv");
                    mon.idMon = rs.getString("idMon");
                    dsmon.add(mon);// Cần override hàm to_String tại class models.Lop
                }
            } catch (SQLException ex) {
                Logger.getLogger(tbLop.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        return dsmon;
    }
    public clsMon LayMon(String idMon)
    {
        clsMon mon = new clsMon();
        Connection cnn = Database.KetnoiCSDL();
        if(cnn!=null)
        {
            String sql = "SELECT * FROM tblMon WHERE idMon = ?";
            try {
                PreparedStatement stm = (PreparedStatement) cnn.prepareStatement(sql);
                stm.setString(1, idMon);
                ResultSet rs = stm.executeQuery();
                while(rs.next())//duyệt từng bản ghi kết quả select
                {
                    mon.idMon = rs.getString("idMon");
                    mon.tenMon = rs.getString("tenMon");
                }
            } catch (SQLException ex) {
                Logger.getLogger(tbLop.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        return mon;
    }
}
