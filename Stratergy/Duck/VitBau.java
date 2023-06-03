package Stratergy.Duck;

public class VitBau extends Duck{
    @Override
    void display() {
        System.out.println("Vịt bầu");
        swim();
        performFly();
        performQuack();
    }
}
