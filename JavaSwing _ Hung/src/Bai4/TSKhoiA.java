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
public class TSKhoiA extends ThiSinh{
    private double diemToan;
    private double diemLy;
    private double diemHoa;
    

    
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        super.nhap();
        System.out.println("Nhập điểm toán :");
        diemToan = sc.nextDouble();
        System.out.println("Nhập điểm lý :");
        diemLy = sc.nextDouble();
        System.out.println("Nhập điểm hóa :");
        diemHoa = sc.nextDouble();
    }

    public double getDiemToan() {
        return diemToan;
    }

    public void setDiemToan(double diemToan) {
        this.diemToan = diemToan;
    }

    public double getDiemLy() {
        return diemLy;
    }

    public void setDiemLy(double diemLy) {
        this.diemLy = diemLy;
    }

    public double getDiemHoa() {
        return diemHoa;
    }

    public void setDiemHoa(double diemHoa) {
        this.diemHoa = diemHoa;
    }

    @Override
    public String toString() {
        return "TSKhoiA{" + super.toString() + ", diemToan=" + diemToan + ", diemLy=" + diemLy + ", diemHoa=" + diemHoa + '}';
    }

    public double tongDiem(){
        return diemHoa + diemLy + diemToan;
    }

    
}
