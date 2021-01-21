import java.util.*;

/**
  * Represents the ordering process.
  * Prints receipt.
  * Determines if user gets a Happy Meal toy or not.
  */
public class Payment {
    private static Scanner in = new Scanner(System.in);

    private static List<HashMap<String, String>> orderedBurgers = new ArrayList<HashMap<String, String>>();
    private static List<HashMap<String, String>> orderedDrinks = new ArrayList<HashMap<String, String>>();
    private static List<HashMap<String, String>> orderedDesserts = new ArrayList<HashMap<String, String>>();
    private static double total = 0;

    /**
      * Adds burger to order.
      * @param burger The burger ordered.
      * @param amount The number of that burger ordered.
      */
    private static void addToOrder(Burger burger, int amount) {
        // Local Map
        HashMap<String, String> map = new HashMap<String, String>();

        // Set Key, Value Pair
        map.put("name", burger.getName());
        map.put("calories", Integer.toString(burger.getCalories()));
        map.put("price", Double.toString(burger.getPrice()));
        map.put("amount", Integer.toString(amount));

        // Append local map to orderedBurgers
        orderedBurgers.add(map);

        // Update Total Price
        calculateTotal();

        System.out.printf("Your total is now: $%.2f\n", total);
    }

    /**
      * Adds drink to order.
      * @param drink The drink ordered.
      * @param amount The number of that drink ordered.
      */
    private static void addToOrder(Drink drink, int amount) {
        // Local Map
        HashMap<String, String> map = new HashMap<String, String>();

        // Set Key, Value Pair
        map.put("name", drink.getName());
        map.put("calories", Integer.toString(drink.getCalories()));
        map.put("price", Double.toString(drink.getPrice()));
        map.put("amount", Integer.toString(amount));

        // Append local map to orderedBurgers
        orderedDrinks.add(map);

        // Update Total Price
        calculateTotal();

        System.out.printf("Your total is now: $%.2f\n", total);
    }

    /**
      * Adds dessert to order.
      * @param dessert The dessert ordered.
      * @param amount The number of that dessert ordered.
      */
    private static void addToOrder(Dessert dessert, int amount) {
        // Local Map
        HashMap<String, String> map = new HashMap<String, String>();

        // Set Key, Value Pair
        map.put("name", dessert.getName());
        map.put("calories", Integer.toString(dessert.getCalories()));
        map.put("price", Double.toString(dessert.getPrice()));
        map.put("amount", Integer.toString(amount));

        // Append local map to orderedBurgers
        orderedDesserts.add(map);

        // Update Total Price
        calculateTotal();

        System.out.printf("Your total is now: $%.2f\n", total);
    }

    /**
      * Calculates the total of the order.
      * Loops through burgers, drinks, and desserts
      * to add up the prices.
      */
    private static void calculateTotal() {
        for (HashMap<String, String> map : orderedBurgers) {
            total += Double.parseDouble(map.get("price")) * Integer.parseInt(map.get("amount"));
        }

        for (HashMap<String, String> map : orderedDrinks) {
            total += Double.parseDouble(map.get("price")) * Integer.parseInt(map.get("amount"));
        }

        for (HashMap<String, String> map : orderedDesserts) {
            total += Double.parseDouble(map.get("price")) * Integer.parseInt(map.get("amount"));
        }
    }

    /**
      * Asks user for the burgers they would like to order.
      */
    public static void askBurgerOrder() {
        // Display Burger Menu
        Menu.display("burger");

        System.out.println("Which burger would you like to order? (Type 0 for no burger)");

        // Ask user for burger choice
        int choice;

        // Checks if input is integer
        // Checks if integer is not negative and less than max length
        do {
            while (!in.hasNextInt()) {
                System.out.println("Please enter a valid number");
                in.next();
            }
            choice = in.nextInt();
            if (choice < 0 || choice > Menu.getBurgers().length) {
                System.out.println("Please enter a valid number");
            }
        } while (choice < 0 || choice > Menu.getBurgers().length);

        if (choice > 0) {
            // Chosen Burger
            Burger chosenBurger = Menu.getBurgers()[choice - 1];

            // Ask for amount of this burger
            System.out.println("How many " + chosenBurger.getName() + "'s would you like?");

            // Checks if amount is less than zero
            int amount;
            do {
                while (!in.hasNextInt()) {
                    System.out.println("Please enter a valid number");
                    in.next();
                }
                amount = in.nextInt();
                if (amount <= 0) {
                    System.out.println("Please enter a valid number");
                }
            } while (amount <= 0);

            // Create order
            addToOrder(chosenBurger, amount);

            // Ask if user wants to pick another burger
            System.out.println("Would you like to order another burger? (y/n)");
            String agree = in.nextLine();

            while (!agree.toLowerCase().startsWith("y") && !agree.toLowerCase().startsWith("n")) {
                agree = in.nextLine();
            }

            // If yes, restart method
            if (agree.toLowerCase().startsWith("y")) {
                askBurgerOrder();
            }
        }
    }

