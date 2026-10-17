/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.lab5;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author NGUYEN THANH TAM
 */
public class TimKiemLaptop {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Khoi tao danh sach laptop theo de bai
        List<Laptop> list = new ArrayList<>();

        list.add(new Laptop("LT01", "Dell Inspiron 15",
                "Van phong", 15500000, 10));
        list.add(new Laptop("LT02", "Asus TUF Gaming F15",
                "Gaming", 22990000, 5));
        list.add(new Laptop("LT03", "MacBook Air M2",
                "Van phong", 24990000, 8));
        list.add(new Laptop("LT04", "Lenovo Legion 5",
                "Gaming", 32500000, 0));
        list.add(new Laptop("LT05", "HP Pavilion 14",
                "Van phong", 17800000, 0));

        // PHAN 1: LOC THEO KHOANG GIA
        System.out.print("Nhap gia min: ");
        double min = sc.nextDouble();

        System.out.print("Nhap gia max: ");
        double max = sc.nextDouble();

        if (min > max) {
            System.out.println("Khoang gia khong hop le");
        } else {
            System.out.println("\n=== LAPTOP GIA TU "
                    + String.format("%.0f", min)
                    + " DEN "
                    + String.format("%.0f", max) + " ===");

            boolean timThay = false;

            for (Laptop laptop : list) {
                if (laptop.getPrice() >= min
                        && laptop.getPrice() <= max) {
                    laptop.output();
                    timThay = true;
                }
            }

            if (!timThay) {
                System.out.println("Khong tim thay laptop nao");
            }
        }

        // PHAN 2: TIM KIEM THEO TU KHOA
        sc.nextLine(); // Doc bo ky tu xuong dong con lai

        System.out.print("\nNhap tu khoa: ");
        String keyword = sc.nextLine();

        System.out.println("\n=== KET QUA TIM KIEM \""
                + keyword + "\" ===");

        boolean timThay = false;
        String tuKhoaThuong = keyword.toLowerCase();

        for (Laptop laptop : list) {
            boolean trungMa = laptop.getId()
                    .equalsIgnoreCase(keyword);

            boolean trungTen = laptop.getName()
                    .toLowerCase()
                    .contains(tuKhoaThuong);

            if (trungMa || trungTen) {
                laptop.output();
                timThay = true;
            }
        }

        if (!timThay) {
            System.out.println("Khong tim thay laptop nao");
        }

        sc.close();
    }
}

