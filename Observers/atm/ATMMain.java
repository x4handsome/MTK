/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Observers.atm;

/**
 *
 * @author Nguyen Quoc Chau IT
 */
public class ATMMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ATM atm = new ATM();
        TaiKhoan Chau = new TaiKhoan("Nguyễn Quốc Châu", 1000, atm);
        TaiKhoan Tram = new TaiKhoan("Phan Thị Huyền Trâm", 1500, atm);
        System.out.println("Giao dịch lần 1");
        Chau.duaTheVaoATM();
        atm.rutTien(900);
        Chau.rutTheATM();
        System.out.println("Giao dịch lần 1");
        Tram.duaTheVaoATM();
        atm.rutTien(1000);
        Tram.rutTheATM();
        System.out.println("Giao dịch lần 2");
        Chau.duaTheVaoATM();
        atm.rutTien(50);
        Chau.rutTheATM();
        System.out.println("Giao dịch lần 2");
        Tram.duaTheVaoATM();
        atm.rutTien(450);
        Tram.rutTheATM();
        
    }
    
}
