/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.lab3;
import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author NGUYEN THANH TAM
 */
public class TimKiemSapXep {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nhap so phan tu
        System.out.print("Nhap n: ");
        int n = sc.nextInt();

        // Nhap mang
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "] = ");
            a[i] = sc.nextInt();
        }

        // Nhap x
        System.out.print("Nhap x: ");
        int x = sc.nextInt();

        // Tim kiem tuyen tinh
        System.out.print("Vi tri cua " + x + " trong mang: ");

        boolean timThay = false;

        for (int i = 0; i < a.length; i++) {
            if (a[i] == x) {
                System.out.print(i + " ");
                timThay = true;
            }
        }

        if (!timThay) {
            System.out.print("Khong tim thay");
        }

        System.out.println();

        // Tao ban sao mang ban dau
        int[] b = Arrays.copyOf(a, a.length);

        // Bubble Sort giam dan
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - 1 - i; j++) {
                if (a[j] < a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }

        System.out.println("Mang giam dan (Bubble Sort): "
                + Arrays.toString(a));

        // Arrays.sort tang dan
        Arrays.sort(b);

        System.out.println("Mang tang dan (Arrays.sort): "
                + Arrays.toString(b));

        sc.close();
    }
}

