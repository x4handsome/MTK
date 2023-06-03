package SinhVienNTU;

public abstract class SinhVienNTU {
    String hoTen,nganh;


    public SinhVienNTU(String hoTen, String nganh) {
        this.hoTen = hoTen;
        this.nganh = nganh;
    }

    public abstract double getDiem();
    public String hocLuc(){
        double diemtb = getDiem();
        if(diemtb<5)
            return "Yếu";
        if (diemtb >= 5 && diemtb <= 6.5)
            return "Trung bình";
        if (diemtb>=6.5 && diemtb<=7.5)
            return "Khá";
        if (diemtb>=7.5 && diemtb<=9)
            return "Giỏi";
        return "Xuất sắc";

    }
    public void xuat(){
        String str = "Họ tên: " + hoTen + "| Ngành: " +nganh + "| Xếp loại: "+ this.hocLuc();
        System.out.println(str);
    }

}
