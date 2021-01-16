import java.util.*;

public class Payment {
    /*
    What burger would you like? (Switch case)
    - How many of each item
    Would you like a drink? (Y/N) if Y, proceed with number choices
    Would you like dessert? (Y/N) if Y, proceed with number choices

    Display list of ordered items (xCount)
    Compute Total Cost
    ((Total cost + average) / mode) if you fall in certain range, we give you a random toy.
    */

    private Burger[] orderedBurgers = {}; // 1
    private Drink[] orderedDrinks = {};
    private Dessert[] orderedDesserts = {};
    private double total;

    public Payment() {}

    // Add Burgers to Order
    public void addToOrder(Burger burger) {
        Burger[] newArr = new Burger[orderedBurgers.length + 1];

        for (int i = 0; i < orderedBurgers.length; i++) {
            newArr[i] = orderedBurgers[i];
        }

        newArr[newArr.length - 1] = burger;

        orderedBurgers = newArr;
    }

    // Add Drinks to Order
    public void addToOrder(Drink drink) {
        Drink[] newArr = new Drink[orderedDrinks.length + 1];

        for (int i = 0; i < orderedDrinks.length; i++) {
            newArr[i] = orderedDrinks[i];
        }

        newArr[newArr.length - 1] = drink;

        orderedDrinks = newArr;
    }

    // Add Dessert to Order
    public void addToOrder(Dessert dessert) {
        Dessert[] newArr = new Dessert[orderedDesserts.length + 1];

        for (int i = 0; i < orderedDesserts.length; i++) {
            newArr[i] = orderedDesserts[i];
        }

        newArr[newArr.length - 1] = dessert;

        orderedDesserts = newArr;
    }

    // Return most expensive item (name)
    public String getMostExpensiveItem() {
        double mostExpensive = 0;
        String mostExpItem = "";

        for (Burger b : orderedBurgers) {
            if (b.getPrice() > mostExpensive) {
                mostExpItem = b.getName();
            }
        }

        for (Drink d : orderedDrinks) {
            if (d.getPrice() > mostExpensive) {
                mostExpItem = d.getName();
            }
        }

        for (Dessert d : orderedDesserts) {
            if (d.getPrice() > mostExpensive) {
                mostExpItem = d.getName();
            }
        }

        return mostExpItem;
    }

    // Begins asking customer for order information
    public void beginOrder() {
        Menu.display();
        System.out.println("Which burger would you like to order?");
        
    }

}