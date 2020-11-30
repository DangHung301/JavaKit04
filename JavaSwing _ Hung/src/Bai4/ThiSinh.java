/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai4;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class ThiSinh {
//    họ tên, ngày sinh, địa chỉ
    private String hoTen;
    private String ngaySinh;
    private String diaChi;
    

    public void nhap(){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Nhập họ tên :");
        hoTen = sc.nextLine();
        System.out.println("Nhập ngày sinh :");
        ngaySinh = sc.nextLine();
        System.out.println("Nhập địa chỉ :");
        diaChi = sc.nextLine();
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

    @Override
    public String toString() {
        return "hoTen=" + hoTen + ", ngaySinh=" + ngaySinh + ", diaChi=" + diaChi ;
    }
    
    public void xuat(){
        System.out.println(toString());
    }
    
}
