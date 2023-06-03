/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package creational;

/**
 *
 * @author Nguyen Quoc Chau IT
 */
public class Singleton {
    private static Singleton instance;
    private int count =0;
    private Singleton(){}
    public static Singleton createInstance(){
        if(instance==null)
            instance = new Singleton();
        return instance;
    }
    
    public void display(){
        System.out.println(++count);
    }
    
}
