/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Builder_HoaDon;

/**
 *
 * @author Nguyen Quoc Chau IT
 */
public class CTHD {
    private int Soluong ;
    private String Sanpham;
    private double Dongia, Chietkhau;

    public CTHD(int Soluong, String Sanpham, double Dongia, double Chietkhau) {
        this.Soluong = Soluong;
        this.Sanpham = Sanpham;
        this.Dongia = Dongia;
        this.Chietkhau = Chietkhau;
    }  
    
    @Override
    public String toString() {
        return "\nCTHD : " + "\nSoluong=" + Soluong + ",\n Sanpham=" + Sanpham + ",\n Dongia=" + Dongia + ",\n Chietkhau=" + Chietkhau ;
    }
}
