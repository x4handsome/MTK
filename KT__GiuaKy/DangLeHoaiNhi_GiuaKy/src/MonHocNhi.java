public class MonHocNhi {
    String maMH,tenMH;
    int soTC;
    public MonHocNhi(String maMH, String tenMH, int soTC) {
        this.maMH = maMH;this.tenMH = tenMH;this.soTC = soTC;
    }
    public String getMaMH() {
        return maMH;
    }
    public void setMaMH(String maMH) {
        this.maMH = maMH;
    }
    public String getTenMH() {
        return tenMH;
    }
    public void setTenMH(String tenMH) {
        this.tenMH = tenMH;
    }
    public int getSoTC() {
        return soTC;
    }
    public void setSoTC(int soTC) {
        this.soTC = soTC;
    }
    @Override
    public String toString() {
        return "MonHocNhi{" + "maMH='" + maMH + '\'' + ", tenMH='" + tenMH + '\'' + ", soTC=" + soTC + '}';
    }
}
