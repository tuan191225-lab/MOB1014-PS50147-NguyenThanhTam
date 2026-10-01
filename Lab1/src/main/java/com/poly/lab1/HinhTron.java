/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.lab1;

import java.util.Scanner;

/**
 *
 * @author NGUYEN THANH TAM
 */
public class HinhTron {
    public static void main(String[] args) {
        final double PI = 3.14159;
        Scanner sc = new Scanner(System.in);
        double r, cv ,dt;
        
        System.out.print("Nhap ban kinh: ");
        r = sc.nextDouble();
        
        cv = 2 * PI * r;
        dt = PI * (r*r);
        
        System.out.printf("Ban kinh: %.2f\nChu vi: %.2f\nDien tich: %.2f", r, cv, dt); 
    }
}
