public class KimCuong extends HoaDon{
    @Override
    protected double tinhChietKhau(double tinhTien) {
        if (tinhTien>=500000)
            return tinhTien-tinhTien*0.03;
        else if(tinhTien>=1000000)
            return tinhTien-tinhTien*0.05;
        else if (tinhTien>=1500000)
            return tinhTien-tinhTien*0.06;
        return 0;
    }
}
