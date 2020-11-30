/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai3;

import com.sun.org.apache.bcel.internal.generic.DCMPG;
import java.io.PrintWriter;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author hp
 */
public class NhanVien extends Person implements Serializable{
    //phòng ban, hệ số lương, thâm niên, lương cơ bản
    private String phongBan;
    private String heSoLuong;
    private double thamNien;
    private int luongCoBan;

    public double luongThucLinh(){
        double heSo = 1 + thamNien/100;
        return luongCoBan*heSo;
    }
    
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        super.nhap();
        System.out.println("Nhập phòng ban :");
        phongBan = sc.nextLine();
        System.out.println("Nhập hệ số lương :");
        heSoLuong = sc.nextLine();
        System.out.println("Nhập thâm niên :");
        thamNien = sc.nextDouble();
        System.out.println("Nhập lương cơ bản :");
        luongCoBan = sc.nextInt();
    }

    public void xuat(){
        System.out.println(toString());
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