/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TemplateMethod;

/**
 *
 * @author Nguyen Quoc Chau IT
 */
public abstract class CaffeineBeverage {
    public void prepareRecipe(){ 

        System.out.println("prepareRecipe");
    }
    public void boilWater(){ 

        System.out.println("boilWater");
    }
    public void pourlnCup(){ 

        System.out.println("pourlnCup");
    }
    protected abstract void brew();
    protected abstract void addCondiments();
    
    public void disPlay(){ 
        prepareRecipe();
        boilWater();
        pourlnCup();
        brew();
        addCondiments();
    }
}
