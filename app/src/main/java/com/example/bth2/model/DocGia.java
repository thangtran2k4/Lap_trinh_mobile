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

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public int getSoSach() {
        return soSach;
    }

    public void setSoSach(int soSach) {
        this.soSach = soSach;
    }

    public String getNgay() {
        return ngay;
    }

    public void setNgay(String ngay) {
        this.ngay = ngay;
    }

    public String getLoai() {
        return loai;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }
}
