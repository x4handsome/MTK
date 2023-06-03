public class Main {
    public static void main(String[] args)
    {
        ATM atm = new ATM();
        TaiKhoan Chau = new TaiKhoan("Nguyễn Quốc Châu", 1000, atm);
        TaiKhoan Tram = new TaiKhoan("Phan Thị Huyền Trâm", 1500, atm);
        System.out.println("Giao dịch lần 1");
        Chau.duaTheVaoATM();
        atm.rutTien(900);
        Chau.rutTheATM();
        System.out.println("Giao dịch lần 1");
        Tram.duaTheVaoATM();
        atm.rutTien(1000);
        Tram.rutTheATM();
        System.out.println("Giao dịch lần 2");
        Chau.duaTheVaoATM();
        atm.rutTien(50);
        Chau.rutTheATM();
        System.out.println("Giao dịch lần 2");
        Tram.duaTheVaoATM();
        atm.rutTien(450);
        Tram.rutTheATM();
    }
}