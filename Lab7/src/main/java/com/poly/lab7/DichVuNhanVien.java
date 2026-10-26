/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.lab7;

/**
 *
 * @author NGUYEN THANH TAM
 */
public class DichVuNhanVien {
    public static void main(String[] args) {

        // Khai báo thông qua kiểu interface
        EmployeeService service = new EmployeeServiceImpl();

        // Thêm 4 nhân viên
        Employee nv1 = new FullTimeEmployee(
                "FT01", "Nguyen Van An", 12000000);

        Employee nv2 = new PartTimeEmployee(
                "PT01", "Tran Thi Binh", 80, 50000);

        Employee nv3 = new FullTimeEmployee(
                "FT02", "Le Van Cuong", 15500000);

        Employee nv4 = new FullTimeEmployee(
                "ft01", "Ngo Van Giang", 9000000);

        // Thêm nhân viên và in kết quả
        if (service.add(nv1)) {
            System.out.println("Them thanh cong: " + nv1.getId());
        } else {
            System.out.println("Them that bai, trung ID: " + nv1.getId());
        }

        if (service.add(nv2)) {
            System.out.println("Them thanh cong: " + nv2.getId());
        } else {
            System.out.println("Them that bai, trung ID: " + nv2.getId());
        }

        if (service.add(nv3)) {
            System.out.println("Them thanh cong: " + nv3.getId());
        } else {
            System.out.println("Them that bai, trung ID: " + nv3.getId());
        }

        if (service.add(nv4)) {
            System.out.println("Them thanh cong: " + nv4.getId());
        } else {
            System.out.println("Them that bai, trung ID: " + nv4.getId());
        }

        // Tìm nhân viên PT01
        Employee found = service.findById("pt01");

        if (found != null) {
            System.out.println(
                    "Tim thay: " + found
                    + " -> Luong: "
                    + String.format("%.0f", found.getSalary()));
        } else {
            System.out.println("Khong tim thay nhan vien pt01");
        }

        // Tìm nhân viên XX99
        found = service.findById("XX99");

        if (found != null) {
            System.out.println(
                    "Tim thay: " + found
                    + " -> Luong: "
                    + String.format("%.0f", found.getSalary()));
        } else {
            System.out.println("Khong tim thay nhan vien XX99");
        }

        // Xuất toàn bộ danh sách
        System.out.println("=== DANH SACH NHAN VIEN ===");

        for (Employee e : service.getAll()) {
            System.out.println(
                    e + " -> Luong: "
                    + String.format("%.0f", e.getSalary()));
        }

        // Tổng lương
        System.out.printf(
                "Tong luong: %.0f%n",
                service.getTotalSalary());
    }
}
