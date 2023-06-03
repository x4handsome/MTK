/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Builder_HoaDon;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Nguyen Quoc Chau IT
 */
public class HoaDon {
    HoaDonHeader hdhd;
    private List<CTHD> cthd ;
    
    public HoaDon(HoaDonHeader hdhd, List<CTHD> cthd) {
        this.hdhd = hdhd;
        this.cthd = cthd;
    }
    
    public static class Builder{
        private HoaDonHeader hdhd;
        private List<CTHD> cthd = new ArrayList<CTHD>();
        
        public Builder addHDHD(String MHD, String NgayBan,String TenKH){
            this.hdhd = new HoaDonHeader(MHD, NgayBan, TenKH);
            return this;
        }
        public Builder addCTHD(int Soluong,String Sanpham,double Dongia , double Chietkhau ){
            this.cthd.add(new CTHD(Soluong, Sanpham, Dongia, Chietkhau));
            return this;
        }
        public  HoaDon build()
        {
            return new HoaDon(hdhd,cthd);
        }

    }

    @Override
    public String toString() {
        return "\n Hóa đơn bao gồm "  + hdhd +" \nChi tiết hóa đđo : "+ cthd ;
    }
    
}
