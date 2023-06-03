package Stratergy.TinhToan;

public class Main {
    public static void main(String[] args) {
        context t = new context() ;
        t.setTinhToan(new Tru());
        System.out.println(t.tinh(5,6));
    }
}
