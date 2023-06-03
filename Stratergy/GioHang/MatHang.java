package Stratergy.GioHang;

public class MatHang {
    String tenMH;
    int sl;
    double donGia;

    public MatHang(String tenMH, int sl, double donGia) {
        this.tenMH = tenMH;
        this.sl = sl;
        this.donGia = donGia;
    }

    public String getTenMH() {
        return tenMH;
    }

    public void setTenMH(String tenMH) {
        this.tenMH = tenMH;
    }

    public int getSl() {
        return sl;
    }

    public void setSl(int sl) {
        this.sl = sl;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }
}
