/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.lab6;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author NGUYEN THANH TAM
 */
public class DanhSachHinh {

    public static void main(String[] args) {

        // 1. Tạo danh sách chứa Circle và Cylinder
        List<Circle> shapes = new ArrayList<>();

        shapes.add(new Circle(1, "Do"));
        shapes.add(new Cylinder(1, "Do", 2));
        shapes.add(new Circle(2, "Trang"));
        shapes.add(new Cylinder(2, "Xanh", 3));

        // 2. Duyệt danh sách
        for (Circle s : shapes) {
            System.out.printf("%s -> getArea() = %.2f%n",
                    s, s.getArea());
        }

        // 3. Đếm số hình tròn và hình trụ
        int soHinhTron = 0;
        int soHinhTru = 0;

        for (Circle s : shapes) {

            // Phải kiểm tra Cylinder trước
            if (s instanceof Cylinder) {
                soHinhTru++;
            } else if (s instanceof Circle) {
                soHinhTron++;
            }
        }

        System.out.println("So hinh tron: " + soHinhTron);
        System.out.println("So hinh tru: " + soHinhTru);

        // 4. Tính tổng thể tích các hình trụ
        double tongTheTich = 0;

        for (Circle s : shapes) {
            if (s instanceof Cylinder) {
                tongTheTich += ((Cylinder) s).getVolume();
            }
        }

        System.out.printf("Tong the tich cac hinh tru: %.2f%n",
                tongTheTich);
    }
}

