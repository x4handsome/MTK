public class Main {
    public static void main(String[] args) {
        XuLyKhoanVay baoVe= new NhanVien("Nhi","Bao ve",1500000);
        XuLyKhoanVay thuKy= new NhanVien("Tam","Thu ky",50000000);
        XuLyKhoanVay truongPhong= new NhanVien("Chau","Truong Phong",15000000);
        XuLyKhoanVay giamDoc= new GiamDocF88("Hoai Nhi",100000000);
        baoVe.setSuccessor(thuKy)
                .setSuccessor(truongPhong)
                .setSuccessor(giamDoc);
        System.out.println("Xu ly khoan vay 50000000 : "+thuKy.xuLy(50000000));
    }
}