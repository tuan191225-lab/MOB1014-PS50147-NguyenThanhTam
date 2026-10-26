/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.lab7;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/**
 *
 * @author NGUYEN THANH TAM
 */
public class QuanLyNhanVien {

    public static void main(String[] args) {

        // 1. Khai báo danh sách và thêm 5 nhân viên
        List<Employee> list = new ArrayList<>();

        list.add(new FullTimeEmployee(
                "FT01", "Nguyen Van An", 12000000));

        list.add(new PartTimeEmployee(
                "PT01", "Tran Thi Binh", 80, 50000));

        list.add(new FullTimeEmployee(
                "FT02", "Le Van Cuong", 15500000));

        list.add(new PartTimeEmployee(
                "PT02", "Pham Thi Dung", 120, 60000));

        list.add(new PartTimeEmployee(
                "PT03", "Hoang Van Em", 200, 90000));

        // 2. Duyệt danh sách, in thông tin và lương
        System.out.println("=== DANH SACH NHAN VIEN ===");

        for (Employee e : list) {
            System.out.println(e + " -> Luong: "
                    + String.format("%.0f", e.getSalary()));
        }

        // 3. Tính tổng quỹ lương
        double totalSalary = 0;

        for (Employee e : list) {
            totalSalary += e.getSalary();
        }

        System.out.printf("Tong quy luong: %.0f%n", totalSalary);

        // 4. Tìm nhân viên có lương cao nhất
        Employee maxEmployee = list.get(0);

        for (Employee e : list) {
            if (e.getSalary() > maxEmployee.getSalary()) {
                maxEmployee = e;
            }
        }

        System.out.printf(
                "Nhan vien luong cao nhat: %s -> Luong: %.0f%n",
                maxEmployee,
                maxEmployee.getSalary()
        );

        // 5. Sắp xếp lương giảm dần bằng Collections.sort()
        Collections.sort(list, (a, b) ->
                Double.compare(b.getSalary(), a.getSalary()));

        // 6. Xuất danh sách sau khi sắp xếp
        System.out.println("=== SAP XEP THEO LUONG GIAM DAN ===");

        for (Employee e : list) {
            System.out.println(e + " -> Luong: "
                    + String.format("%.0f", e.getSalary()));
        }
    }
}

