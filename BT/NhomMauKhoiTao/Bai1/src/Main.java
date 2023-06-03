public class Main {
    public static void main(String[] args) {
        HoaDon hd = new HoaDon.Builder()
                .addHDHD("0123","27/02/2022","Dang Le Hoai Nhi")
                .addCTHD(10,"Keo", 100, 10)
                .build();
        System.out.println(hd.toString());
        HoaDon hd2 = new HoaDon.Builder()
                .addHDHD("0122","24/01/2022","Dang Le Hoai Nhi")
                .addCTHD(10,"Chocolate", 100, 10)
                .build();
        System.out.println(hd2.toString());
    }
}
