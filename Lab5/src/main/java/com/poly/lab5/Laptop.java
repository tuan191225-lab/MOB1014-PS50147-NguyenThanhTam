/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.lab5;
import java.util.Scanner;
/**
 *
 * @author NGUYEN THANH TAM
 */
public class Laptop {

    private String id;
    private String name;
    private String type;
    private double price;
    private int quantity;

    // Constructor khong tham so
    public Laptop() {
        this.id = "";
        this.name = "";
        this.type = "";
        this.price = 0;
        this.quantity = 0;
    }

    // Constructor co tham so
    public Laptop(String id, String name, String type,
                  double price, int quantity) {
        this();
        this.id = id;
        this.name = name;
        this.type = type;
        setPrice(price);
        setQuantity(quantity);
    }

    // Getter va Setter
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        } else {
            System.out.println("Gia khong hop le");
        }
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity >= 0) {
            this.quantity = quantity;
        } else {
            System.out.println("So luong khong hop le");
        }
    }

    // Nhap thong tin laptop
    public void input(Scanner sc) {
        System.out.print("Nhap ID: ");
        setId(sc.nextLine());

        System.out.print("Nhap ten laptop: ");
        setName(sc.nextLine());

        System.out.print("Nhap loai laptop: ");
        setType(sc.nextLine());

        System.out.print("Nhap gia: ");
        setPrice(Double.parseDouble(sc.nextLine()));

        System.out.print("Nhap so luong: ");
        setQuantity(Integer.parseInt(sc.nextLine()));
    }

    // Xuat thong tin laptop
    public void output() {
        System.out.printf(
            "ID: %s | Ten: %s | Loai: %s | Gia: %.0f | SL: %d%n",
            id, name, type, price, quantity
        );
    }
}
