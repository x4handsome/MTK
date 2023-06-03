package Singleton.Shape;

public class Circle extends Shape {
    private static Circle instance;

    protected Circle() {
    }

    public static Circle CreateInstance() {
        if (instance == null)
            instance = new Circle();
        return instance;
    }

    @Override
    String draw(String brush, String paper, String frame) {
        return "Hinh tròn " + brush + " " + paper + " " + frame;
    }
}
