
/**
  * Represents a burger on the menu.
  */
public class Burger {
    private int calories;
    private double price;
    private String name;


    /** 
      * Creates a burger.
      * Automatically adds burger to menu.
      * @param name The name of the burger.
      * @param calories The calories of the burger.
      * @param price The price of the burger to two decimal places.
      */
    public Burger(String name, int calories, double price) {
        this.name = name;
        this.calories = calories;
        this.price = price;
        Menu.add(this);
    }

    /**
      * @return the burger's calories.
      */
    public int getCalories() {
        return this.calories;
    }

    /**
      * @return the burger's price.
      */
    public double getPrice() {
        return this.price;
    }

    /**
      * @return the burger's name.
      */
    public String getName() {
        return this.name;
    }

    /**
      * To change the calories of the burger.
      * @param calories The burger's calories.
      */
    public void setCalories(int calories) {
        this.calories = calories;
    }

    /**
      * To change the price of the burger.
      * @param The burger's price
      */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
      * To change the name of the burger.
      * @param name The burger's name.
      */
    public void setName(String name) {
        this.name = name;
    }

    /**
      * @return String to be returned when burger is printed.
      */
    public String toString() {
        return String.format("[\n Name: %s,\n Calories: %d,\n Price: $%.2f,\n]\n", this.name, this.calories,
                this.price);
    }
}