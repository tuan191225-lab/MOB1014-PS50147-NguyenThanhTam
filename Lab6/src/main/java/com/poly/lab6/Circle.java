/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.lab6;

/**
 *
 * @author NGUYEN THANH TAM
 */
public class Circle {

    protected double radius;
    protected String color;

    // Constructor không tham số
    public Circle() {
        radius = 1.0;
        color = "Trang";
    }

    // Constructor có tham số
    public Circle(double radius, String color) {
        setRadius(radius);
        this.color = color;
    }

    // Getter / Setter
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius > 0) {
            this.radius = radius;
        } else {
            System.out.println("Ban kinh khong hop le");
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Tính chu vi
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    // Tính diện tích
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // Ghi đè toString()
    @Override
    public String toString() {
        return String.format(
            "Hinh tron [ban kinh=%.2f, mau=%s, chu vi=%.2f, dien tich=%.2f]",
            radius, color, getPerimeter(), getArea()
        );
    }
}

