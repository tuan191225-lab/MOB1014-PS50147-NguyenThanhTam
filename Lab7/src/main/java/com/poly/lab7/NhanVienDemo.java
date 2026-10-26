/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.lab7;

/**
 *
 * @author NGUYEN THANH TAM
 */
public class NhanVienDemo {

    public static void main(String[] args) {
        FullTimeEmployee nv1 =
                new FullTimeEmployee("FT01", "Nguyen Van An", 12000000);

        PartTimeEmployee nv2 =
                new PartTimeEmployee("PT01", "Tran Thi Binh", 80, 50000);

        System.out.println(nv1);
        System.out.printf("Luong: %.0f%n", nv1.getSalary());

        System.out.println(nv2);
        System.out.printf("Luong: %.0f%n", nv2.getSalary());
    }
}
