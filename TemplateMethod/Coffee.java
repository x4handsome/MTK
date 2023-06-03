/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TemplateMethod;

/**
 *
 * @author Nguyen Quoc Chau IT
 */
public class Coffee extends CaffeineBeverage {

    @Override
    protected void brew() {

        System.out.println("Coffee Brew");
    }

    @Override
    protected void addCondiments() {

        ystem.out.println("Coffee addCondiments");
    }
    
}
