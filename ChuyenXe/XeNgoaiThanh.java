package ChuyenXe;

public class XeNgoaiThanh extends ChuyenXe {
    String noiDen;
    int soNgayDiDuoc;

    public XeNgoaiThanh(String maChuyen, String hoTen, String soXe, double doanhThu, String noiDen, int soNgayDiDuoc) {
        super(maChuyen, hoTen, soXe, doanhThu);
        this.noiDen = noiDen;
        this.soNgayDiDuoc = soNgayDiDuoc;
    }

    @Override
    public String toString() {
        return "XeNgoaiThanh{" +
                "noiDen='" + noiDen + '\'' +
                ", soNgayDiDuoc=" + soNgayDiDuoc +
                ", maChuyen='" + maChuyen + '\'' +
                ", hoTen='" + hoTen + '\'' +
                ", soXe='" + soXe + '\'' +
                ", doanhThu=" + doanhThu +
                '}';
    }

    public String getNoiDen() {
        return noiDen;
    }

    public void setNoiDen(String noiDen) {
        this.noiDen = noiDen;
    }

    public int getSoNgayDiDuoc() {
        return soNgayDiDuoc;
    }

    public void setSoNgayDiDuoc(int soNgayDiDuoc) {
        this.soNgayDiDuoc = soNgayDiDuoc;
    }
}
