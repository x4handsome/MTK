/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package NhanVien;

/**
 *
 * @author Nguyen Quoc Chau IT
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        IQuanLy qlsv = new QuanLyNhanVien();
        qlsv.them(new nhanVien("Chau", "Nha Trang", 22, 30000, 100));
        qlsv.them(new nhanVien("Kim", "Nha Trang", 22, 10000, 50));
        qlsv.inDS();
    }
    
}
