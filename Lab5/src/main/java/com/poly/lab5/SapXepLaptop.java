/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.lab5;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
/**
 *
 * @author NGUYEN THANH TAM
 */
public class SapXepLaptop {

    public static void main(String[] args) {

        // Tao danh sach laptop mau
        List<Laptop> list = new ArrayList<>();

        list.add(new Laptop("LT01", "Dell Inspiron 15",
                "Van phong", 15500000, 10));

        list.add(new Laptop("LT02", "Asus TUF Gaming F15",
                "Gaming", 22990000, 5));

        list.add(new Laptop("LT03", "MacBook Air M2",
                "Van phong", 24990000, 8));

        list.add(new Laptop("LT04", "Lenovo Legion 5",
                "Gaming", 32500000, 0));

        list.add(new Laptop("LT05", "HP Pavilion 14",
                "Van phong", 17800000, 0));

        // =====================================
        // 1. SAP XEP THEO TEN TANG DAN
        //    BUBBLE SORT
        // =====================================

        for (int i = 0; i < list.size() - 1; i++) {

            for (int j = 0; j < list.size() - 1 - i; j++) {

                if (list.get(j).getName()
                        .compareToIgnoreCase(list.get(j + 1).getName()) > 0) {

                    // Hoan doi hai phan tu
                    Laptop temp = list.get(j);

                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }
        }

        System.out.println("=== SAP XEP THEO TEN (A-Z) ===");

        for (Laptop laptop : list) {
            laptop.output();
        }

        // =====================================
        // 2. SAP XEP THEO GIA GIAM DAN
        //    COLLECTIONS.SORT + COMPARATOR
        // =====================================

        Collections.sort(list, new Comparator<Laptop>() {

            @Override
            public int compare(Laptop a, Laptop b) {
                return Double.compare(a.getPrice(), b.getPrice());
            }
        });

        // Dao nguoc danh sach -> gia giam dan
        Collections.reverse(list);

        System.out.println("=== SAP XEP THEO GIA GIAM DAN ===");

        for (Laptop laptop : list) {
            laptop.output();
        }
    }
}

