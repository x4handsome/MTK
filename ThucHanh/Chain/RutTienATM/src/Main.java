public class Main {
    public static void main(String[] args) {
        RutTienATM mg1= new RutTienATM(500);
        RutTienATM mg2= new RutTienATM(100);
        RutTienATM mg3= new RutTienATM(50);
        RutTienATM mg4 = new RutTienATM(1);
        mg1.menhGiaKetiep(mg2)
                .menhGiaKetiep(mg3)
                .menhGiaKetiep(mg4);
        mg1.rutTien(5151);
    }
}