public class CaiThienNhi {
    String maMHCT,tenMHCT;
    int soTCCT;
    public CaiThienNhi(String maMHCT, String tenMHCT, int soTCCT) {
        this.maMHCT = maMHCT;this.tenMHCT = tenMHCT;this.soTCCT = soTCCT;
    }
    public String getMaMH() {
        return maMHCT;
    }
    public void setMaMH(String maMH) {
        this.maMHCT = maMH;
    }
    public String getTenMH() {
        return tenMHCT;
    }
    public void setTenMH(String tenMH) {
        this.tenMHCT = tenMH;
    }
    public int getSoTC() {
        return soTCCT;
    }
    public void setSoTC(int soTC) {
        this.soTCCT = soTCCT;
    }
    @Override
    public String toString() {
        return "CaiThienNhi{" + "maMHCT='" + maMHCT + '\'' + ", tenMHCT='" + tenMHCT + '\''
                + ", soTCCT=" + soTCCT +
                '}';
    }
}
