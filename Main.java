public class Main {
    public static void main(String[] args) {

        new Burger("Small Mac", 1000, 5.99, new String[] {"Bun"});
        new Burger("Big Mac", 293, 5.99, new String[] {"Bun"});
        new Burger("Medium Mac", 1000, 5.99, new String[] {"Bun"});
        new Burger("Small Mac", 20, 5.99, new String[] {"Bun"});
        new Burger("Small Mac", 1000, 5.99, new String[] {"Bun"});

        new Drink("Small Mac", 1000, 5.99);
        new Drink("Small Mac", 1000, 5.99);
        new Drink("Small Mac", 1000, 5.99);
        new Drink("Small Mac", 1000, 5.99);
        new Drink("Small Mac", 1000, 5.99);

        new Dessert("Small Mac", 1000, 5.99);
        new Dessert("Small Mac", 1000, 5.99);
        new Dessert("Small Mac", 1000, 5.99);
        new Dessert("Small Mac", 1000, 5.99);
        new Dessert("Small Mac", 1000, 5.99);

        Menu.display();
    }
}