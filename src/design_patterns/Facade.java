package design_patterns;

public class Facade {
    public static void main(String[] args) {
        ShapeDrawer shapeDrawer = new ShapeDrawer();
        shapeDrawer.drawRectangle();
        shapeDrawer.drawSquare();
        shapeDrawer.drawCircle();
    }
}

@FunctionalInterface
interface Shape {
    void draw();
}

class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Rectangle");
    }
}

class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Square");
    }
}

class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Circle");
    }
}

class ShapeDrawer {
    private Shape rectangle;
    private Shape square;
    private Shape circle;

    public ShapeDrawer() {
        rectangle = new Rectangle();
        square = new Square();
        circle = new Circle();
    }

    public void drawRectangle() {
        rectangle.draw();
    }

    public void drawSquare() {
        square.draw();
    }

    public void drawCircle() {
        circle.draw();
    }
}