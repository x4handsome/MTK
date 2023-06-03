package Singleton.Shape;

public class Triangle extends Shape {
    private static Triangle instance;

    protected Triangle() {
    }

    public static Triangle CreateInstance() {
        if (instance == null)
            instance = new Triangle();
        return instance;
    }

    @Override
    String draw(String brush, String paper, String frame) {
        return "Hinh tam giác " + brush + " " + paper + " " + frame;
    }
}
