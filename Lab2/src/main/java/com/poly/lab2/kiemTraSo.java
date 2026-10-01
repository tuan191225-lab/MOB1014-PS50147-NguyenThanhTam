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
public class kiemTraSo {
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
           System.out.print("Nhap n: ");
        int n = sc.nextInt();
//kiểm tra chẵn lẻ 
        if (n % 2 == 0) {
            System.out.println(n + " la so chan");
        } else {
            System.out.println(n + " la so le");
        }
//kiểm tra âm dương 
        if (n > 0) {
            System.out.println(n + " la so duong");
        } else if (n < 0) {
            System.out.println(n + " la so am");
        } else {
            System.out.println(n + " bang 0");
        }
    }
}