    /**
      * Asks user for the drink they would like to order.
      */
    public static void askDrinkOrder() {
        // Display Drink Menu
        Menu.display("drink");

        System.out.println("Which drink would you like to order? (Type 0 for no drink)");

        // Ask user for drink choice
        int choice;

        // Checks if input is integer
        // Checks if integer is not negative and less than max length
        do {
            while (!in.hasNextInt()) {
                System.out.println("Please enter a valid number");
                in.next();
            }
            choice = in.nextInt();
            if (choice < 0 || choice > Menu.getDrinks().length) {
                System.out.println("Please enter a valid number");
            }
        } while (choice < 0 || choice > Menu.getDrinks().length);

        if (choice > 0) {
            // Chosen Drink
            Drink chosenDrink = Menu.getDrinks()[choice - 1];

            // Ask for amount of this drink
            System.out.println("How many " + chosenDrink.getName() + "'s would you like?");

            // Checks if amount is less than zero
            int amount;
            do {
                while (!in.hasNextInt()) {
                    System.out.println("Please enter a valid number");
                    in.next();
                }
                amount = in.nextInt();
                if (amount <= 0) {
                    System.out.println("Please enter a valid number");
                }
            } while (amount <= 0);

            // Create order
            addToOrder(chosenDrink, amount);

            // Ask if user wants to pick another drink
            System.out.println("Would you like to order another drink? (y/n)");
            String agree = in.nextLine();

            while (!agree.toLowerCase().startsWith("y") && !agree.toLowerCase().startsWith("n")) {
                agree = in.nextLine();
            }

            // If yes, restart method
            if (agree.toLowerCase().startsWith("y")) {
                askDrinkOrder();
            }
        }
    }

    /**
      * Asks user for the dessert they would like to order.
      */
    public static void askDessertOrder() {
        // Display Dessert Menu
        Menu.display("dessert");

        System.out.println("Which dessert would you like to order? (Type 0 for no dessert)");

        // Ask user for dessert choice
        int choice;

        // Checks if input is integer
        // Checks if integer is not negative and less than max length
        do {
            while (!in.hasNextInt()) {
                System.out.println("Please enter a valid number");
                in.next();
            }
            choice = in.nextInt();
            if (choice < 0 || choice > Menu.getDesserts().length) {
                System.out.println("Please enter a valid number");
            }
        } while (choice < 0 || choice > Menu.getDesserts().length);

        if (choice > 0) {
            // Chosen Dessert
            Dessert chosenDessert = Menu.getDesserts()[choice - 1];

            // Ask for amount of this dessert
            System.out.println("How many " + chosenDessert.getName() + "'s would you like?");

            // Checks if amount is less than zero
            int amount;
            do {
                while (!in.hasNextInt()) {
                    System.out.println("Please enter a valid number");
                    in.next();
                }
                amount = in.nextInt();
                if (amount <= 0) {
                    System.out.println("Please enter a valid number");
                }
            } while (amount <= 0);

            // Create order
            addToOrder(chosenDessert, amount);

            // Ask if user wants to pick another dessert
            System.out.println("Would you like to order another dessert? (y/n)");
            String agree = in.nextLine();

            while (!agree.toLowerCase().startsWith("y") && !agree.toLowerCase().startsWith("n")) {
                agree = in.nextLine();
            }

            // If yes, restart method
            if (agree.toLowerCase().startsWith("y")) {
                askDessertOrder();
            }
        }
    }

    /**
      * Begins ordering process.
      */
    public static void startOrder() {
        // // Displays Menu
        System.out.println("Welcome to !McDonald's");

        // Asks for burger order
        askBurgerOrder();

        // Asks for drink order
        askDrinkOrder();

        // Asks for dessert order
        askDessertOrder();

        // Prints Receipt
        printReceipt();

        in.close();
    }

    /**
      * Prints the receipt.
      * - Summary of burgers ordered.
      * - Summary of drinks ordered.
      * - Summary of desserts ordered.
      * - Total Price.
      * - Happy Meal Toy (maybe).
      */
    public static void printReceipt() {
        System.out.println();
        System.out.println();
        System.out.println();

        Menu.drawLine();
        System.out.println("Thank you for ordering from !McDonalds");
        System.out.println();

        System.out.println("Here is your receipt:");

        Menu.drawLine();
        System.out.println("Burgers");
        System.out.println();

        for (HashMap<String, String> map : orderedBurgers) {
            System.out.printf("%-20s $%.2f\n", map.get("name"), Double.parseDouble(map.get("price")));
            System.out.printf("%-20s $%.2f\n", "x" + map.get("amount"), Double.parseDouble(map.get("price")) * Integer.parseInt(map.get("amount")));
            System.out.println();
        }

        Menu.drawLine();
        System.out.println("Drinks");
        System.out.println();

        for (HashMap<String, String> map : orderedDrinks) {
            System.out.printf("%-20s $%.2f\n", map.get("name"), Double.parseDouble(map.get("price")));
            System.out.printf("%-20s $%.2f\n", "x" + map.get("amount"), Double.parseDouble(map.get("price")) * Integer.parseInt(map.get("amount")));
            System.out.println();
        }

        Menu.drawLine();
        System.out.println("Desserts");
        System.out.println();

        for (HashMap<String, String> map : orderedDesserts) {
            System.out.printf("%-20s $%.2f\n", map.get("name"), Double.parseDouble(map.get("price")));
            System.out.printf("%-20s $%.2f\n", "x" + map.get("amount"), Double.parseDouble(map.get("price")) * Integer.parseInt(map.get("amount")));
            System.out.println();
        }

        Menu.drawLine();
        System.out.printf("Your total: $%.2f\n", total);
        Menu.drawLine();

        System.out.println();
        System.out.println();
        System.out.println();

        // Get Happy Meal Toy
        HappyMeal.getToy();
    }
}