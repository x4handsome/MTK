package Stratergy.GioHang;

public class ThanhToanAirPay implements IThanhToan{
    @Override
    public double thanhToan(double tienHang) {
        if(tienHang>1000000)
            return tienHang-tienHang*0.03;
        return tienHang;
    }
}
