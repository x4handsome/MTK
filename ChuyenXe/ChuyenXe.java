package ChuyenXe;

public class ChuyenXe {
    // Mã số chuyến, Họ tên tài xế, số xe
    String maChuyen,hoTen,soXe;
    double doanhThu;

    public ChuyenXe(String maChuyen, String hoTen, String soXe, double doanhThu) {
        this.maChuyen = maChuyen;
        this.hoTen = hoTen;
        this.soXe = soXe;
        this.doanhThu = doanhThu;
    }

    public String getMaChuyen() {
        return maChuyen;
    }

    public void setMaChuyen(String maChuyen) {
        this.maChuyen = maChuyen;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getSoXe() {
        return soXe;
    }

    public void setSoXe(String soXe) {
        this.soXe = soXe;
    }

    public double getDoanhThu() {
        return doanhThu;
    }

    public void setDoanhThu(double doanhThu) {
        this.doanhThu = doanhThu;
    }

}
