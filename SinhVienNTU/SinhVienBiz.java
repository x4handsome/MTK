package SinhVienNTU;

public class SinhVienBiz extends SinhVienNTU{
    double diemMarketing,sale;

    public SinhVienBiz(String hoTen, String nganh, double diemMarketing, double sale) {
        super(hoTen, nganh);
        this.diemMarketing = diemMarketing;
        this.sale = sale;
    }
    @Override
    public double getDiem() {
        return ((2*diemMarketing)+sale)/3;
    }
}
