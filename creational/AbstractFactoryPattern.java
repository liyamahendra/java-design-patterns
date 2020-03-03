enum Shapes {
    RECTANGLE, SQUARE;
}

enum ShapeTypes {
    NORMAL, ROUNDED;
}

interface Shape {
    void draw();
}

abstract class AbstractFactory {
    abstract Shape getShape(Shapes shape);
}

class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}

class RoundedRectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside RoundedRectangle::draw() method.");
    }
}

class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}

class RoundedSquare implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside RoundedSquare::draw() method.");
    }
}

class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}

class ShapeFactory extends AbstractFactory {

    public Shape getShape(Shapes shape) {
        switch (shape) {
            case RECTANGLE:
                return new Rectangle();
            case SQUARE:
                return new Square();
            default:
                return null;
        }

    }
}

class RoundedShapeFactory extends AbstractFactory {

    public Shape getShape(Shapes shape) {
        switch (shape) {
            case RECTANGLE:
                return new RoundedRectangle();
            case SQUARE:
                return new RoundedSquare();
            default:
                return null;
        }
    }
}

class FactoryProducer {
    public static AbstractFactory getFactory(ShapeTypes shapeType) {
        switch (shapeType) {
            case NORMAL:
                return new ShapeFactory();
            case ROUNDED:
                return new RoundedShapeFactory();
            default:
                return null;

        }
    }
}

public class AbstractFactoryPattern {

    public static void main(String[] args) {
        AbstractFactory shapeFactory1 = FactoryProducer.getFactory(ShapeTypes.NORMAL);
        AbstractFactory shapeFactory2 = FactoryProducer.getFactory(ShapeTypes.ROUNDED);

        Shape shape1 = shapeFactory1.getShape(Shapes.SQUARE);
        Shape shape2 = shapeFactory1.getShape(Shapes.RECTANGLE);

        shape1.draw();
        shape2.draw();

        Shape shape3 = shapeFactory2.getShape(Shapes.SQUARE);
        Shape shape4 = shapeFactory2.getShape(Shapes.RECTANGLE);

        shape3.draw();
        shape4.draw();
    }
}