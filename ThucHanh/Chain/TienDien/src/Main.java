public class Main {
    public static void main(String[] args) {
        TienDien b1= new TienDien(1678,0,50);
        TienDien b2 = new TienDien(1734,50,100);
        TienDien b3= new TienDien(2014,100,200);
        TienDien b4= new TienDien(2536,200,300);
        TienDien b5 = new TienDien(2834,300,400);
        TienDien b6 = new TienDien(2927,400,1000);
        b1.bacCaoHon(b2).bacCaoHon(b3).bacCaoHon(b4).bacCaoHon(b5).bacCaoHon(b6);
        System.out.println("So tien: "+b1.tinhTien(200));
    }
}