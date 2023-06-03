/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stratergy.duck_example;

/**
 *
 * @author Nguyen Quoc Chau IT
 */
public abstract class Duck {
    private IFlyBehavior flyBehavior;
    private IQuackBehavior quackBehavior;

    public void setFlyBehavior(IFlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(IQuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public IFlyBehavior getFlyBehavior() {
        return flyBehavior;
    }

    public IQuackBehavior getQuackBehavior() {
        return quackBehavior;
    }
    
    void performQuack(){
        System.out.println("Vịt kêu: "+quackBehavior.quack());
        
    }
    void performFly(){
        System.out.println("Vịt bay: "+flyBehavior.fly());
    }
    public abstract void display() ;
}

