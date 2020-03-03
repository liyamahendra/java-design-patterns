import java.util.Hashtable;
import java.util.Map;
import java.util.HashMap;

enum ShapeType {
    RECTANGLE("1"), SQUARE("2");

    private String value;
    private static Map map = new HashMap<>();

    private ShapeType(String value) {
        this.value = value;
    }

    public static ShapeType valueOf(int pageType) {
        return (ShapeType) map.get(pageType);
    }

    public String getValue() {
        return value;
    }
}

abstract class Shape implements Cloneable {

    private String id;
    protected String type;

    abstract void draw();

    public String getType() {
        return type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Object clone() {
        Object clone = null;

        try {
            clone = super.clone();

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return clone;
    }
}

class Rectangle extends Shape {

    public Rectangle() {
        type = "Rectangle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}

class Square extends Shape {

    public Square() {
        type = "Square";
    }

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}

class ShapeCache {

    private static Hashtable<String, Shape> shapeMap = new Hashtable<String, Shape>();

    public static Shape getShape(String shapeId) {
        Shape cachedShape = shapeMap.get(shapeId);
        return (Shape) cachedShape.clone();
    }

    public static void prepareCache() {
        Square square = new Square();
        square.setId(ShapeType.SQUARE.getValue());
        shapeMap.put(square.getId(), square);

        Rectangle rectangle = new Rectangle();
        rectangle.setId(ShapeType.RECTANGLE.getValue());
        shapeMap.put(rectangle.getId(), rectangle);
    }
}

public class PrototypePattern {
    public static void main(String[] args) {
        ShapeCache.prepareCache();

        Shape clonedShape = (Shape) ShapeCache.getShape("1");
        System.out.println("Shape : " + clonedShape.getType());

        Shape clonedShape2 = (Shape) ShapeCache.getShape("2");
        System.out.println("Shape : " + clonedShape2.getType());
    }
}