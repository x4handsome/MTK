/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TemplateMethod.GioiHang;

/**
 *
 * @author Nguyen Quoc Chau IT
 */
public class ThanhToanOnline extends GioHang{

    @Override
    protected void tinhChietKhau() {
        double tienCK=0, tienTT=0;
        if(tinhTien()>1000000){
            tienCK = tinhTien()  *0.05;
            System.out.println("Tiền chiết khấu Online là: "+tienCK);
            tienTT = tinhTien() - tienCK;
            System.out.println("Tiền cần thanh toán Online là: "+tienTT);
        }
         else{
            tienCK = tinhTien()  *0.03;
            System.out.println("Tiền chiết khấu Online là: "+tienCK);
            tienTT = tinhTien() - tienCK;
            System.out.println("Tiền cần thanh toán Online là: "+tienTT);
        }
    }
    
}
