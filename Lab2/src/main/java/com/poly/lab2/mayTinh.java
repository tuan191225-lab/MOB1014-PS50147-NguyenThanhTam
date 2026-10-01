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
public class mayTinh {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap a: ");
        double a = sc.nextDouble();
        System.out.print("Nhap b: ");
        double b = sc.nextDouble();
        System.out.print("Nhap phep toan: ");
        char op = sc.next().charAt(0);
        
        switch (op) {
            case '+':
                System.out.printf("%.2f + %.2f = %.2f%n", a, b, a + b);
                break;

            case '-':
                System.out.printf("%.2f - %.2f = %.2f%n", a, b, a - b);
                break;

            case '*':
                System.out.printf("%.2f * %.2f = %.2f%n", a, b, a * b);
                break;

            case '/':
                if (b == 0) {
                    System.out.println("Khong the chia cho 0");
                } else {
                    System.out.printf("%.2f / %.2f = %.2f\n", a, b, a / b);
                }
                break;

            default:
                System.out.println("Phep toan khong hop le");
        }
    }
}
