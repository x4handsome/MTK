public class NhanVien implements XuLyKhoanVay{
    String ten,chucVu;
    int max;

    public NhanVien(String ten, String chucVu, int max) {
        this.ten = ten;
        this.chucVu = chucVu;
        this.max = max;
    }

    XuLyKhoanVay sep;
    @Override
    public XuLyKhoanVay setSuccessor(XuLyKhoanVay handler) {
        sep= handler;
        return handler;
    }

    @Override
    public String xuLy(int tienVay) {
     if(tienVay<=max)
         return chucVu+" "+ten+" chiu trach nhiem cho vay";
     return sep.xuLy(tienVay);
    }
}
