public class ThanThiet extends HoaDon{

    @Override
    protected double tinhChietKhau(double tinhTien) {
        if(tinhTien>=500000)
            return tinhTien-tinhTien*0.02;
        return 0;
    }
}
