/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chain.ATMRutTien;

/**
 *
 * @author Nguyen Quoc Chau IT
 */
public class MenhGia1k implements IATMRutTien{
    String label;
    int menhgia;
    int soto=0;

    public MenhGia1k(String label, int menhgia) {
        this.label = label;
        this.menhgia = menhgia;
    }

    @Override
    public IATMRutTien setSuccessor(IATMRutTien Tienrut) {
        return null;
    }

    @Override
    public String SoTien(String toTien, int tien) {
            this.soto = (int)(tien/menhgia);
            toTien = toTien + this.soto +" tờ "+ menhgia + "k\n";
            return toTien;
        
    }
    
}
