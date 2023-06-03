public class Main {
    public static void main(String[] args) {
        HangHoa h1= new HangHoa("Ao",10,100000);
        HangHoa h2 = new HangHoa("Quan",2,50000);
        HangHoa h3 = new HangHoa("Ao Khoac",1,20000);
        HoaDon hd1= new KimCuong();
        HoaDon hd2= new ThanThiet();
        HoaDon hd3 = new Vang();
        hd1.add(h1);
        hd1.add(h2);
        hd1.add(h3);
        hd1.gioHang();
    }
}