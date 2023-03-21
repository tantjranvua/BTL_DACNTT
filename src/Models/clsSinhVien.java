/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author tantanmanh
 */
public class clsSinhVien{
    public String Msv;
    public  String hoTen;
    public String ngaySinh;
    public boolean gioiTinh;
    public String diaChi;
    public String anh;
    public String idLop;
    public clsSinhVien(String Msv, String hoTen, String ngaySinh, boolean gioiTinh, String diaChi, String anh, String idLop){
        this.Msv = Msv;
        this.hoTen = hoTen;
        this.ngaySinh= ngaySinh;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
        this.anh = anh;
        this.idLop = idLop;
    }
    public clsSinhVien(){
        this.Msv = "";
        this.hoTen = "";
        this.ngaySinh= "";
        this.gioiTinh = true;
        this.diaChi = "";
        this.anh = "";
        this.idLop = "";
    }
}
