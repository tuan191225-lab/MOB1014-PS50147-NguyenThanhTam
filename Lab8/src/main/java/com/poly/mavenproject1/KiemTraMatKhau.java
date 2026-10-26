/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.mavenproject1;
import java.util.Scanner;
/**
 *
 * @author NGUYEN THANH TAM
 */
public class KiemTraMatKhau {
     public static void kiemTra(String pw) throws InvalidPasswordException {
        if (pw.length() < 8) {
            throw new InvalidPasswordException("Mat khau phai co it nhat 8 ky tu");
        }
        
        int demHoa = 0;
        int demThuong = 0;
        int demSo = 0;
        int demDacBiet = 0;
        String kyTuDacBiet = "!@#$%^&*";
        
        for (int i = 0; i < pw.length(); i++) {
            char c = pw.charAt(i);
            if (Character.isUpperCase(c)) {
                demHoa++;
            } else if (Character.isLowerCase(c)) {
                demThuong++;
            } else if (Character.isDigit(c)) {
                demSo++;
            } else if (kyTuDacBiet.indexOf(c) >= 0) {
                demDacBiet++;
            }
        }
        
        if (demHoa < 2) {
            throw new InvalidPasswordException("Mat khau phai co it nhat 2 chu hoa");
        }
        if (demThuong < 2) {
            throw new InvalidPasswordException("Mat khau phai co it nhat 2 chu thuong");
        }
        if (demSo < 3) {
            throw new InvalidPasswordException("Mat khau phai co it nhat 3 chu so");
        }
        if (demDacBiet < 1) {
            throw new InvalidPasswordException("Mat khau phai co it nhat 1 ky tu dac biet (!@#$%^&*)");
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pw;
        
        while (true) {
            System.out.print("Nhap mat khau: ");
            pw = sc.nextLine();

            try {
                kiemTra(pw);
                System.out.println("Mat khau hop le!");
                break;
            } catch (InvalidPasswordException e) {
                System.out.println("Loi: " + e.getMessage());
            }
        }
    }
}


