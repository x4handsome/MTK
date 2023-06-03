/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TemplateMethod;

/**
 *
 * @author Nguyen Quoc Chau IT
 */
public class Tea extends CaffeineBeverage{

    @Override
    protected void brew() {

        System.out.println("Tea Brew");
    }

    @Override
    protected void addCondiments()
    z{
        System.out.println("Tea addCondiments");
    }
    
}
