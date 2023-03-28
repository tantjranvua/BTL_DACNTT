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
                System.out.print(stm);
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
                    + "LEFT JOIN tblMon m on bd.idMon = m.idMon LEFT JOIN tblSinhvien sv on bd.Msv = sv.Msv WHERE sv.idLop LIKE ?";
            try {
                PreparedStatement stm = cnn.prepareStatement(sql);
                stm.setString(1, idMon);
                System.out.print(stm);
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
}
