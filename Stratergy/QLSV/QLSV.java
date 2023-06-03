package Stratergy.QLSV;

import java.util.ArrayList;
import java.util.List;

public class QLSV {
    List<SinhVien> sv = new ArrayList<>();
    ISoSanh<SinhVien> soSanh;

    public List<SinhVien> getSv() {
        return sv;
    }

    public void setSv(List<SinhVien> sv) {
        this.sv = sv;
    }

    public ISoSanh<SinhVien> getSoSanh() {
        return soSanh;
    }

    public void setSoSanh(ISoSanh<SinhVien> soSanh) {
        this.soSanh = soSanh;
    }

    public void sapXep() {
        sv.sort((o1, o2) -> {
            return soSanh.soSanh(o1, o2);
        });
    }

    public void inDS() {
        sv.forEach((t)->{
            System.out.println(t.toString());
        });
    }
}
