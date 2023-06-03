public abstract class ATM  {
    public void Rut(int soTien, int max) {
        menhGiaCaoNhat(max).rutTien(soTien);
    }
    public abstract RutTienATM menhGiaCaoNhat(int soTien);
}
