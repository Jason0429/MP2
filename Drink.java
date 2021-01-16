import java.util.*;

public class Drink {
    private int calories;
    private double price;
    private String name;

    public Drink(
        String name,
        int calories,
        double price
    ) {
        this.name = name;
        this.calories = calories;
        this.price = price;
        Menu.add(this);
    }

    public int getCalories() { return this.calories; }

    public double getPrice() { return this.price; }

    public String getName() { return this.name; }

    public String toString() {
        return String.format(
            "[\n Name: %s,\n Calories: %d,\n Price: $%.2f,\n]\n", this.name, this.calories, this.price
        );
    }
}