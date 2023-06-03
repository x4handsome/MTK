/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FactoryMethodSingleTon;

/**
 *
 * @author Nguyen Quoc Chau IT
 */
public abstract class Shape {
    private String brush, paper, frame;

    abstract String draw(String brush, String paper, String frame);

}
