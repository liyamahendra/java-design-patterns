enum ShapeTypes {
    CIRCLE, RECTANGLE, SQUARE;
}

interface Shape {
    void draw();
}

class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}

class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}

class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}

class ShapeFactory {

    // use getShape method to get object of type shape
    public Shape getShape(ShapeTypes shapeType) {
        Shape shape = null;
        switch (shapeType) {
            case CIRCLE:
                shape = new Circle();
                break;
            case RECTANGLE:
                shape = new Rectangle();
                break;
            case SQUARE:
                shape = new Circle();
                break;
        }

        return shape;
    }
}

public class FactoryPattern {

    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape shape1 = shapeFactory.getShape(ShapeTypes.CIRCLE);
        Shape shape2 = shapeFactory.getShape(ShapeTypes.RECTANGLE);
        Shape shape3 = shapeFactory.getShape(ShapeTypes.SQUARE);

        shape1.draw();
        shape2.draw();
        shape3.draw();
    }
}