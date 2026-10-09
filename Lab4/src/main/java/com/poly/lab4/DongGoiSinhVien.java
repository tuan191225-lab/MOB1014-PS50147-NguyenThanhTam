/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.lab4;

/**
 *
 * @author NGUYEN THANH TAM
 */
public class DongGoiSinhVien {
    
    public static void main(String[] args) {
        Student sv = new Student(
            "PS002", "Tran Thanh Nghia", 20, 7.0
        );

        sv.setGpa(12);

        System.out.printf(
            "GPA hien tai: %.2f%n", sv.getGpa()
        );

        sv.setGpa(9.2);
        sv.output();
    }
}

