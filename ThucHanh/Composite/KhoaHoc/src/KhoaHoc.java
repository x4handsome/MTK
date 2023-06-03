import java.util.ArrayList;
import java.util.List;

public class KhoaHoc {
    private int namHoc,kyHoc,soTC;
    private int hocPhi;
    String monHoc;

    public int getNamHoc() {
        return namHoc;
    }

    public void setNamHoc(int namHoc) {
        this.namHoc = namHoc;
    }

    public int getKyHoc() {
        return kyHoc;
    }

    public void setKyHoc(int kyHoc) {
        this.kyHoc = kyHoc;
    }

    public int getSoTC() {
        return soTC;
    }

    public void setSoTC(int soTC) {
        this.soTC = soTC;
    }

    public int getHocPhi() {
        return hocPhi;
    }

    public void setHocPhi(int hocPhi) {
        this.hocPhi = hocPhi;
    }

    public String getMonHoc() {
        return monHoc;
    }

    public void setMonHoc(String monHoc) {
        this.monHoc = monHoc;
    }

    private List<KhoaHoc> khoaHoc;
    public KhoaHoc(int namHoc, int kyHoc,String monHoc, int soTC, int hocPhi) {
        this.namHoc = namHoc;
        this.kyHoc = kyHoc;
        this.monHoc = monHoc;
        this.soTC = soTC;
        this.hocPhi = hocPhi;
        khoaHoc= new ArrayList<KhoaHoc>();
    }
    public void add(KhoaHoc k){
        khoaHoc.add(k);
    }
    public List<KhoaHoc> getKhoaHoc(){
        return khoaHoc;
    }
    public void show() {
        System.out.println( "KhoaHoc{" +
                "namHoc=" + namHoc +
                ", kyHoc=" + kyHoc +
                ", monHoc='" + monHoc + '\'' +
                ", soTC=" + soTC +
                ", hocPhi=" + hocPhi +
                '}');
    }
    public void showall(){
        show();
        for(KhoaHoc k: khoaHoc){
            k.showall();
        }
    }
    public int tongTC(){
        int tong=0;
        for(KhoaHoc k:khoaHoc) {
            tong +=tong+soTC;
        }
        return tong;
    }
    public int tongHocPhi(){
        int tong=0;
        for (KhoaHoc k:khoaHoc){
            tong+=tong+hocPhi;

        }
        return tong;
    }
}
