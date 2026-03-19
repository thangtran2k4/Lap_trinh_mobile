package com.example.bth2.model;

public class DocGia {

    String ten;
    String ma;
    int soSach;
    String ngay;
    String loai;

    public DocGia(String ten, String ma, int soSach, String ngay, String loai) {
        this.ten = ten;
        this.ma = ma;
        this.soSach = soSach;
        this.ngay = ngay;
        this.loai = loai;
    }

    public int tinhPhi() {
        if (loai.equals("GV"))
            return soSach * 5000;
        else
            return soSach * 2000;
    }

    @Override
    public String toString() {
        return ten +
                " - " +
                loai +
                " - phí: " +
                tinhPhi();
    }
}
