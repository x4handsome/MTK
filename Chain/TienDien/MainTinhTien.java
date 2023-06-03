/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Chain.TienDien;
import java.util.Scanner;

/**
 *
 * @author Nguyen Quoc Chau IT
 */
public class MainTinhTien {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ITienDien T1 = new GiaThapNhat(1.678, 50);
        ITienDien T2 = new GiaThapNhat(1.734, 50);
        ITienDien T3 = new GiaThapNhat(2.014, 100);
        ITienDien T4 = new GiaThapNhat(2.536, 100);
        ITienDien T5 = new GiaThapNhat(2.834, 100);
        ITienDien T6 = new GiaCaoNhat(2.927, 100);
        T1.setSuccessor(T2).setSuccessor(T3).setSuccessor(T4).setSuccessor(T5).setSuccessor(T6);
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so dien tieu thu: ");
        int kw = sc.nextInt();
        System.out.println("So kw tieu thu: "+kw);
        System.out.println("Tong tien: "+T1.TTDien(kw));
    }
    
}
