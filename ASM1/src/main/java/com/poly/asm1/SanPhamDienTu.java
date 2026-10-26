/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.asm1;

/**
 *
 * @author NGUYEN THANH TAM
 */
public class SanPhamDienTu extends SanPham{
    public String ngayBaoHanh;

    public SanPhamDienTu(String maSP, String tenSP, double donGia, int soLuong, String ngayBaoHanh) {
        super(maSP, tenSP, donGia, soLuong);
        this.ngayBaoHanh = ngayBaoHanh;
    }

    public String getNgayBaoHanh() {
        return ngayBaoHanh;
    }

    @Override
    public void capNhat() {
        super.capNhat();
    }

    @Override
    public double thanhTien() {
        return super.thanhTien();
    }

    @Override
    public void xuat() {
        super.xuat();
    }

    @Override
    public void nhap() {
        super.nhap();
    }
}
