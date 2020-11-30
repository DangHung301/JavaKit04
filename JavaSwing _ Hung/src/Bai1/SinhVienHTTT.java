/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai1;


import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Admin
 */
public class SinhVienHTTT extends SinhVien  implements Serializable{
    private double hocPhi;


    public SinhVienHTTT(double hocPhi, String maSV, String hoTen, String ngaySinh, String gioiTinh, double diem) {
        super(maSV, hoTen, ngaySinh, gioiTinh, diem);
        this.hocPhi = hocPhi;
    }

    

    public double getHocPhi() {
        return hocPhi;
    }
    
    
    public void setHocPhi(float hocPhi) {
        this.hocPhi = hocPhi;
    }

    @Override
    public String toString() {
        return "SinhVienHTTT{" + super.toString()+", hocPhi=" + hocPhi + '}';
    }

   
    public void xuat()
    {
        System.out.println(toString());
    }
    
}