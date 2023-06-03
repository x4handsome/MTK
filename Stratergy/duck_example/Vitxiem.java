/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stratergy.duck_example;

/**
 *
 * @author Nguyen Quoc Chau IT
 */
public class Vitxiem extends Duck{
    
    @Override
    public void display() {
        System.out.println("Tôi là vịt xiêm, tôi có thể bơi, bay, kêu");
        performFly();
        performQuack();
    }
    
}
