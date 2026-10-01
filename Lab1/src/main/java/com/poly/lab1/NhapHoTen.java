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
public class NhapHoTen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String hoTen;
        int namSinh;
        
        System.out.print("Nhap ho ten: ");
        hoTen = sc.nextLine();
        System.out.print("Nhap nam sinh: ");
        namSinh = sc.nextInt();
        
        System.out.printf("Ho ten %s, tuoi: %d \n", hoTen, 2026 - namSinh); 
    }
}
