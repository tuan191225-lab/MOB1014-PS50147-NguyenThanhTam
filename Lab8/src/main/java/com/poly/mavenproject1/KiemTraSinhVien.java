/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.mavenproject1;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
/**
 *
 * @author NGUYEN THANH TAM
 */
public class KiemTraSinhVien {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String id, name, email, phone;
        String regexId = "^SV[0-9]{3}$";
        String regexName = "^[a-zA-Z ]+$";
        String regexEmail = "^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,}$";
        String regexPhone = "^0[0-9]{9}$";
        boolean isMatched = false;
        do {
            System.out.print("Nhap MSSV: ");
            id = sc.nextLine();
            if (!id.matches(regexId))
                System.out.println("Ma SV phai co dang SVxxx (x la chu so)");
        }while(!id.matches(regexId));
        
        do {
            System.out.print("Nhap ten: ");
            name = sc.nextLine();
            if (!name.matches(regexName))
                System.out.println("Ho ten chi duoc chua chu cai va khoang trang");
        }while (!name.matches(regexName));
        
        do {
            System.out.print("Nhap so dien thoai: ");
            phone = sc.nextLine();
            
            Pattern pattern = Pattern.compile(regexPhone);
            Matcher matcher = pattern.matcher(phone);
            isMatched = matcher.matches();
            if (!isMatched)
                System.out.println("So dien thoai phai bat dau bang 0 va co 10 chu so");
        }while (!isMatched);
        
        do {
            System.out.print("Nhap email: ");
            email = sc.nextLine();
            if (!email.matches(regexEmail))
                System.out.println("Email khong dung dinh dang");
        }while (!email.matches(regexEmail));
        
        System.out.println("\n=== THONG TIN SINH VIEN HOP LE ===");
        System.out.println("Ma SV: " + id);
        System.out.println("Ho ten: " + name);
        System.out.println("So dien thoai: " + phone);
        System.out.println("Email: " + email);
    }
}
