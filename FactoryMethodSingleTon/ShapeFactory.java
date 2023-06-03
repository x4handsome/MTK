/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package FactoryMethodSingleTon;

/**
 *
 * @author Nguyen Quoc Chau IT
 */
public class ShapeFactory {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CaseShapeFactory shapeFactory = new CaseShapeFactory();
        Shape shape1 = shapeFactory.createShape(ShapeType.Rectangle);
        System.out.println(shape1.draw("Màu Xanh,", "A1,", "chất liệu: Nhựa"));
        shape1 = shapeFactory.createShape(ShapeType.Circle);
        System.out.println(shape1.draw("Màu Đỏ,", "A2,", "chất liệu: Đồng"));
        shape1 = shapeFactory.createShape(ShapeType.Triangle);
        System.out.println(shape1.draw("Màu Vàng,","A3,","chất liệu: Giấy"));
        System.out.println("\n");
    }
    
}
