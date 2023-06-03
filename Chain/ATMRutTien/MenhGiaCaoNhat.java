/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chain.ATMRutTien;

/**
 *
 * @author Nguyen Quoc Chau IT
 */
public class MenhGiaCaoNhat implements IATMRutTien{
    String label;
    int menhgia;
    int soto=0;
    IATMRutTien Successor;
    public MenhGiaCaoNhat(String label, int menhgia) {
        this.label = label;
        this.menhgia = menhgia;
    }

    @Override
    public IATMRutTien setSuccessor(IATMRutTien Tienrut) {
        Successor = Tienrut;
        return Tienrut;
    }

    @Override
    public String SoTien(String toTien, int tien) {
        
        if(tien>=menhgia){ 
            this.soto = (int)(tien/menhgia);
            tien = tien - (this.soto*menhgia);
            toTien = toTien + this.soto +" tờ "+ menhgia + "k\n";
            return Successor.SoTien(toTien, tien);
        }
        else{
            return Successor.SoTien(toTien, tien);
        }
    }
    

    
    
}
