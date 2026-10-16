/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.asm1;
import java.util.Scanner;
/**
 *
 * @author NGUYEN THANH TAM
 */
public class SanPham {
    
    public String maSP;
    public String tenSP;
    public double donGia;
    public int soLuong;

    public SanPham() {
    }

    public SanPham(String maSP, String tenSP, double donGia, int soLuong) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.donGia = donGia;
        this.soLuong = soLuong;
    }
    
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        String maSPMau = "^SP[0-9]{3}$";
        System.out.print("Nhap ma san pham: ");
        this.maSP = sc.nextLine();
        if (!maSP.matches(maSPMau)){
            System.out.println("Ma SP phai co dang SPxxx (x la chu so)");
            return;
        }
        System.out.print("Nhap ten san pham: ");
        this.tenSP = sc.nextLine();
        
        System.out.print("Nhap don gia: ");
        this.donGia = sc.nextDouble();
        
        System.out.print("Nhap so luong: ");
        this.soLuong = sc.nextInt();
        sc.nextLine();
    }
    
    public void xuat() {
        System.out.println("=== THONG TIN SAN PHAM ===");
        System.out.printf("Ma: %s | Ten: %s | Don gia: %.0f | So luong: %d\n", this.maSP, this.tenSP, this.donGia, this.soLuong);
    }
    
    public double thanhTien() {
        return this.donGia * this.soLuong;
    }
    
    public void capNhat() {
        int choice;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma san pham can cap nhat: ");
        String maSPUpdate = sc.nextLine();
        if (maSPUpdate.toLowerCase().equals(this.maSP.toLowerCase())) {
            do {
                System.out.println("Ban muon cap nhat thong tin?");
                System.out.println("1. Ten san pham | 2. Don gia | 3. So luong | 4. Thoat cap nhat");
                System.out.print("Moi chon(1-4): ");
                choice = sc.nextInt();
                sc.nextLine();
                switch (choice) {
                    case 1:
                        System.out.print("Nhap ten moi: ");
                        String newName = sc.nextLine();
                        this.tenSP = newName;
                        System.out.println("\nBan da cap nhat ten thanh cong");
                        break;
                    case 2:
                        System.out.print("Nhap don gia moi: ");
                        double newPrice = sc.nextDouble();
                        this.donGia = newPrice;
                        sc.nextLine();
                        System.out.println("\nBan da cap nhat don gia thanh cong");
                        break;
                    case 3:
                        System.out.print("Nhap so luong moi: ");
                        int newQuantity = sc.nextInt();
                        this.soLuong = newQuantity;
                        sc.nextLine();
                        System.out.println("\nBan da cap nhat so luong thanh cong");
                        break;
                    case 4:
                        System.out.println("Da thoat!");
                        break;
                    default:
                        System.out.println("Khong co chuc nang nay");
                }
            }while (choice != 4);
        }
        else {
            System.out.println("Khong ton tai san pham nay");
        }
    }
}
