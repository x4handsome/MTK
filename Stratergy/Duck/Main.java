package Stratergy.Duck;

public class Main {
    public static void main(String[] args) {
        Duck vit = new VitBau();
        vit.setFlyBehavior(new FlyNoWay());
        vit.setQuackBehavior(new Quack());
        vit.display();
    }
}
