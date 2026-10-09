/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.lab4;
import java.util.Scanner;
/**
 *
 * @author NGUYEN THANH TAM
 */
public class QuanLySinhVien {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        do {
            System.out.print("Nhap so luong sinh vien: ");
            n = sc.nextInt();
        } while (n <= 0);

        sc.nextLine();

        Student[] ds = new Student[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Nhap sinh vien thu " + (i + 1) + ":");
            ds[i] = new Student();
            ds[i].input(sc);
        }

        System.out.println("=== DANH SACH SINH VIEN ===");
        for (int i = 0; i < n; i++) {
            ds[i].output();
        }

        System.out.println("=== SINH VIEN CO GPA CAO NHAT ===");
        Student max = ds[0];

        for (int i = 1; i < n; i++) {
            if (ds[i].getGpa() > max.getGpa()) {
                max = ds[i];
            }
        }

        max.output();

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (ds[j].getGpa() < ds[j + 1].getGpa()) {
                    Student tmp = ds[j];
                    ds[j] = ds[j + 1];
                    ds[j + 1] = tmp;
                }
            }
        }

        System.out.println(
            "=== DANH SACH SAU KHI SAP XEP GIAM DAN THEO GPA ==="
        );

        for (int i = 0; i < n; i++) {
            ds[i].output();
        }
    }
}


