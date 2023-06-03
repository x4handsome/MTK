/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NhanVien;

/**
 *
 * @author Nguyen Quoc Chau IT
 */
public class nhanVien {
    String ten, diachi;
    int tuoi;
    double luong;
    int tongSoGioLam;

    public nhanVien(String ten, String diachi, int tuoi, double luong, int tongSoGioLam) {
        this.ten = ten;
        this.diachi = diachi;
        this.tuoi = tuoi;
        this.luong = luong;
        this.tongSoGioLam = tongSoGioLam;
    }

    

    public String getTen() {
        return ten;
    }

    public String getDiachi() {
        return diachi;
    }

    public int getTuoi() {
        return tuoi;
    }

    public double getLuong() {
        return luong;
    }

    public int getTongSoGioLam() {
        return tongSoGioLam;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }

    public void setTongSoGioLam(int tongSoGioLam) {
        this.tongSoGioLam = tongSoGioLam;
    }
    
}
