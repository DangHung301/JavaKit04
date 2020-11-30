/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai4;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author hp
 */
public class QuanLyHocSinh {

    ArrayList<TSKhoiA> listTSKhoiAs = new ArrayList<>();
    ArrayList<TSKhoiC> listTSKhoiCs = new ArrayList<>();

    Scanner sc = new Scanner(System.in);

    public void menu() {
        System.out.println("=================Quản Lý Sinh Viên=================");
        System.out.println("1. Nhập thí sinh khối A");
        System.out.println("2. Xuất thí sinh khối A");
        System.out.println("3. Nhập thí sinh khối C");
        System.out.println("4. Xuất thí sinh khối C");
        System.out.println("5. Thí sinh trúng tuyến");
        System.out.println("0. Thoat");
        System.out.println("Bạn chọn : ");
    }

    public void nhapTSKhoiA() {
        int i = 1;
        System.out.println("===========================================");

        while (true) {
            TSKhoiA tmp = new TSKhoiA();
            System.out.println("Thí sinh thứ " + i + " :");
            tmp.nhap();
            listTSKhoiAs.add(tmp);
            i++;
            System.out.println("Nhập tiếp ? (y/n)");
            String chon = sc.next();
            if (chon.equalsIgnoreCase("n")) {
                break;
            }
        }
    }

    public void xuatTSKhoiA() {
        int i = 1;
        System.out.println("===========================================");

        for (TSKhoiA tmp : listTSKhoiAs) {
            System.out.printf("%d. ", i);
            tmp.xuat();
            i++;
        }
    }

    public void nhapTSKhoiC() {
        int i = 1;
        System.out.println("===========================================");

        while (true) {
            TSKhoiC tmp = new TSKhoiC();
            System.out.println("Thí sinh thứ " + i + " :");
            tmp.nhap();
            listTSKhoiCs.add(tmp);
            i++;
            System.out.println("Nhập tiếp ? (y/n)");
            String chon = sc.next();
            if (chon.equalsIgnoreCase("n")) {
                break;
            }
        }
    }

    public void xuatTSKhoiC() {
        int i = 1;
        System.out.println("===========================================");

        for (TSKhoiC tmp : listTSKhoiCs) {
            System.out.printf("%d. ", i);
            tmp.xuat();
            i++;
        }
    }

    public void dsTrungTuyen() {
        System.out.println("===========================================");
        int i = 1;

        for (TSKhoiA tmp : listTSKhoiAs) {
            if (tmp.tongDiem() >= 20) {
                System.out.printf("%d. ", i);
                tmp.xuat();
                i++;
            }
        }

        for (TSKhoiC tmp : listTSKhoiCs) {
            if(tmp.tongDiem() >= 20){
                System.out.printf("%d. ", i);
                tmp.xuat();
                i++;
            }
    }
}
}
