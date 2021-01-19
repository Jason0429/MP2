import java.util.*;

public class Payment {
    private static Scanner in = new Scanner(System.in);

    // Array of HashMaps with Item Type and Amount
    private static ArrayList<HashMap<Burger, Integer>> orderedBurgers = new ArrayList<HashMap<Burger, Integer>>();
    private static ArrayList<HashMap<Drink, Integer>> orderedDrinks = new ArrayList<HashMap<Drink, Integer>>();
    private static ArrayList<HashMap<Dessert, Integer>> orderedDesserts = new ArrayList<HashMap<Dessert, Integer>>();

    // Total Price
    private static double total = 0;

    // Happy Meal
    private static HappyMeal happyMeal;

    // Add Burger to Order
    private static void addToOrder(Burger burger, int amount) {
        // Local Map
        HashMap<Burger, Integer> map = new HashMap<Burger, Integer>();

        // Set Key, Value Pair
        map.put(burger, amount);

        // Append local map to orderedBurgers
        orderedBurgers.add(map);

        // Update Total Price
        calculateTotal();

        System.out.printf("Your total is now: $%.2f\n", total);
    }

    // Add Dessert to Order
    private static void addToOrder(Drink drink, int amount) {
        // Local Map
        HashMap<Drink, Integer> map = new HashMap<Drink, Integer>();

        // Set Key, Value Pair
        map.put(drink, amount);

        // Append local map to orderedDrinks
        orderedDrinks.add(map);

        // Update Total Price
        calculateTotal();

        System.out.printf("Your total is now: $%.2f\n", total);
    }

    // Add Drink to Order
    private static void addToOrder(Dessert dessert, int amount) {
        // Local Map
        HashMap<Dessert, Integer> map = new HashMap<Dessert, Integer>();

        // Set Key, Value Pair
        map.put(dessert, amount);

        // Append local map to orderedDesserts
        orderedDesserts.add(map);

        // Update Total Price
        calculateTotal();

        System.out.printf("Your total is now: $%.2f\n", total);
    }

    // Calculates the total
    private static void calculateTotal() {
        // For each HashMap in orderedBurgers ArrayList
        for (HashMap<Burger, Integer> map : orderedBurgers) {
            // For each key in HashMap
            for (Burger b : map.keySet()) {
                // Increment total by the price * amount
                total += b.getPrice() * map.get(b);
            }
        }

        // For each HashMap in orderedDrinks ArrayList
        for (HashMap<Drink, Integer> map : orderedDrinks) {
            // For each key in HashMap
            for (Drink d : map.keySet()) {
                // Increment total by the price * amount
                total += d.getPrice() * map.get(d);
            }
        }

        // For each HashMap in orderedDessert ArrayList
        for (HashMap<Dessert, Integer> map : orderedDesserts) {
            // For each key in HashMap
            for (Dessert d : map.keySet()) {
                // Increment total by the price * amount
                total += d.getPrice() * map.get(d);
            }
        }
    }

    // Sets Total Price
    public static void setTotal(double total) {
        Payment.total = total;
    }

    // Asks and receives burger order information
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

    // Asks and receives drink order information
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

    // Asks and receives dessert order information
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

    // Returns most ordered item name
    public static String getMostOrderedItemName() {
        int count = 0;
        String mostOrdered = "";

        for (HashMap<Burger, Integer> map : orderedBurgers) {
            for (Burger b : map.keySet()) {
                if (map.get(b) > count) {
                    count = map.get(b);
                    mostOrdered = b.getName();
                }
            }
        }

        for (HashMap<Drink, Integer> map : orderedDrinks) {
            for (Drink d : map.keySet()) {
                if (map.get(d) > count) {
                    count = map.get(d);
                    mostOrdered = d.getName();
                }
            }
        }

        for (HashMap<Dessert, Integer> map : orderedDesserts) {
            for (Dessert d : map.keySet()) {
                if (map.get(d) > count) {
                    count = map.get(d);
                    mostOrdered = d.getName();
                }
            }
        }

        return mostOrdered;
    }

