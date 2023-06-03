public class CTHD {
    private int soluong;
    private String sanpham;
    private int dongia;
    private int chietkhau;
    public CTHD(){}

    public CTHD(int soluong, String sanpham, int dongia, int chietkhau) {
        this.soluong = soluong;
        this.sanpham = sanpham;
        this.dongia = dongia;
        this.chietkhau = chietkhau;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public String getSanpham() {
        return sanpham;
    }

    public void setSanpham(String sanpham) {
        this.sanpham = sanpham;
    }

    public int getDongia() {
        return dongia;
    }

    public void setDongia(int dongia) {
        this.dongia = dongia;
    }

    public int getChietkhau() {
        return chietkhau;
    }

    public void setChietkhau(int chietkhau) {
        this.chietkhau = chietkhau;
    }

    @Override
    public String toString() {
        return "CTHD{" +
                "soluong=" + soluong +
                ", sanpham='" + sanpham + '\'' +
                ", dongia=" + dongia +
                ", chietkhau=" + chietkhau +
                '}';
    }
}
