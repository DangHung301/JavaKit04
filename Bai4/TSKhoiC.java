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
public class TSKhoiC extends ThiSinh{
    private double diemVan;
    private double diemSu;
    private double diemDia;
    
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        super.nhap();
        
        System.out.println("Nhập điểm văn :");
        diemVan = sc.nextDouble();
        System.out.println("Nhập điểm sử :");
        diemSu = sc.nextDouble();
        System.out.println("Nhập điểm địa :");
        diemDia = sc.nextDouble();
    }

    public double getDiemVan() {
        return diemVan;
    }

    public void setDiemVan(double diemVan) {
        this.diemVan = diemVan;
    }

    public double getDiemSu() {
        return diemSu;
    }

    public void setDiemSu(double diemSu) {
        this.diemSu = diemSu;
    }

    public double getDiemDia() {
        return diemDia;
    }

    public void setDiemDia(double diemDia) {
        this.diemDia = diemDia;
    }

    @Override
    public String toString() {
        return "TSKhoiC{" + super.toString() + "diemVan=" + diemVan + ", diemSu=" + diemSu + ", diemDia=" + diemDia + '}';
    }
    
    public void xuat(){
        System.out.println(toString());
    }
    
    public double tongDiem(){
        return diemDia+diemSu+diemVan;
    }
            
}
