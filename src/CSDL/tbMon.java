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
    public Vector<clsMon> LayDSMon()
    {
        Vector<clsMon> dsmon = new Vector<clsMon>();
        Connection cnn = Database.KetnoiCSDL();
        if(cnn!=null)
        {
            String sql = "SELECT * FROM tblMon";
            try {
                Statement stm = cnn.createStatement();
                ResultSet rs = stm.executeQuery(sql);
                while(rs.next())//duyệt từng bản ghi kết quả select
                {
                    clsMon mon = new clsMon();
                    mon.tenMon = rs.getString("tenMon");
                    mon.idMon = rs.getString("idMon");
                    dsmon.add(mon);// Cần override hàm to_String tại class models.Mon
                }
            } catch (SQLException ex) {
                Logger.getLogger(tbMon.class.getName()).log(Level.SEVERE, null, ex);
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
                Logger.getLogger(tbMon.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        return mon;
    }
    public boolean XoaMon(String idMon)
    {
        Connection cnn = Database.KetnoiCSDL();
        if(cnn!=null)
        {
            String sql = "DELETE FROM tblMon WHERE idMon=?";
            try {
                java.sql.PreparedStatement stm = cnn.prepareStatement(sql);
                stm.setString(1, idMon);
                int n = stm.executeUpdate();
                if(n<=0)
                    return false;
                else
                    return true;
            } catch (SQLException ex) {
                Logger.getLogger(tbMon.class.getName()).log(Level.SEVERE, null, ex);
                return false;
            }
        }
        else
            return false;
    }
    public boolean SuaMon(String idMon,String tenMon)
    {
        Connection cnn = Database.KetnoiCSDL();
        if(cnn!=null)
        {
            String sql = 
             "UPDATE tblMon SET tenMon=? WHERE idMon=?";
            try {
                java.sql.PreparedStatement stm = cnn.prepareStatement(sql);
                stm.setString(1, tenMon);
                stm.setString(2, idMon);
                int n = stm.executeUpdate();
                if(n<=0)
                    return false;
                else
                    return true;
            } catch (SQLException ex) {
                Logger.getLogger(tbMon.class.getName()).log(Level.SEVERE, null, ex);
                return false;
            }
        }
        else
            return false;
    }
    public boolean ThemMon(String idMon,String tenMon)
    {
        Connection cnn = Database.KetnoiCSDL();
        if(cnn!=null)
        {
            String sql = "INSERT INTO tblMon VALUES(?,?)";
            try {
                java.sql.PreparedStatement stm = cnn.prepareStatement(sql);
                stm.setString(1, idMon);
                stm.setString(2, tenMon);
                int n = stm.executeUpdate();
                if(n<=0)
                    return false;
                else
                    return true;
            } catch (SQLException ex) {
                Logger.getLogger(tbLop.class.getName()).log(Level.SEVERE, null, ex);
                return false;
            }
        }
        else
            return false;
    }
}
