/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.lab6;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author NGUYEN THANH TAM
 */
public class QuanLyHinhTru {

    public static void main(String[] args) {

        // 1. Tạo danh sách
        List<Cylinder> list = new ArrayList<>();

        // Thêm 5 hình trụ theo đúng thứ tự đề bài
        list.add(new Cylinder(1.0, "Do", 2.0));
        list.add(new Cylinder(2.0, "Xanh", 3.0));
        list.add(new Cylinder(1.5, "Vang", 4.0));
        list.add(new Cylinder(3.0, "Do", 1.0));
        list.add(new Cylinder(2.5, "Xanh", 2.0));

        // 2. Xuất danh sách bằng for-each
        System.out.println("=== DANH SACH HINH TRU ===");

        for (Cylinder cy : list) {
            System.out.println(cy);
        }

        // 3. Tính tổng thể tích
        double tongTheTich = 0;

        for (Cylinder cy : list) {
            tongTheTich += cy.getVolume();
        }

        System.out.printf("Tong the tich: %.2f%n", tongTheTich);

        // 4. Tìm hình trụ có thể tích lớn nhất
        Cylinder max = list.get(0);

        for (Cylinder cy : list) {
            if (cy.getVolume() > max.getVolume()) {
                max = cy;
            }
        }

        System.out.println("Hinh tru co the tich lon nhat:");
        System.out.println(max);

        // 5. Nhập màu cần tìm
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap mau: ");
        String mau = scanner.nextLine();

        System.out.println("=== HINH TRU MAU [" + mau + "] ===");

        boolean timThay = false;

        for (Cylinder cy : list) {
            if (cy.getColor().equalsIgnoreCase(mau)) {
                System.out.println(cy);
                timThay = true;
            }
        }

        if (!timThay) {
            System.out.println("Khong co hinh tru mau [" + mau + "]");
        }
    }
}


