/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hp
 */
public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ArrayList<NhanVien> dsNhanViens = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        while (true) {
            NhanVien nhanVien = new NhanVien();
            nhanVien.nhap();

            dsNhanViens.add(nhanVien);

            System.out.println("Nhập tiếp ? y/n");
            String c = sc.next();
            if (c.equalsIgnoreCase("n")) {
                break;
            }
        }
        PrintWriter printWriter = new PrintWriter("nhanvien.dat");
        int i = 1;
        for (NhanVien tmp : dsNhanViens) {
            printWriter.append("Nhân viên thứ " + i + " :");
            printWriter.append(tmp.toString());
            i++;
        }
        printWriter.close();
    }
}
