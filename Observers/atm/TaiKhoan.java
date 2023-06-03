    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Observers.atm;

/**
 *
 * @author Nguyen Quoc Chau IT
 */
public class TaiKhoan implements  ATM.ITaiKhoanATM{
    String ten;
    int soDu;
    ATM atm;

    public TaiKhoan(String ten, int soDu, ATM atm) {
        this.ten = ten;
        this.soDu = soDu;
        this.atm = atm;
    }
    public void duaTheVaoATM(){
        atm.attach(this);
    }
    public void rutTheATM(){
        atm.detach();
    }
    
    @Override
    public boolean kiemtraSoDu(int soTienRut) {
        if((soDu - soTienRut)>=50){
            return true;
        }
        else{ 
            return false;
        }
    }

    @Override
    public void thongBao(int soTienRut, boolean thanhCong) {
        System.out.println("Tài khoản: "+ten);
        if(thanhCong){
            System.out.println("Số dư ban đầu: "+soDu);
            soDu = soDu - soTienRut;
            System.out.println("Số tiền rút: "+soTienRut);
            System.out.println("Số dư còn lại: "+soDu);
        }
        else{ 
            System.out.println("Giao dịch không thành công");
            System.out.println("Số dư tài khoản hiện còn: "+soDu);
        }
    }
}
