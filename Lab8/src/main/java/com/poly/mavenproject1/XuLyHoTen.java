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
public class XuLyHoTen {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;
        
        System.out.print("Nhap ten: ");
        name = sc.nextLine();
        
        String nameTrim = name.trim();
        System.out.printf("Sau trim: %s (%d ky tu)\n", nameTrim, nameTrim.length());
        
        String nameReplaceAll = nameTrim.replaceAll("\\s+", " ");
        System.out.println("Chuan hoa khoang trang: " + nameReplaceAll);
        
        String nameUpper = nameReplaceAll.toUpperCase();
        System.out.println("In hoa: " + nameUpper);
        
        String[] nameSplit = nameUpper.split(" ");
        System.out.println("So tu: " + nameSplit.length);
        
        String namePerfect = "";
        for (int i = 0; i < nameSplit.length; i++) {
            if (i == nameSplit.length - 1) {
                namePerfect += nameSplit[i].substring(0, 1).toUpperCase() + nameSplit[i].substring(1).toLowerCase();
            }
            else {
                namePerfect += nameSplit[i].substring(0, 1).toUpperCase() + nameSplit[i].substring(1).toLowerCase() + " ";
            }
        }
        System.out.println("Ho ten chuan: " + namePerfect);
    }
}
