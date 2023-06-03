/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TemplateMethod.QuanLySinhVienandMonHoc;

/**
 *
 * @author Nguyen Quoc Chau IT
 */
public class EntituDataBaseMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SinhVien sv1 = new SinhVien(1, 2001,"Nguyễn Quốc Châu", "Nha Trang");
        SinhVien sv2 = new SinhVien(2, 2005,"Nguyễn Yến Nhi", "Nha Trang");
        SinhVien sv3 = new SinhVien(5, 2002,"Nguyễn Trần Hoàn Kim", "Nha Trang");
        SinhVien sv4 = new SinhVien(6, 2009,"Phan Thị Huyền Trâm", "Đắk Lắk");
        EntityDataBase sv = new SinhVienDataBase();
        sv.add(sv1);
        sv.add(sv2);
        sv.add(sv3);
        sv.add(sv4);
        sv.inDs();
        
       
    }
    
}
