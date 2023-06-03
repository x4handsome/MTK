import java.util.ArrayList;
import java.util.List;

public class KeHoachKyHocNhi {
    SinhVienNhi sinhviennhi;
    private List<MonHocNhi> mh;
    private List<CaiThienNhi>ct;
    public KeHoachKyHocNhi(SinhVienNhi sinhvien, List<MonHocNhi> mh,List<CaiThienNhi> ct) {
        this.sinhviennhi = sinhvien;
        this.mh = mh;
        this.ct=ct;
    }
    public static class Builder_Nhi{
        private SinhVienNhi sinhviennhi;
        private List<MonHocNhi> mh = new ArrayList<MonHocNhi>();
        private List<CaiThienNhi>ct= new ArrayList<CaiThienNhi>();
        public Builder_Nhi addSVNhi(String maSV,String hoTenSV, String ngaySinh,String queQuan){
            this.sinhviennhi= new SinhVienNhi(maSV, hoTenSV, queQuan, ngaySinh);
            return this;
        }
        public Builder_Nhi addMH_Nhi(String maMH,String tenMH,int soTC){
            this.mh.add(new MonHocNhi(maMH,tenMH,soTC));
            return this;
        }
        public Builder_Nhi addMHCT_Nhi(String maMHCT,String tenMHCT, int soTCCT){
            this.ct.add(new CaiThienNhi(maMHCT, tenMHCT, soTCCT));
            return this;
        }
        public KeHoachKyHocNhi hienThi_Nhi(){
            return new KeHoachKyHocNhi(sinhviennhi,mh,ct);
        }
    }

    @Override
    public String toString() {
        return "KeHoachKyHocNhi{" +
                "\nSinh Viên=" + sinhviennhi +
                "\nMôn học=" + mh +
                "\nCải thiện=" + ct +
                '}';
    }
}
