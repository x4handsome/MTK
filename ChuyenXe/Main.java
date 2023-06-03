package ChuyenXe;

public class Main {
    public static void main(String[] args) {
        XeNgoaiThanh nt1 = new XeNgoaiThanh("111","Nhi","001",2000,"Nha Trang",10);
        XeNgoaiThanh nt2 = new XeNgoaiThanh("112","Tam","002",5000,"Đà Lạt",20);
        XeNoiThanh n1 = new XeNoiThanh("135","Cam","003",1000,2,30);
        XeNoiThanh n2 = new XeNoiThanh("225","Le","004",4000,7,60);
        QuanLyChuyenXe qlcx = new QuanLyChuyenXe();
        qlcx.them(nt1);
        qlcx.them(nt2);
        qlcx.them(n1);
        qlcx.them(n2);
        qlcx.inDS();
        System.out.println("Doanh số xe ngoại thành: "+qlcx.doanhThuXeNgoaiThanh()  );
        System.out.println("Doanh số xe nội thành: "+qlcx.doanhThuXeNoiThanh());
        System.out.println("Tổng doanh số xe: "+qlcx.tongDoanhThu());
    }
}
