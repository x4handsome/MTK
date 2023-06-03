import java.util.Date;

public class HoaDonHeader {
    private String mahoadon;
    private String tenkhachhang;
    private Date ngayban;

    public HoaDonHeader(String mahoadon, String tenkhachhang, Date ngayban) {
        this.mahoadon = mahoadon;
        this.tenkhachhang = tenkhachhang;
        this.ngayban = ngayban;
    }
    public HoaDonHeader(){}

    public String getMahoadon() {
        return mahoadon;
    }

    public void setMahoadon(String mahoadon) {
        this.mahoadon = mahoadon;
    }

    public String getTenkhachhang() {
        return tenkhachhang;
    }

    public void setTenkhachhang(String tenkhachhang) {
        this.tenkhachhang = tenkhachhang;
    }

    public Date getNgayban() {
        return ngayban;
    }

    public void setNgayban(Date ngayban) {
        this.ngayban = ngayban;
    }

    @Override
    public String toString() {
        return "HoaDonHeader{" +
                "mahoadon='" + mahoadon + '\'' +
                ", tenkhachhang='" + tenkhachhang + '\'' +
                ", ngayban=" + ngayban +
                '}';
    }
}
