/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Iterator;

/**
 *
 * @author Nguyen Quoc Chau IT
 */
public class IteratorMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MyArry soNguyen  = new MyArry(new int[]{1, 2, 3,4,5,6,7} );
        Iterator A= soNguyen.CreateIterator();
        System.out.println("Đối tượng thứ 3 trong mảng là: "+soNguyen.getItem(3));
        System.out.println("Tổng số trong mảng: "+soNguyen.count() );
        while (A.Next() != null){
            System.out.println(A.CurrentItem());
        }
        
    }
    
}
