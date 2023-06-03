package Singleton.Shape;

public class Main {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape1 = shapeFactory.CreateShape(ShapeType.Rectangle);
        System.out.println(shape1.draw("Màu Cam,", "A1,", "chất liệu: Nhựa"));
        shape1 = shapeFactory.CreateShape(ShapeType.Circle);
        System.out.println(shape1.draw("Màu Tím,", "A2,", "chất liệu: Đồng"));
        shape1 = shapeFactory.CreateShape(ShapeType.Triangle);
        System.out.println(shape1.draw("Màu Đỏ,","A3,","chất liệu: Giấy"));
        System.out.println("\n");
    }
}

