/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TemplateMethod.GioiHang;

/**
 *
 * @author Nguyen Quoc Chau IT
 */
public class ThanhToanMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        MatHang mh1 = new MatHang("Quần", 2, 500000);
        MatHang mh2 = new MatHang("Áo", 2, 400000);
        MatHang mh3 = new MatHang("Dép", 2, 100000);
        GioHang user1 = new ThanhToanCOD();
        GioHang user2 = new ThanhToanOnline();
        user1.add(mh1);
        user1.add(mh2);
        user1.add(mh3);
        user2.add(mh3);
        System.out.println("\nNguyễn Quốc Châu");
        user1.gioHang();
        System.out.println("\nPhan Thị Huyền Trâm");
        user2.gioHang();
         
    }
    
}
