/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.lab3;
import java.util.Scanner;
/**
 *
 * @author NGUYEN THANH TAM
 */
public class TrungBinhChia3 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Nhập n
        System.out.print("Nhap n: ");
        int n = sc.nextInt();
        // Kiểm tra n có phải số nguyên dương không
        if (n <= 0) {
            System.out.println("n phai la so nguyen duong");
            return;
        }
        int Tong = 0;
        int Dem = 0;
        // Duyệt từ 1 đến n
        System.out.print("Cac so chia het cho 3: ");

        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0) {
                System.out.print(i + " ");
                Tong += i;
                Dem++;
            }
        }
        System.out.println();
        // Kiểm tra có số nào chia hết cho 3 không
        
        if (Dem == 0) {
            System.out.println("Khong co so nao chia het cho 3");
        } else {
            System.out.println("Tong: " + Tong);
            // Ép kiểu để tính trung bình chính xác
            double TrungBinh = (double) Tong / Dem;
            System.out.printf("Trung binh cong: %.2f%n", TrungBinh);
        }
        sc.close();
    }
}

