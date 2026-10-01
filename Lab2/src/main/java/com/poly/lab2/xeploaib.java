/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab2;
import java.util.Scanner;
/**
 *
 * @author NGUYEN THANH TAM
 */
public class xeploaib {
    
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       System.out.print("Nhap diem toan: ");
       double toan = sc.nextDouble();
       System.out.print("Nhap diem ly: ");
       double ly = sc.nextDouble();
       System.out.print("Nhap diem hoa: ");
       double hoa = sc.nextDouble();
       
       if (toan < 0 || toan > 10 || ly < 0 || ly > 10 || hoa < 0 || hoa > 10){
           System.out.println("Diem Khong Hop Le");
           return;
       }
       double dtb = (toan * 2 + ly + hoa) / 4;
       System.out.printf("Diem Trung Binh: %.2f\n",dtb);
       if (dtb >= 8.0){
           System.out.println("Xep Loai: Gioi");
       } else if (dtb >= 6.5){
           System.out.println("Xep Loai: Kha");
       } else if (dtb >= 5.0){
           System.out.println("Xep Loai: Trung binh");
       } else {
           System.out.println("Xep Loai: Yeu");
       }
    }
}
