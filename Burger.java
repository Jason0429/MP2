import java.util.*;

public class Burger {
    private int calories;
    private double price;
    private String name;
    private String[] ingredients;

    public Burger(
        String name,
        int calories,
        double price,
        String[] ingredients
    ) {
        this.name = name;
        this.calories = calories;
        this.price = price;
        this.ingredients = ingredients;
        Menu.add(this);
    }

    public int getCalories() { return this.calories; }

    public double getPrice() { return this.price; }

    public String getName() { return this.name; }

    public String[] getIngredients() { return this.ingredients; }

    public String toString() {
        return String.format(
            "[\n Name: %s,\n Calories: %d,\n Price: $%.2f,\n Ingredients: %s,\n]\n", this.name, this.calories, this.price, Arrays.toString(this.ingredients)
        );
    }
}