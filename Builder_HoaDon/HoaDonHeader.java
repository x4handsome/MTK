/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Builder_HoaDon;

/**
 *
 * @author Nguyen Quoc Chau IT
 */
public class HoaDonHeader {
    @Override
    public String toString() {
        return "\nMHD = " + MHD + ",\n NgayBan = " + NgayBan + ",\n TenKH = " + TenKH ;
    }
    private String MHD,NgayBan,TenKH ;

    public HoaDonHeader(String MHD, String NgayBan, String TenKH) {
        this.MHD = MHD;
        this.NgayBan = NgayBan;
        this.TenKH = TenKH;
    }

    public String getMHD() {
        return MHD;
    }

    public String getNgayBan() {
        return NgayBan;
    }

    public String getTenKH() {
        return TenKH;
    }

    public void setMHD(String MHD) {
        this.MHD = MHD;
    }

    public void setNgayBan(String NgayBan) {
        this.NgayBan = NgayBan;
    }

    public void setTenKH(String TenKH) {
        this.TenKH = TenKH;
    }
}
