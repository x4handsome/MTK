/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Observers;

/**
 *
 * @author Nguyen Quoc Chau IT
 */
public class NhaDauTuA implements TiGia.I_TheoDoiTiGia{
    TiGia t ;

    public NhaDauTuA(TiGia t) {
        this.t = t;
        t.attach(this);
    }
    public void HuyDangKy(){
        t.detach(this);
    }

    @Override
    public void CapNhapTiGia(float delta) {
       if(delta > 0 )
            System.out.println("A:Mua vào");
       else
             System.out.println("A:Bán ra");
    }
}
