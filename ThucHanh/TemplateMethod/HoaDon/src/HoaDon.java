import java.util.ArrayList;
import java.util.List;

public abstract class HoaDon   {
    List<HangHoa> hh= new ArrayList<>();
    protected abstract double tinhChietKhau(double tinhTien);
    public void gioHang(){
        System.out.println("Cac hang hoa : \n");
        inDs();
        System.out.println("Tong tien : "+tinhTien());
        System.out.println("Tien sau chiet khau: "+tinhChietKhau(tinhTien()));
    }
    public List<HangHoa> getHh() {
        return hh;
    }
    boolean add(HangHoa hangHoa){
        hh.add(hangHoa);
        return true;
    }
    public void setHh(List<HangHoa> hh) {
        this.hh = hh;
    }
    public int tinhTien(){
        int tong=0;
        for (HangHoa hangHoa:hh){
            tong+= hangHoa.donGia*hangHoa.soLuong;
        }
        return tong;
    }
    public void inDs(){
        hh.forEach((t) ->{
            System.out.println("Mat hang "+t.matHang);
            System.out.println("So luong "+t.soLuong);
            System.out.println("Don gia "+t.donGia);
        });
    }

}
