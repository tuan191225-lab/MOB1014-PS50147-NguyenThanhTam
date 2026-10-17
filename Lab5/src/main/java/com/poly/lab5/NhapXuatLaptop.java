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
public class NhapXuatLaptop {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Khai bao danh sach laptop
        List<Laptop> list = new ArrayList<>();

        String choice;

        do {
            // Tao doi tuong moi trong moi lan lap
            Laptop laptop = new Laptop();

            // Nhap thong tin
            laptop.input(sc);

            // Them vao danh sach
            list.add(laptop);

            // Hoi nguoi dung co nhap tiep khong
            System.out.print("Tiep tuc nhap? (y/n): ");
            choice = sc.nextLine();

        } while (choice.equalsIgnoreCase("y"));

        // Xuat so luong laptop
        System.out.println("\n=== DANH SACH LAPTOP ("
                + list.size() + " may) ===");

        // Duyet va xuat danh sach
        for (Laptop laptop : list) {
            laptop.output();
        }

        sc.close();
    }
}
