/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.lab6;

/**
 *
 * @author NGUYEN THANH TAM
 */
public class Cylinder extends Circle {

    private double height;

    // Constructor
    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        setHeight(height);
    }

    // Getter
    public double getHeight() {
        return height;
    }

    // Setter
    public void setHeight(double height) {
        if (height > 0) {
            this.height = height;
        } else {
            System.out.println("Chieu cao khong hop le");
        }
    }

    // Diện tích toàn phần
    @Override
    public double getArea() {
        return 2 * Math.PI * radius * height
                + 2 * Math.PI * radius * radius;
    }

    // Thể tích
    public double getVolume() {
        return super.getArea() * height;
    }

    // toString
    @Override
    public String toString() {
        return String.format(
            "Hinh tru [ban kinh = %.2f, mau = %s, chieu cao = %.2f, dien tich toan phan = %.2f, the tich = %.2f]",
            radius, color, height, getArea(), getVolume()
        );
    }
}


