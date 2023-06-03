/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Chain.XepLoai2;

/**
 *
 * @author Nguyen Quoc Chau IT
 */
public class XepLoaiMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        IXepLoai gioi = new XepLoaiCao("Giỏi", 10);
        IXepLoai kha = new XepLoai("Khá", 8);
        IXepLoai tbkha = new XepLoai("Trung Bình Khá", 7);
        IXepLoai tb = new XepLoai("Trung Bình", 7);
        IXepLoai yeu = new XepLoai("Yếu", 5);
        
        yeu.setSuccessor(tb)
                .setSuccessor(tbkha)
                .setSuccessor(kha)
                .setSuccessor(gioi);
        
        System.out.println("Xếp loại 5" + yeu.xepLoai(5));
        System.out.println("Xếp loại 6.5" + yeu.xepLoai((float)6));
        System.out.println("Xếp loại 7" + yeu.xepLoai(7));
        System.out.println("Xếp loại 9" + yeu.xepLoai(9));
        System.out.println("Xếp loại 11" + yeu.xepLoai(11));
    }
    
}
