/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chain.TienDien;


/**
 *
 * @author Nguyen Quoc Chau IT
 */
public class GiaCaoNhat implements ITienDien{
    double giatien;
    int kiMin;
    public GiaCaoNhat(double giatien, int ki) {
        this.giatien = giatien;
        this.kiMin = ki;
    }
    @Override
    public ITienDien setSuccessor(ITienDien tiendien) {
        return null;
    }

    @Override
    public double TTDien(float soDien) {
         return GiaThapNhat.tongtien+soDien*giatien;
    }
    
}
