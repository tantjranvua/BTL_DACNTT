/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CSDL;

import Models.clsSinhVien;
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
public class tbSinhVien {
    public Vector<clsSinhVien> LayDSSinhvien()
    {
        Vector<clsSinhVien> ds = new Vector<clsSinhVien>();
        Connection cnn = Database.KetnoiCSDL();
        if(cnn!=null)
        {
            String sql = "SELECT * FROM `tblSinhvien`";
            try {
                Statement stm = cnn.createStatement();
                ResultSet rs = stm.executeQuery(sql);
                while(rs.next())//duyệt từng bản ghi kết quả select
                {
                    clsSinhVien sv = new clsSinhVien();
                    sv.Msv = rs.getString("Msv");
                    sv.hoTen = rs.getString("hoTen");
                    sv.ngaySinh = rs.getString("ngaySinh");
                    sv.gioiTinh = rs.getBoolean("gioiTinh");
                    sv.diaChi = rs.getString("diaChi");
                    sv.anh = rs.getString("anh");
                    sv.idLop = rs.getString("idLop");
                    ds.add(sv);
                }
            } catch (SQLException ex) {
                Logger.getLogger(tbSinhVien.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        return ds;
    }
    public Vector<clsSinhVien> LayDSSinhvien(String search, int option){
        Vector<clsSinhVien> ds = new Vector<clsSinhVien>();
        Connection cnn = Database.KetnoiCSDL();
        Vector<String> tmpstr = new Vector<String>();
        tmpstr.add("%%");
        tmpstr.add("%%");
        tmpstr.add("%%");
        tmpstr.add("%%");
        tmpstr.add("%%");
        tmpstr.add("%%");
//        search = "%"+search+"%";
        tmpstr.set(option, "%"+search+"%");
        if(cnn!=null)
        {
        String sql = "SELECT * FROM `tblSinhvien` WHERE `Msv` LIKE ? AND `hoTen` LIKE ? AND `ngaySinh` LIKE ? "
                + "AND `gioiTinh` LIKE ? AND `diaChi` LIKE ? AND `idLop` LIKE ?";
        try {
            PreparedStatement stm = cnn.prepareStatement(sql);
            stm.setString(1, tmpstr.get(0));
            stm.setString(2, tmpstr.get(1));
            stm.setString(3, tmpstr.get(2));
            stm.setString(4, tmpstr.get(3));
            stm.setString(5, tmpstr.get(4));
            stm.setString(6, tmpstr.get(5));
            ResultSet rs = stm.executeQuery();
            while(rs.next())//duyệt từng bản ghi kết quả select
            {
                clsSinhVien sv = new clsSinhVien();
                sv.Msv = rs.getString("Msv");
                sv.hoTen = rs.getString("hoTen");
                sv.ngaySinh = rs.getString("ngaySinh");
                sv.gioiTinh = rs.getBoolean("gioiTinh");
                sv.diaChi = rs.getString("diaChi");
                sv.anh = rs.getString("anh");
                sv.idLop = rs.getString("idLop");
                ds.add(sv);
            }
        } catch (SQLException ex) {
            Logger.getLogger(tbSinhVien.class.getName()).log(Level.SEVERE, null, ex);
        }

        }
        return ds;
    }
    public clsSinhVien LaySinhvien(String Msv){
        clsSinhVien sv = new clsSinhVien();
        Connection cnn = Database.KetnoiCSDL();
        if(cnn!=null)
        {
            String sql = "SELECT * FROM `tblSinhvien` WHERE `Msv` = ? ";
            try {
                PreparedStatement stm = cnn.prepareStatement(sql);
                stm.setString(1, Msv);
                ResultSet rs = stm.executeQuery();
                while(rs.next())//duyệt từng bản ghi kết quả select
                {
                    sv.Msv = rs.getString("Msv");
                    sv.hoTen = rs.getString("hoTen");
                    sv.ngaySinh = rs.getString("ngaySinh");
                    sv.gioiTinh = rs.getBoolean("gioiTinh");
                    sv.diaChi = rs.getString("diaChi");
                    sv.anh = rs.getString("anh");
                    sv.idLop = rs.getString("idLop");
                }
            } catch (SQLException ex) {
                Logger.getLogger(tbSinhVien.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return sv;
    }
    public boolean XoaSinhvien(String id)
    {
        Connection cnn = Database.KetnoiCSDL();
        if(cnn!=null)
        {
            String sql = "DELETE FROM tblSinhvien WHERE Msv=?";
            try {
                PreparedStatement stm = cnn.prepareStatement(sql);
                stm.setString(1, id);
                int n = stm.executeUpdate();
                if(n<=0)
                    return false;
                else
                    return true;
            } catch (SQLException ex) {
                Logger.getLogger(tbSinhVien.class.getName()).log(Level.SEVERE, null, ex);
                return false;
            }
        }
        else
            return false;
    }
    public boolean ThemSinhvien(clsSinhVien sv)
    {
        Connection cnn = Database.KetnoiCSDL();
        if(cnn!=null)
        {
            String sql = "INSERT INTO tblSinhvien VALUES(?,?,?,?,?,?,?)";
            try {
                PreparedStatement stm = cnn.prepareStatement(sql);
                stm.setString(1, sv.Msv);
                stm.setString(2, sv.hoTen);
                stm.setString(3, sv.ngaySinh);
                stm.setBoolean(4, sv.gioiTinh);
                stm.setString(5, sv.diaChi);
                stm.setString(6,sv.anh);
                stm.setString(7,sv.idLop);
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
    public boolean SuaSinhvien(clsSinhVien sv)
    {
        Connection cnn = Database.KetnoiCSDL();
        if(cnn!=null)
        {
            String sql = 
             "UPDATE `tblSinhvien` SET `Msv`=?,`hoTen`=?,`ngaySinh`=?,`gioiTinh`=?,`diaChi`=?,`anh`=?,`idLop`=? WHERE Msv = ?";
            try {
                PreparedStatement stm = cnn.prepareStatement(sql);
                stm.setString(1, sv.Msv);
                stm.setString(2, sv.hoTen);
                stm.setString(3, sv.ngaySinh);
                stm.setBoolean(4, sv.gioiTinh);
                stm.setString(5, sv.diaChi);
                stm.setString(6,sv.anh);
                stm.setString(7,sv.idLop);
                stm.setString(8, sv.Msv);
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
