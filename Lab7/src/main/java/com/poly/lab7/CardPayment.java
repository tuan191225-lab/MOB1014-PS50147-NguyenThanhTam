/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.lab7;

/**
 *
 * @author NGUYEN THANH TAM
 */
public class CardPayment implements Payment {
    @Override
    public double pay(double amount) {
        double discountedAmount = amount * 0.95;
        return discountedAmount + discountedAmount * TAX;
    }
}
