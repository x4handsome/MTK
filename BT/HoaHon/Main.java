package Builder.HoaHon;

public class Main {
    public static void main(String[] args) {
        HoaDon hd = new HoaDon.Builder()
                .addHDHD("0123","27/02/2022","Dang Le Hoai Nhi")
                .addCTHD(10,"Bánh", 100, 10)
                .build();
        System.out.println(hd.toString());
        HoaDon hd2 = new HoaDon.Builder()
                .addHDHD("0124","24/01/2022","Dang Le Hoai Nhi")
                .addCTHD(10,"Kẹo", 100, 10)
                .build();
        System.out.println(hd2.toString());
    }
}
