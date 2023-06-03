/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TemplateMethod;

/**
 *
 * @author Nguyen Quoc Chau IT
 */
public class TempleMethodMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CaffeineBeverage tea = new Tea();
        CaffeineBeverage coffee = new Coffee();
        System.out.println("Template Method Tea");
        tea.disPlay();
        System.out.println("\n");
        System.out.println("Template Method Coffee");
        coffee.disPlay();
    }
    
}
