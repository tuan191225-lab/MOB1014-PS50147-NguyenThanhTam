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
public class muaTrongNam {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap Thang: ");
        int Thang = sc.nextInt();
    switch (Thang){
        case 1, 2, 3 -> System.out.println("Thang:" + Thang + "\tMua Xuan");
        case 4, 5, 6 -> System.out.println("Thang:" + Thang + "\tMua Ha");
        case 7, 8, 9 -> System.out.println("Thang:" + Thang + "\tMua Thu");
        case 10, 11, 12 -> System.out.println("Thang:" + Thang + "\tMua Dong");
        default -> System.out.println("Thang Khong Hop Le");
    }   
    }
}
