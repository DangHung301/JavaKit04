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
public class Main {
    public static void main(String[] args) {
        QuanLyHocSinh quanLyHocSinh = new QuanLyHocSinh();
        int chon;
        Scanner sc = new Scanner(System.in);
        
        while(true){
            quanLyHocSinh.menu();
            chon = sc.nextInt();
            
            switch(chon){
                case 1:
                    quanLyHocSinh.nhapTSKhoiA();
                    break;
                case 2:
                    quanLyHocSinh.xuatTSKhoiA();
                    break;
                case 3:
                    quanLyHocSinh.nhapTSKhoiC();
                    break;
                case 4:
                    quanLyHocSinh.xuatTSKhoiC();
                    break;
                case 5:
                    quanLyHocSinh.dsTrungTuyen();
                    break;
                case 0:
                    return;
                default:
                        System.out.println("Vui lòng chọn từ 0 đến 5");
            }
        }
    }
}
