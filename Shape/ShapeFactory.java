package Singleton.Shape;

public class ShapeFactory {
    public Shape CreateShape(ShapeType shapeType) {
        Shape shape = null;
        switch (shapeType){
            case Circle:
                shape = new Circle();
                break;
            case Triangle:
                shape = new Triangle();
                break;
            case Rectangle:
                shape = new Rectangle();
                break;
        }
        return shape;
    }
}
