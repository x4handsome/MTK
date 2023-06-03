/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stratergy.duck_example;

/**
 *
 * @author Nguyen Quoc Chau IT
 */
public class NoQuack implements  IQuackBehavior{

    @Override
    public String quack() {
        return "Không biết kêu!";
    }
    
}
