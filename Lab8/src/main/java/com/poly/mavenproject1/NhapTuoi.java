/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.mavenproject1;
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 *
 * @author NGUYEN THANH TAM
 */
public class NhapTuoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = 0, count = 0;
        
        while (true) {
            try {
                System.out.print("Nhap tuoi: ");
                age = sc.nextInt();
                
                if (age <= 0) 
                    throw new IllegalArgumentException("Tuoi phai lon hon 0");
                
                break;
            }catch (InputMismatchException e) {
                System.out.println("Loi: Tuoi phai la so nguyen!");
                sc.nextLine();
            }catch (IllegalArgumentException e) {
                System.out.println("Loi: " + e.getMessage());
            }finally {
                count++;
                System.out.println("Da xu ly lan nhap thu " + count);
            }
        }
        System.out.println("Ket thuc qua trinh nhap du lieu. Tuoi hop le: " + age);
    }
}
