/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package creational;

/**
 *
 * @author Nguyen Quoc Chau IT
 */
public class SingletonMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Singleton s1 = Singleton.createInstance();
        Singleton s2 = Singleton.createInstance();
        Singleton s3 = Singleton.createInstance();
        s1.display();
        s1.display();
        s2.display();
        s3.display();
        ShapeType t = ShapeType.ChuNhat;
        System.out.println(t);
    }
    
}
