/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai3Form;

/**
 *
 * @author hp
 */
public class NhanVien extends Person{
    private String phongBan;
    private String heSoLuong;
    private double thamNien;
    private int luongCoBan;

    public NhanVien(String phongBan, String heSoLuong, double thamNien, int luongCoBan, String hoTen, String ngaySinh, String diaChi, String gioiTinh) {
        super(hoTen, ngaySinh, diaChi, gioiTinh);
        this.phongBan = phongBan;
        this.heSoLuong = heSoLuong;
        this.thamNien = thamNien;
        this.luongCoBan = luongCoBan;
    }
   
    public double luongThucLinh(){
        double heSo = 1 + thamNien/100;
        return luongCoBan*heSo;
    }

    public String getPhongBan() {
        return phongBan;
    }

    public void setPhongBan(String phongBan) {
        this.phongBan = phongBan;
    }

    public String getHeSoLuong() {
        return heSoLuong;
    }

    public void setHeSoLuong(String heSoLuong) {
        this.heSoLuong = heSoLuong;
    }

    public double getThamNien() {
        return thamNien;
    }

    public void setThamNien(double thamNien) {
        this.thamNien = thamNien;
    }

    public int getLuongCoBan() {
        return luongCoBan;
    }

    public void setLuongCoBan(int luongCoBan) {
        this.luongCoBan = luongCoBan;
    }

     @Override
    public String toString() {
        return "{"+ super.toString() + " $ phongBan=" + phongBan + " $ heSoLuong=" + heSoLuong + " $ thamNien=" + thamNien + " $ luongCoBan=" + luongCoBan +'}' + " Lương thực lĩnh :" + luongThucLinh() + " ." + "\n" ;
    }
    
  
}
