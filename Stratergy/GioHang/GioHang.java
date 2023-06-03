package Stratergy.GioHang;

import java.util.ArrayList;
import java.util.List;

public class GioHang {
    List<MatHang> mh = new ArrayList<>();
    IThanhToan thanhToan;

    public List<MatHang> getMh() {

        return mh;
    }

    public void setMh(List<MatHang> mh) {

        this.mh = mh;
    }

    public IThanhToan getThanhToan() {
        return thanhToan;
    }

    public void setThanhToan(IThanhToan thanhToan) {

        this.thanhToan = thanhToan;
    }
}
