/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.asm1;
import java.util.Scanner;
/**
 *
 * @author NGUYEN THANH TAM
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        SanPham sp = new SanPham();
        
        do {
            System.out.println("=== MENU CHUONG TRINH ===");
            System.out.println("1. Nhap thong tin san pham");
            System.out.println("2. Hien thi thong tin san pham");
            System.out.println("3. Tinh tien san pham");
            System.out.println("4. Cap nhat thong tin san pham");
            System.out.println("5. Thoat chuong trinh");
            System.out.print("Moi chon: ");
            choice = sc.nextInt();
            sc.nextLine();
            
            switch (choice) {
                case 1:
                    sp.nhap();
                    break;
                case 2:
                    sp.xuat();
                    break;
                case 3:
                    System.out.printf("Tong tien cua san pham %s la: %.0f VND\n",sp.maSP, sp.thanhTien());
                    break;
                case 4:
                    sp.capNhat();
                    break;
                case 5:
                    System.out.println("Da thoat");
                    break;
                default:
                    System.out.println("Khong co chuc nang nay, moi chon lai");
                    break;
            }
        }while (choice != 5);
    }
}
