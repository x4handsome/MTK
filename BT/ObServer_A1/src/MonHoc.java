public class MonHoc {
    String MaMH,TenMH;
    int SoTC;

    public MonHoc(String maMH, String tenMH, int soTC) {
        this.MaMH = maMH;
        TenMH = tenMH;
        this.SoTC = soTC;
    }

    public String getMaMH() {
        return MaMH;
    }

    public void setMaMH(String maMH) {
        MaMH = maMH;
    }

    public String getTenMH() {
        return TenMH;
    }

    public void setTenMH(String tenMH) {
        TenMH = tenMH;
    }

    public int getSoTC() {
        return SoTC;
    }

    public void setSoTC(int soTC) {
        SoTC = soTC;
    }

    @Override
    public String toString() {
        return "MonHoc{" +
                "MaMH='" + MaMH + '\'' +
                ", TenMH='" + TenMH + '\'' +
                ", SoTC=" + SoTC +
                '}';
    }
}
