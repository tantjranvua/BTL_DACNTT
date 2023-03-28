/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author tantanmanh
 */
public class clsBangDiem {
    public String Msv;
    public String hoTen;
    public String idMon;
    public String idLop;
    public String tenMon;
    public float diem;
    public boolean tinhTrang;
    public clsBangDiem(){
        this.Msv = "";
        this.hoTen = "";
        this.idMon = "";
        this.idLop = "";
        this.tenMon = "";
        this.diem = (float)0;
        this.tinhTrang = false;
    }
    public clsBangDiem(String Msv, String hoTen, String idMon, String idLop, String tenMon, float diem, boolean tinhStrang){
        this.Msv = Msv;
        this.hoTen = hoTen;
        this.idMon = idMon;
        this.idLop = idLop;
        this.tenMon = tenMon;
        this.diem = diem;
        this.tinhTrang = tinhStrang;
    }
}
