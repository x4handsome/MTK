
public class CTHD {
    private int Soluong;
    private String Sanpham;
    private double Dongia, Chietkhau;

    public CTHD(int soluong, String sanpham, double dongia, double chietkhau) {
        Soluong = soluong;
        Sanpham = sanpham;
        Dongia = dongia;
        Chietkhau = chietkhau;
    }

    @Override
    public String toString() {
        return "CTHD{" +
                "Soluong=" + Soluong +
                ", Sanpham='" + Sanpham + '\'' +
                ", Dongia=" + Dongia +
                ", Chietkhau=" + Chietkhau +
                '}';
    }
}
