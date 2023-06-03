public class GiamDocF88 implements XuLyKhoanVay {
    String ten;
    int max;
    @Override
    public XuLyKhoanVay setSuccessor(XuLyKhoanVay handler) {

        return null;
    }

    public GiamDocF88(String ten, int max) {
        this.ten = ten;
        this.max = max;
    }

    @Override
    public String xuLy(int tienVay) {
        if(tienVay<=max)
            return "Giam doc chiu trach nhiem cho vay";
        return "Khong cho vay";
    }
}
