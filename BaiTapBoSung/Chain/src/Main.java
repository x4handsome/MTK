import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        TrungThuong giaiDB= new TrungThuong("Giai dac biet","270220");
        TrungThuong giai1= new TrungThuong("Giai Nhat","234561");
        TrungThuong giai2= new TrungThuong("Giai nhi","270222");
        TrungThuong giai3= new TrungThuong("Giai ba","234563");
        TrungThuong giai4= new TrungThuong("Giai tu","270224");
        TrungThuong giai5= new TrungThuong("Giai nam","234565");
        TrungThuong giai6= new TrungThuong("Giai sau","270226");
        TrungThuong giai7= new TrungThuong("Giai bay","234567");
        TrungThuong giai8= new TrungThuong("Giai tam","27");
        KhongTrung trat= new KhongTrung();
        giaiDB.giaiTiepTheo(giai1)
                .giaiTiepTheo(giai2)
                .giaiTiepTheo(giai3)
                .giaiTiepTheo(giai4)
                .giaiTiepTheo(giai5)
                .giaiTiepTheo(giai6)
                .giaiTiepTheo(giai7)
                .giaiTiepTheo(giai8)
                .giaiTiepTheo(trat);
        System.out.println("So 234568: "+giaiDB.tenGiai("234568"));
    }
}