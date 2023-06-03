public class SinhVienNhi {
  String maSV,hoTenSV,queQuan,ngaySinh;
    public String getMaSV() {
        return maSV;
    }
    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }
    public String getHoTenSV() {
        return hoTenSV;
    }
    public void setHoTenSV(String hoTenSV) {
        this.hoTenSV = hoTenSV;
    }
    public String getQueQuan() {
        return queQuan;
    }
    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }
    public String getNgaySinh() {
        return ngaySinh;
    }
    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }
    @Override
    public String toString() {
        return "SinhVienNhi{" +
                "maSV='" + maSV + '\'' +
                ", hoTenSV='" + hoTenSV + '\'' +
                ", queQuan='" + queQuan + '\'' +
                ", ngaySinh='" + ngaySinh + '\'' +
                '}';
    }
    public SinhVienNhi(String maSV, String hoTenSV, String queQuan, String ngaySinh) {
        this.maSV = maSV;
        this.hoTenSV = hoTenSV;
        this.queQuan = queQuan;
        this.ngaySinh = ngaySinh;
    }
}
