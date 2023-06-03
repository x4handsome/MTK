package SinhVienNTU;

public class Main {
    public static void main(String[] args) {
        SinhVienNTU sv1 = new SinhVienIT("Chau","CNTT",8,7,6.5);
        SinhVienNTU sv2 = new SinhVienBiz("Kim","Marketing",10,9);
        SinhVienNTU sv3 = new SinhVienNTU("Pull","Tài chính") {
            @Override
            public double getDiem() {
                return 5;
            }
        };
        sv1.xuat();
        sv2.xuat();
        sv3.xuat();


    }
}
