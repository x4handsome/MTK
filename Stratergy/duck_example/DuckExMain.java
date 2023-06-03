/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package stratergy.duck_example;

/**
 *
 * @author Nguyen Quoc Chau IT
 */
public class DuckExMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Duck duck = new Vitxiem();
        IFlyBehavior flyBehavior = new FlyWithWings();
        IQuackBehavior quackBehavior = new NoQuack();
        duck.setFlyBehavior(flyBehavior);
        duck.setQuackBehavior(quackBehavior);
        duck.display();
    } 
}
