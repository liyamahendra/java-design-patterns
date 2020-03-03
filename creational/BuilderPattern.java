import java.util.ArrayList;
import java.util.List;

interface Item {
    public String name();

    public float price();
}

class Burger implements Item {

    @Override
    public String name() {
        return "Burger";
    }

    @Override
    public float price() {
        return 2.0f;
    };
}

class ChickenBurger implements Item {

    @Override
    public String name() {
        return "Chicken Burger";
    }

    @Override
    public float price() {
        return 4.0f;
    };
}

class Coke implements Item {

    @Override
    public String name() {
        return "Coke";
    }

    @Override
    public float price() {
        return 3.0f;
    };
}

class Meal {
    private List<Item> items = new ArrayList<Item>();

    public void addItem(Item item) {
        items.add(item);
    }

    public float getTotalCost() {
        float cost = 0.0f;

        for (Item item : items) {
            cost += item.price();
        }
        return cost;
    }

    public void showItems() {

        for (Item item : items) {
            System.out.print("Item : " + item.name());
            System.out.println(", Price : " + item.price());
        }
    }
}

class MealBuilder {

    public Meal prepareVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new Burger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal prepareNonVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Coke());
        return meal;
    }
}

public class BuilderPattern {
    public static void main(String[] args) {

        MealBuilder mealBuilder = new MealBuilder();

        Meal vegMeal = mealBuilder.prepareVegMeal();
        System.out.println("Veg Meal");
        vegMeal.showItems();
        System.out.println("Total Cost: " + vegMeal.getTotalCost());

        Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
        System.out.println("\n\nNon-Veg Meal");
        nonVegMeal.showItems();
        System.out.println("Total Cost: " + nonVegMeal.getTotalCost());
    }
}
