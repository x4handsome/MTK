
public class HoaDonHeader {
    private String MHD,ngayBan,tenKH;

    public HoaDonHeader(String MHD, String ngayBan, String tenKH) {
        this.MHD = MHD;
        this.ngayBan = ngayBan;
        this.tenKH = tenKH;
    }

    @Override
    public String toString() {
        return "HoaDonHeader{" +
                "MHD='" + this.MHD + '\'' +
                ", ngayBan='" + this.ngayBan + '\'' +
                ", tenKH='" + this.tenKH + '\'' +
                '}';
    }

    public String getMHD() {
        return MHD;
    }

    public void setMHD(String MHD) {
        this.MHD = MHD;
    }

    public String getNgayBan() {
        return ngayBan;
    }

    public void setNgayBan(String ngayBan) {
        this.ngayBan = ngayBan;
    }

    public String getTenKH() {
        return tenKH;
    }

    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
    }


}
