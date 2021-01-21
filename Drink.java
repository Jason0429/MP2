
/**
  * Represents a drink on the menu.
  */
public class Drink {
    private int calories;
    private double price;
    private String name;

    /** 
      * Creates a drink.
      * Automatically adds drink to menu.
      * @param name The name of the drink.
      * @param calories The calories of the drink.
      * @param price The price of the drink.
      */
    public Drink(String name, int calories, double price) {
        this.name = name;
        this.calories = calories;
        this.price = price;
        Menu.add(this);
    }

    /**
      * @return the drink's calories.
      */
    public int getCalories() {
        return this.calories;
    }

    /**
      * @return the drink's price.
      */
    public double getPrice() {
        return this.price;
    }

    /**
      * @return the drink's name.
      */
    public String getName() {
        return this.name;
    }

    /**
      * To change the calories of the drink.
      * @param calories The drink's calories.
      */
    public void setCalories(int calories) {
        this.calories = calories;
    }

    /**
      * To change the price of the drink.
      * @param calories The drink's price.
      */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
      * To change the name of the drink.
      * @param calories The drink's name.
      */
    public void setName(String name) {
        this.name = name;
    }

    /**
      * @return String to be returned when drink is printed.
      */
    public String toString() {
        return String.format("[\n Name: %s,\n Calories: %d,\n Price: $%.2f,\n]\n", this.name, this.calories,
                this.price);
    }
}