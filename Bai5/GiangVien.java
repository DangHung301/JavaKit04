/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai5;

import java.io.Serializable;

/**
 *
 * @author hp
 */
public class GiangVien implements Serializable{
//    họ tên, mã giảng viên, địa chỉ, giới tính,
    private String hoTen;
    private String maGiangVien;
    private String diaChi;
    private String gioiTinh;
    private String khoa;

    public GiangVien(String hoTen, String maGiangVien, String diaChi, String gioiTinh, String khoa) {
        this.hoTen = hoTen;
        this.maGiangVien = maGiangVien;
        this.diaChi = diaChi;
        this.gioiTinh = gioiTinh;
        this.khoa = khoa;
    }

   
    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getMaGiangVien() {
        return maGiangVien;
    }

    public void setMaGiangVien(String maGiangVien) {
        this.maGiangVien = maGiangVien;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    @Override
    public String toString() {
        return "GiangVien{" + "hoTen=" + hoTen + ", maGiangVien=" + maGiangVien + ", diaChi=" + diaChi + ", gioiTinh=" + gioiTinh + ", khoa=" + khoa + '}';
    }

    
    
    public void xuat(){
        System.out.println(toString());
    }
}
