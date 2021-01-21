
/**
  * Represents a dessert on the menu.
  */
public class Dessert {
    private int calories;
    private double price;
    private String name;

    /** 
      * Creates a dessert.
      * Automatically adds dessert to menu.
      * @param name The name of the dessert.
      * @param calories The calories of the dessert.
      * @param price The price of the dessert.
      */
    public Dessert(String name, int calories, double price) {
        this.name = name;
        this.calories = calories;
        this.price = price;
        Menu.add(this);
    }

    /**
      * @return the dessert's calories.
      */
    public int getCalories() {
        return this.calories;
    }

    /**
      * @return the dessert's price.
      */
    public double getPrice() {
        return this.price;
    }

    /**
      * @return the dessert's name.
      */
    public String getName() {
        return this.name;
    }

    /**
      * To change the calories of the dessert.
      * @param calories The dessert's calories.
      */
    public void setCalories(int calories) {
        this.calories = calories;
    }

    /**
      * To change the calories of the dessert.
      * @param calories The dessert's price.
      */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
      * To change the name of the dessert.
      * @param calories The dessert's name.
      */
    public void setName(String name) {
        this.name = name;
    }

    /**
      * @return String to be returned when dessert is printed.
      */
    public String toString() {
        return String.format("[\n Name: %s,\n Calories: %d,\n Price: $%.2f,\n]\n", this.name, this.calories,
                this.price);
    }
}