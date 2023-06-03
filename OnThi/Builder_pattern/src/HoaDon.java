import java.util.ArrayList;
import java.util.List;

public class HoaDon {
    HoaDonHeader hdhd;
    List<CTHD>cthd= new ArrayList<>();

    private static class Builder{
        HoaDonHeader hdh;
        List<CTHD> CT= new ArrayList<>();
        public Builder() {
        }
        public Builder addCTHD(CTHD cthd){
            this.CT.add(cthd);
            return this;
        }
        public Builder addHD(HoaDonHeader hdh){
            this.hdh=hdh;
            return this;
        }
        public HoaDon build(){
            return  new HoaDon(this);
        }
    }
    private HoaDon(Builder builder){
        this.hdhd = hdhd;
        this.cthd = cthd;
    }

    @Override
    public String toString() {
        return "HoaDon{" +
                "hdhd=" + hdhd +
                ", cthd=" + cthd +
                '}';
    }
}
