public class TrungThuong implements GiaiThuong {
    String tenGiai,soTrung;

    public TrungThuong(String tenGiai, String soTrung) {
        this.tenGiai = tenGiai;
        this.soTrung = soTrung;
    }

    GiaiThuong veTrung;
    @Override
    public GiaiThuong giaiTiepTheo(GiaiThuong giaiKeTiep) {
        this.veTrung=giaiKeTiep;
        return giaiKeTiep;
    }
    @Override
    public String tenGiai(String soTT) {
        if(soTT.endsWith(this.soTrung))
            return "Da trung giai: "+this.tenGiai;
        else
            return veTrung.tenGiai(soTT);
    }
}
