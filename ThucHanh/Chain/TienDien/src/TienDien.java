public class TienDien implements ITienDien{
    int gia,min,max;

    public TienDien( int gia,int min, int max) {
        this.gia = gia;
        this.min = min;
        this.max = max;
    }

    ITienDien bacKeTiep;

    @Override
    public ITienDien bacCaoHon(ITienDien bacTiepTheo) {
        this.bacKeTiep=bacTiepTheo;
        return bacTiepTheo;
    }
    @Override
    public int tinhTien(int soDien) {
        if(soDien<=max)
            return (soDien-min)*gia;
        return (max-min)*gia+bacKeTiep.tinhTien(soDien);
    }
}
