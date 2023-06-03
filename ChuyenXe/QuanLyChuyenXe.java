package ChuyenXe;

import java.util.ArrayList;
import java.util.List;

public class QuanLyChuyenXe {
    List<ChuyenXe> dsXe = new ArrayList<>();
    public List<ChuyenXe> getList(){
        return dsXe;
    }
    void them(ChuyenXe cx){
        dsXe.add(cx);
    }
    void inDS(){
        for(ChuyenXe dsXe : getList())
        {
            System.out.println(dsXe.toString());
        }
    }
    int doanhThuXeNoiThanh(){
        int tong=0;
        for (ChuyenXe xe: getList()){
            if(xe instanceof XeNoiThanh)
                tong += xe.getDoanhThu();
        }
        return tong;
    }
    int doanhThuXeNgoaiThanh(){
        int tong=0;
        for (ChuyenXe xe: getList()){
            if(xe instanceof XeNgoaiThanh)
                tong += xe.getDoanhThu();
        }
        return tong;
    }
    int tongDoanhThu(){
        return this.doanhThuXeNgoaiThanh() + this.doanhThuXeNoiThanh();
    }
}
