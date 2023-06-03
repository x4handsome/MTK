
import java.util.ArrayList;
import java.util.List;

public class HoaDon {
    HoaDonHeader hdhd;
    private List<CTHD> cthd;

    public HoaDon(Builder b) {
        this.hdhd = b.hdhd;
        this.cthd = b.cthd;
    }

    public static class Builder {
        private HoaDonHeader hdhd;
        private List<CTHD> cthd = new ArrayList<CTHD>();

        public Builder addHDHD(String MHD, String NgayBan, String TenKH) {
            this.hdhd = new HoaDonHeader(MHD, NgayBan, TenKH);
            return this;
        }

        public Builder addCTHD(int Soluong, String Sanpham, double Dongia, double Chietkhau) {
            this.cthd.add(new CTHD(Soluong, Sanpham, Dongia, Chietkhau));
            return this;
        }

        public HoaDon build() {
            return new HoaDon(this);
        }
    }

    @Override
    public String toString() {
        return "HoaDon{" +
                "hóa đơn bao gồm=" + hdhd +
                ", chi tiết hóa đơn=" + cthd +
                '}';
    }
}
