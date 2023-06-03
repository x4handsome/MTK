package ChuyenXe;

public class XeNoiThanh extends ChuyenXe {
    int soTuyen, soKm;

    public XeNoiThanh(String maChuyen, String hoTen, String soXe, double doanhThu, int soTuyen, int soKm) {
        super(maChuyen, hoTen, soXe, doanhThu);
        this.soTuyen = soTuyen;
        this.soKm = soKm;
    }

    @Override
    public String toString() {
        return "XeNoiThanh{" +
                "soTuyen=" + soTuyen +
                ", soKm=" + soKm +
                ", maChuyen='" + maChuyen + '\'' +
                ", hoTen='" + hoTen + '\'' +
                ", soXe='" + soXe + '\'' +
                ", doanhThu=" + doanhThu +
                '}';
    }

    public int getSoTuyen() {
        return soTuyen;
    }

    public void setSoTuyen(int soTuyen) {
        this.soTuyen = soTuyen;
    }

    public int getSoKm() {
        return soKm;
    }

    public void setSoKm(int soKm) {
        this.soKm = soKm;
    }
}
