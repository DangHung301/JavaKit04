/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai3;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class Person {
//    Họ tên, ngày sinh, địa chỉ, giới tính
    private String hoTen;
    private String ngaySinh;
    private String diaChi;
    private String gioiTinh;
    
    
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập họ tên :");
        hoTen = sc.nextLine();
        System.out.println("Nhập ngày sinh :");
        ngaySinh = sc.nextLine();
        System.out.println("Nhập địa chỉ : ");
        diaChi = sc.nextLine();
        System.out.println("Nhập giới tính :");
        gioiTinh = sc.nextLine();
    }
    
    public void xuat(){
        System.out.println(toString());
    }
    
    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
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
        return   "hoTen=" + hoTen + " $ ngaySinh=" + ngaySinh + " $ diaChi=" + diaChi + " $ gioiTinh=" + gioiTinh  ;
    }

     
}

