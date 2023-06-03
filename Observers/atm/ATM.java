/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Observers.atm;

/**
 *
 * @author Nguyen Quoc Chau IT
 */
public class ATM {
    private ITaiKhoanATM taiKhoan;
    public  void attach (ITaiKhoanATM taiKhoan){
        this.taiKhoan = taiKhoan;
    }
    public  void detach(){
        this.taiKhoan = null;
    }
    private boolean kiemtraTienRut(int soTienRut){ 
        return taiKhoan.kiemtraSoDu(soTienRut);
    }
    public void rutTien(int soTienRut){
        if(taiKhoan!=null){
            if(kiemtraTienRut(soTienRut)){
                taiKhoan.thongBao(soTienRut,true);
            }
            else{
                taiKhoan.thongBao(soTienRut, false);
            }
        }
        else{
            System.out.println("Không có thẻ trong máy!!!");
        }
    }
    public static interface ITaiKhoanATM{
        boolean kiemtraSoDu(int soTienRut);
        void thongBao (int soTienRut, boolean thanhCong);
    }
    
}
