import java.util.*;

public class Menu {
    private static Burger[] burgers = new Burger[5];
    private static Drink[] drinks = new Drink[5];
    private static Dessert[] desserts = new Dessert[5];

    // Adds burger to menu
    public static void add(Burger burger) {
        for (int i = 0; i < burgers.length; i++) {
            if (burgers[i] == null) {
                burgers[i] = burger;
                return;
            }
        }
    }

    // Adds drink to menu
    public static void add(Drink drink) {
        for (int i = 0; i < drinks.length; i++) {
            if (drinks[i] == null) {
                drinks[i] = drink;
                return;
            }
        }
    }

    // Adds dessert to menu
    public static void add(Dessert dessert) {
        for (int i = 0; i < desserts.length; i++) {
            if (desserts[i] == null) {
                desserts[i] = dessert;
                return;
            }
        }
    }

    // Get Burgers
    public static Burger[] getBurgers() {
        return burgers;
    }

    // Get Drinks
    public static Drink[] getDrinks() {
        return drinks;
    }

    // Get Desserts
    public static Dessert[] getDesserts() {
        return desserts;
    }

    // Draws line
    public static void drawLine() {
        System.out.println("-----------------------------------------------");
    }

    // Displays Menu
    public static void display(String item) {
        System.out.println("Welcome to !McDonald's");
        if (item.equals("burger") || item.equals("all")) {
            drawLine();
            System.out.println("Burgers:");
            drawLine();
            for (int i = 0; i < burgers.length; i++) {
                System.out.printf("%-4s%-25s%-15s%-15s\n", (i + 1) + ")", burgers[i].getName(),
                        burgers[i].getCalories() + " Calories", "$" + burgers[i].getPrice());
            }
            drawLine();
        }
        if (item.equals("drink") || item.equals("all")) {
            drawLine();
            System.out.println("Drinks:");
            drawLine();
            for (int i = 0; i < drinks.length; i++) {
                System.out.printf("%-4s%-25s%-15s%-15s\n", (i + 1) + ")", drinks[i].getName(),
                        drinks[i].getCalories() + " Calories", "$" + drinks[i].getPrice());
            }
            drawLine();
        }
        if (item.equals("dessert") || item.equals("all")) {
            drawLine();
            System.out.println("Desserts:");
            drawLine();
            for (int i = 0; i < desserts.length; i++) {
                System.out.printf("%-4s%-25s%-15s%-15s\n", (i + 1) + ")", desserts[i].getName(),
                        desserts[i].getCalories() + " Calories", "$" + desserts[i].getPrice());
            }
            drawLine();
        }

    }
}