/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Builder_HoaDon;

/**
 *
 * @author Nguyen Quoc Chau IT
 */
public class Main_HoaDon {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        HoaDon hd = new HoaDon.Builder()
            .addHDHD("0123","22/12/2022","Nguyễn Quốc Châu")
            .addCTHD(10,"Bánh", 100, 10)
            .build();
            System.out.println(hd.toString());
        HoaDon hd2 = new HoaDon.Builder()
            .addHDHD("0124","22/12/2022","Nguyễn Quốc Châu")
            .addCTHD(10,"Kẹo", 100, 10)
            .build();
        System.out.println(hd2.toString());
    }
    
}
