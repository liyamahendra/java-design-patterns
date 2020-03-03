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

        // get an object of Circle and call its draw method.
        Shape shape1 = shapeFactory.getShape(ShapeTypes.CIRCLE);

        // call draw method of Circle
        shape1.draw();

        // get an object of Rectangle and call its draw method.
        Shape shape2 = shapeFactory.getShape(ShapeTypes.RECTANGLE);

        // call draw method of Rectangle
        shape2.draw();

        // get an object of Square and call its draw method.
        Shape shape3 = shapeFactory.getShape(ShapeTypes.SQUARE);

        // call draw method of square
        shape3.draw();
    }
}