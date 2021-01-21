
/**
  * Represents the menu.
  */
public class Menu {
    private static Burger[] burgers = {};
    private static Drink[] drinks = {};
    private static Dessert[] desserts = {};

    /**
      * Adds burger to menu.
      * @param burger The burger to be added.
      */
    public static void add(Burger burger) {
        Burger[] newArr = new Burger[burgers.length + 1];
        for (int i = 0; i < burgers.length; i++) {
            newArr[i] = burgers[i];
        }
        newArr[burgers.length] = burger;

        burgers = newArr;
    }

    /**
      * Adds drink to menu.
      * @param drink The drink to be added.
      */
    public static void add(Drink drink) {
        Drink[] newArr = new Drink[drinks.length + 1];
        for (int i = 0; i < drinks.length; i++) {
            newArr[i] = drinks[i];
        }
        newArr[drinks.length] = drink;

        drinks = newArr;
    }

    /**
      * Adds dessert to menu.
      * @param dessert The dessert to be added.
      */
    public static void add(Dessert dessert) {
        Dessert[] newArr = new Dessert[desserts.length + 1];
        for (int i = 0; i < desserts.length; i++) {
            newArr[i] = desserts[i];
        }
        newArr[desserts.length] = dessert;

        desserts = newArr;
    }

    /**
      * @return Array of burgers in the menu.
      */
    public static Burger[] getBurgers() {
        return burgers;
    }

    /**
      * @return Array of drinks in the menu.
      */
    public static Drink[] getDrinks() {
        return drinks;
    }

    /**
      * @return Array of desserts in the menu.
      */
    public static Dessert[] getDesserts() {
        return desserts;
    }

    /**
      * Prints a line.
      */
    public static void drawLine() {
        System.out.println("-----------------------------------------------");
    }

    /**
      * Prints the menu depending on parameter.
      * @param item "burger" prints burger menu.
      *             "drink" prints drink menu.
      *             "dessert" prints dessert menu.
      *             "all" prints entire menu.
      */
    public static void display(String item) {
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