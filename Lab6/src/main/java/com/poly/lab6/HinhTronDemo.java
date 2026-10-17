/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.lab6;

/**
 *
 * @author NGUYEN THANH TAM
 */
public class HinhTronDemo {
    
    public static void main(String[] args) {

        // Tạo c1 bằng constructor không tham số
        Circle c1 = new Circle();

        // Tạo c2 bằng constructor có tham số
        Circle c2 = new Circle(2.5, "Do");

        // In hai hình tròn
        System.out.println(c1);
        System.out.println(c2);

        // Kiểm tra bán kính không hợp lệ
        c2.setRadius(-3);

        // In lại c2
        System.out.println(c2);
    }
}
