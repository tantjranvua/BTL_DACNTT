/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CSDL;

import Models.clsBangDiem;
import java.sql.Connection;
import java.sql.PreparedStatement;
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
public class tbBangDiem {
    
    public Vector<clsBangDiem> LayDSBangDiemSV(String Msv)
    {
        Vector<clsBangDiem> dsbangdiem = new Vector<clsBangDiem>();
        Connection cnn = Database.KetnoiCSDL();
        Msv = "%"+Msv+"%";
        if(cnn!=null)
        {
            String sql = "SELECT * FROM tblMon\n" +
"RIGHT JOIN tblBangdiem ON tblMon.idMon=tblBangdiem.idMon WHERE Msv LIKE ?";
            try {
                PreparedStatement stm = cnn.prepareStatement(sql);
                stm.setString(1, Msv);
                ResultSet rs = stm.executeQuery();
                while(rs.next())//duyệt từng bản ghi kết quả select
                {   
                    clsBangDiem bangdiem = new clsBangDiem();
                    bangdiem.Msv = rs.getString("Msv");
                    bangdiem.idMon = rs.getString("idMon");
                    bangdiem.tenMon = rs.getString("tenMon");
                    bangdiem.diem = rs.getFloat("diem");
                    bangdiem.tinhTrang = rs.getBoolean("tinhTrang");
                    dsbangdiem.add(bangdiem);// Cần override hàm to_String tại class models.Lop
                }
            } catch (SQLException ex) {
                Logger.getLogger(tbLop.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        return dsbangdiem;
    }
    public Vector<clsBangDiem> LayDSBangDiemSVSearch(String Msv)
    {
        Vector<clsBangDiem> dsbangdiem = new Vector<clsBangDiem>();
        Connection cnn = Database.KetnoiCSDL();
        if(cnn!=null)
        {
            String sql = "SELECT * FROM tblMon\n" +
"RIGHT JOIN tblBangdiem ON tblMon.idMon=tblBangdiem.idMon WHERE Msv = ?";
            try {
                PreparedStatement stm = cnn.prepareStatement(sql);
                stm.setString(1, Msv);
                ResultSet rs = stm.executeQuery();
                while(rs.next())//duyệt từng bản ghi kết quả select
                {   
                    clsBangDiem bangdiem = new clsBangDiem();
                    bangdiem.Msv = rs.getString("Msv");
                    bangdiem.idMon = rs.getString("idMon");
                    bangdiem.tenMon = rs.getString("tenMon");
                    bangdiem.diem = rs.getFloat("diem");
                    bangdiem.tinhTrang = rs.getBoolean("tinhTrang");
                    dsbangdiem.add(bangdiem);// Cần override hàm to_String tại class models.Lop
                }
            } catch (SQLException ex) {
                Logger.getLogger(tbLop.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        return dsbangdiem;
    }
    public Vector<clsBangDiem> LayDSBangDiemL(String idLop)
    {
        Vector<clsBangDiem> dsbangdiem = new Vector<clsBangDiem>();
        Connection cnn = Database.KetnoiCSDL();
        idLop = "%"+idLop+"%";
        if(cnn!=null)
        {
            String sql = "SELECT sv.Msv, sv.hoTen, m.idMon, m.tenMon, bd.diem, bd.tinhTrang,sv.idLop FROM tblBangdiem bd "
                    + "LEFT JOIN tblMon m on bd.idMon = m.idMon LEFT JOIN tblSinhvien sv on bd.Msv = sv.Msv WHERE sv.idLop LIKE ?";
            try {
                PreparedStatement stm = cnn.prepareStatement(sql);
                stm.setString(1, idLop);
                ResultSet rs = stm.executeQuery();
                while(rs.next())//duyệt từng bản ghi kết quả select
                {   
                    clsBangDiem bangdiem = new clsBangDiem();
                    bangdiem.Msv = rs.getString("Msv");
                    bangdiem.hoTen = rs.getString("hoTen");
                    bangdiem.idLop = rs.getString("idLop");
                    bangdiem.idMon = rs.getString("idMon");
                    bangdiem.tenMon = rs.getString("tenMon");
                    bangdiem.diem = rs.getFloat("diem");
                    bangdiem.tinhTrang = rs.getBoolean("tinhTrang");
                    dsbangdiem.add(bangdiem);// Cần override hàm to_String tại class models.Lop
                }
            } catch (SQLException ex) {
                Logger.getLogger(tbLop.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        return dsbangdiem;
    }
    public Vector<clsBangDiem> LayDSBangDiemLSearch(String idLop)
    {
        Vector<clsBangDiem> dsbangdiem = new Vector<clsBangDiem>();
        Connection cnn = Database.KetnoiCSDL();
        if(cnn!=null)
        {
            String sql = "SELECT sv.Msv, sv.hoTen, m.idMon, m.tenMon, bd.diem, bd.tinhTrang,sv.idLop FROM tblBangdiem bd "
                    + "LEFT JOIN tblMon m on bd.idMon = m.idMon LEFT JOIN tblSinhvien sv on bd.Msv = sv.Msv WHERE sv.idLop = ?";
            try {
                PreparedStatement stm = cnn.prepareStatement(sql);
                stm.setString(1, idLop);
                ResultSet rs = stm.executeQuery();
                while(rs.next())//duyệt từng bản ghi kết quả select
                {   
                    clsBangDiem bangdiem = new clsBangDiem();
                    bangdiem.Msv = rs.getString("Msv");
                    bangdiem.hoTen = rs.getString("hoTen");
                    bangdiem.idLop = rs.getString("idLop");
                    bangdiem.idMon = rs.getString("idMon");
                    bangdiem.tenMon = rs.getString("tenMon");
                    bangdiem.diem = rs.getFloat("diem");
                    bangdiem.tinhTrang = rs.getBoolean("tinhTrang");
                    dsbangdiem.add(bangdiem);// Cần override hàm to_String tại class models.Lop
                }
            } catch (SQLException ex) {
                Logger.getLogger(tbLop.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        return dsbangdiem;
    }
    public Vector<clsBangDiem> LayDSBangDiemM(String idMon)
    {
        Vector<clsBangDiem> dsbangdiem = new Vector<clsBangDiem>();
        Connection cnn = Database.KetnoiCSDL();
        idMon = "%"+idMon+"%";
        if(cnn!=null)
        {
            String sql = "SELECT sv.Msv, sv.hoTen, m.idMon, m.tenMon, bd.diem, bd.tinhTrang,sv.idLop FROM tblBangdiem bd "
                    + "LEFT JOIN tblMon m on bd.idMon = m.idMon LEFT JOIN tblSinhvien sv on bd.Msv = sv.Msv WHERE m.idMon LIKE ?";
            try {
                PreparedStatement stm = cnn.prepareStatement(sql);
                stm.setString(1, idMon);
                ResultSet rs = stm.executeQuery();
                while(rs.next())//duyệt từng bản ghi kết quả select
                {   
                    clsBangDiem bangdiem = new clsBangDiem();
                    bangdiem.Msv = rs.getString("Msv");
                    bangdiem.hoTen = rs.getString("hoTen");
                    bangdiem.idLop = rs.getString("idLop");
                    bangdiem.idMon = rs.getString("idMon");
                    bangdiem.tenMon = rs.getString("tenMon");
                    bangdiem.diem = rs.getFloat("diem");
                    bangdiem.tinhTrang = rs.getBoolean("tinhTrang");
                    dsbangdiem.add(bangdiem);// Cần override hàm to_String tại class models.Lop
                }
            } catch (SQLException ex) {
                Logger.getLogger(tbLop.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        return dsbangdiem;
    }
    public Vector<clsBangDiem> LayDSBangDiemMSearch(String idMon)
    {
        Vector<clsBangDiem> dsbangdiem = new Vector<clsBangDiem>();
        Connection cnn = Database.KetnoiCSDL();
        if(cnn!=null)
        {
            String sql = "SELECT sv.Msv, sv.hoTen, m.idMon, m.tenMon, bd.diem, bd.tinhTrang,sv.idLop FROM tblBangdiem bd "
                    + "LEFT JOIN tblMon m on bd.idMon = m.idMon LEFT JOIN tblSinhvien sv on bd.Msv = sv.Msv WHERE m.idMon = ?";
            try {
                PreparedStatement stm = cnn.prepareStatement(sql);
                stm.setString(1, idMon);
                ResultSet rs = stm.executeQuery();
                while(rs.next())//duyệt từng bản ghi kết quả select
                {   
                    clsBangDiem bangdiem = new clsBangDiem();
                    bangdiem.Msv = rs.getString("Msv");
                    bangdiem.hoTen = rs.getString("hoTen");
                    bangdiem.idLop = rs.getString("idLop");
                    bangdiem.idMon = rs.getString("idMon");
                    bangdiem.tenMon = rs.getString("tenMon");
                    bangdiem.diem = rs.getFloat("diem");
                    bangdiem.tinhTrang = rs.getBoolean("tinhTrang");
                    dsbangdiem.add(bangdiem);// Cần override hàm to_String tại class models.Lop
                }
            } catch (SQLException ex) {
                Logger.getLogger(tbLop.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        return dsbangdiem;
    }
    public boolean SuaDiem(String Msv,String idMon, float diem, boolean tinhtrang)
    {
        Connection cnn = Database.KetnoiCSDL();
        if(cnn!=null)
        {
            String sql = 
             "UPDATE tblBangdiem SET diem = ?, tinhTrang = ? WHERE idMon =? AND Msv = ?";
            try {
                PreparedStatement stm = cnn.prepareStatement(sql);
                stm.setFloat(1, diem);
                if(tinhtrang){
                    stm.setInt(2, 1);
                }
                else{
                    stm.setInt(2, 0);
                }
                stm.setString(3, idMon);
                stm.setString(4, Msv);
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
    public boolean ThemBangDiem(String Msv,String idMon,float diem,boolean tinhtrang)
    {
        Connection cnn = Database.KetnoiCSDL();
        if(cnn!=null)
        {
            String sql = "INSERT INTO `tblBangdiem` (`Msv`, `idMon`, `diem`, `tinhTrang`) VALUES (?, ?, ?, ?);";
            try {
                java.sql.PreparedStatement stm = cnn.prepareStatement(sql);
                stm.setString(1, Msv);
                stm.setString(2, idMon);
                stm.setFloat(3, diem);
                stm.setBoolean(4, tinhtrang);
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
    public boolean XoaBangDiem(String Msv, String idMon)
    {
        Connection cnn = Database.KetnoiCSDL();
        if(cnn!=null)
        {
            String sql = "DELETE FROM `tblBangdiem` WHERE `tblBangdiem`.`Msv` = ? AND `tblBangdiem`.`idMon` = ?";
            try {
                PreparedStatement stm = cnn.prepareStatement(sql);
                stm.setString(1, Msv);
                stm.setString(2, idMon);
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
