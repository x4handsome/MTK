/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ThiGiuaKy;

import java.util.Date;

/**
 *
 * @author Nguyen Quoc Chau IT
 */
public class SinhVien {
    String ten,tiethoc,ngay;

    public SinhVien(String ten, String tiethoc, String ngay) {
        this.ten = ten;
        this.tiethoc = tiethoc;
        this.ngay = ngay;
    }
    public void diemDanh(){
        DiemDanh dd = new DiemDanh();
        dd.DiemDanhsv(ten, tiethoc, ngay);
    }
    
}
