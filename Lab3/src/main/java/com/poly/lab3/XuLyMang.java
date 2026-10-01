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
public class XuLyMang {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Nhập số phần tử n
        int n;
        do {
            System.out.print("Nhap so phan tu n: ");
            n = sc.nextInt();
            if (n <= 0) {
                System.out.println("n phai la so nguyen duong!");
            }
        } while (n <= 0);
        // Khai báo mảng
        int[] a = new int[n];
        // Nhập các phần tử bằng for
        for (int i = 0; i < a.length; i++) {
            System.out.print("Nhap a[" + i + "]: ");
            a[i] = sc.nextInt();
        }
        // 1. Xuất toàn bộ mảng bằng for-each
        System.out.print("Mang vua nhap: ");
        for (int x : a) {
            System.out.print(x + " ");
        }
        System.out.println();
        // 2. Xuất các phần tử chẵn, dùng continue bỏ qua số lẻ
        System.out.print("Cac phan tu chan: ");
        boolean coSoChan = false;
        for (int x : a) {
            if (x % 2 != 0) {
                continue;
            }

            System.out.print(x + " ");
            coSoChan = true;
        }

        if (!coSoChan) {
            System.out.print("Khong co phan tu chan");
        }
        System.out.println();
        // 3. Tính tổng các phần tử chia hết cho 4
        int tong = 0;

        for (int x : a) {
            if (x % 4 == 0) {
                tong += x;
            }
        }

        System.out.println("Tong cac so chia het cho 4: " + tong);
        // 4. Tìm giá trị lớn nhất
        int max = a[0];

        for (int x : a) {
            if (x > max) {
                max = x;
            }
        }

        System.out.println("Gia tri lon nhat: " + max);

        sc.close();
    }
}

