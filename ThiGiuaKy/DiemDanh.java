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
public class DiemDanh {
    private String ten,tiethoc;
    private Date ngay;
    private static DiemDanh DiemDanhSV;
    public String DiemDanhsv(SinhVien ten, SinhVien tiethoc, SinhVien ngay){
        return "DiemDanh{" + "ten=" + ten + ", tiethoc=" + tiethoc + ", ngay=" + ngay + '}';
    }
    
    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getTiethoc() {
        return tiethoc;
    }

    public void setTiethoc(String tiethoc) {
        this.tiethoc = tiethoc;
    }

    public Date getNgay() {
        return ngay;
    }

    public void setNgay(Date ngay) {
        this.ngay = ngay;
    }
    
}