    // Returns most expensive item name
    public static String getMostExpensiveItem() {
        String mostExpensive = "";
        double price = 0;

        for (HashMap<Burger, Integer> map : orderedBurgers) {
            for (Burger b : map.keySet()) {
                if (b.getPrice() > price) {
                    price = b.getPrice();
                    mostExpensive = b.getName();
                }
            }
        }

        for (HashMap<Drink, Integer> map : orderedDrinks) {
            for (Drink d : map.keySet()) {
                if (d.getPrice() > price) {
                    price = d.getPrice();
                    mostExpensive = d.getName();
                }
            }
        }

        for (HashMap<Dessert, Integer> map : orderedDesserts) {
            for (Dessert d : map.keySet()) {
                if (d.getPrice() > price) {
                    price = d.getPrice();
                    mostExpensive = d.getName();
                }
            }
        }

        return mostExpensive;
    }

    // Returns cheapest item name
    public static String getCheapestItem() {
        String cheapest = "";
        double price = Double.MAX_VALUE;

        for (HashMap<Burger, Integer> map : orderedBurgers) {
            for (Burger b : map.keySet()) {
                if (b.getPrice() < price) {
                    price = b.getPrice();
                    cheapest = b.getName();
                }
            }
        }

        for (HashMap<Drink, Integer> map : orderedDrinks) {
            for (Drink d : map.keySet()) {
                if (d.getPrice() < price) {
                    price = d.getPrice();
                    cheapest = d.getName();
                }
            }
        }

        for (HashMap<Dessert, Integer> map : orderedDesserts) {
            for (Dessert d : map.keySet()) {
                if (d.getPrice() < price) {
                    price = d.getPrice();
                    cheapest = d.getName();
                }
            }
        }

        return cheapest;
    }

    // Returns average price
    public static double getAveragePrice() {
        return total / (orderedBurgers.size() + orderedDrinks.size() + orderedDesserts.size());
    }

    // Begins asking customer for order information
    public static void startOrder() {
        System.out.println("What is your name?");

        String name = in.nextLine();

        happyMeal = new HappyMeal(name);

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

    // Prints Receipt
    public static void printReceipt() {
        System.out.println();
        System.out.println();
        System.out.println();

        Menu.drawLine();
        System.out.println("Have A Great Day, " + happyMeal.getName());
        System.out.println("Thank you for ordering from !McDonalds");
        System.out.println();

        System.out.println("Here is your receipt:");
        Menu.drawLine();
        System.out.println("Burgers");
        System.out.println();

        // For each HashMap in orderedBurger ArrayList
        for (HashMap<Burger, Integer> map : orderedBurgers) {
            // For each key in HashMap
            for (Burger b : map.keySet()) {
                // Big Mac $5.99
                // x10 $59.90
                //
                System.out.printf("%-20s $%.2f\n", b.getName(), b.getPrice());
                System.out.printf("%-20s $%.2f\n", "x" + map.get(b), b.getPrice() * map.get(b));
                System.out.println();
            }
        }
        Menu.drawLine();
        System.out.println("Drinks");
        System.out.println();

        // For each HashMap in orderedBurger ArrayList
        for (HashMap<Drink, Integer> map : orderedDrinks) {
            // For each key in HashMap
            for (Drink d : map.keySet()) {
                // Big Mac $5.99
                // x10 $59.90
                //
                System.out.printf("%-20s $%.2f\n", d.getName(), d.getPrice());
                System.out.printf("%-20s $%.2f\n", "x" + map.get(d), d.getPrice() * map.get(d));
                System.out.println();
            }
        }
        Menu.drawLine();
        System.out.println("Desserts");
        System.out.println();

        // For each HashMap in orderedBurger ArrayList
        for (HashMap<Dessert, Integer> map : orderedDesserts) {
            // For each key in HashMap
            for (Dessert d : map.keySet()) {
                // Big Mac $5.99
                // x10 $59.90
                //
                System.out.printf("%-20s $%.2f\n", d.getName(), d.getPrice());
                System.out.printf("%-20s $%.2f\n", "x" + map.get(d), d.getPrice() * map.get(d));
                System.out.println();
            }
        }
        Menu.drawLine();
        System.out.printf("Your total price is: $%.2f\n", total);
        Menu.drawLine();

        System.out.println();
        System.out.println();
        System.out.println();
    }
}