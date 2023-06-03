package Singleton.Shape;

public class Rectangle extends Shape{
    private static Rectangle instance;

    protected Rectangle() {
    }

    public static Rectangle CreateInstance() {
        if (instance == null)
            instance = new Rectangle();
        return instance;
    }

    @Override
    String draw(String brush, String paper, String frame) {
        return "Hinh chữ nhật " + brush + " " + paper + " " + frame;
    }
}
