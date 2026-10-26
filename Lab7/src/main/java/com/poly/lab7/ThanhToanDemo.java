/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.lab7;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author NGUYEN THANH TAM
 */
public class ThanhToanDemo {
    
    public static void main(String[] args) {

        // Danh sách giá trị đơn hàng
        double[] donHang = {100000, 250000, 1000000};

        // Danh sách các phương thức thanh toán
        List<Payment> methods = new ArrayList<>();

        methods.add(new CashPayment());
        methods.add(new CardPayment());

        // Duyệt từng đơn hàng
        for (double amount : donHang) {
            System.out.printf("Don hang %.0f: ", amount);

            for (int i = 0; i < methods.size(); i++) {
                Payment p = methods.get(i);

                double result = p.pay(amount);

                if (i == 0) {
                    System.out.printf("Tien mat = %.0f", result);
                } else {
                    System.out.printf(" | The = %.0f", result);
                }
            }

            System.out.println();
        }
    }
}

