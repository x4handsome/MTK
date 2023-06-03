package Stratergy.QLSV;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        QLSV qlsv = new QLSV();
        qlsv.getSv().add(new SinhVien("Dang Le Hoai Nhi",new Date(27-2-2001),7));
        qlsv.getSv().add(new SinhVien("Hoang Nam",new Date(5-9-2001),7));
        qlsv.getSv().add(new SinhVien("Long Phi",new Date(7-6-2001),8));
        qlsv.setSoSanh(new SoSanhTheoTen());
        qlsv.sapXep();
        qlsv.inDS();
    }
}
