public class RutTienATM implements IRutTienATM{
    int menhGia;

    public RutTienATM(int menhGia) {
        this.menhGia = menhGia;
    }

    IRutTienATM menhGiaKeTiep;
    @Override
    public IRutTienATM menhGiaKetiep(IRutTienATM giaKeTiep) {
        this.menhGiaKeTiep= giaKeTiep;
        return giaKeTiep;
    }

    @Override
    public void rutTien(int soTien) {
        int soTo;
        int tienDu;
        soTo= soTien/menhGia;
        if(soTo>0)
            System.out.println(soTo+"To "+menhGia+"k");
        tienDu=soTien%menhGia;
        if(tienDu>0)
            menhGiaKeTiep.rutTien(tienDu);
    }
}
