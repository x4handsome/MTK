/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chain.TienDien;

/**
 *
 * @author Nguyen Quoc Chau IT
 */
public class GiaThapNhat implements ITienDien{
    double gia;
    int kiMax;
    ITienDien mucGiaTT;
    
    public static double tongtien=0;

    public GiaThapNhat(double gia, int kiMax) {
        this.gia = gia;
        this.kiMax = kiMax;
    }
    @Override
    public ITienDien setSuccessor(ITienDien tiendien) {
        this.mucGiaTT=tiendien;
        return tiendien;    
    }

    @Override
    public double TTDien(float soDien) {
        if(soDien>=kiMax){
            soDien-=this.kiMax;
            tongtien+=this.gia*kiMax;
            return this.mucGiaTT.TTDien(soDien);
            
        }
        else
            {
                return tongtien+=soDien*gia;
            }
    }
    
}
