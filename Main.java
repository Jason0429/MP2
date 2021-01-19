public class Main {
    public static void main(String[] args) {
        // Create Burgers
        new Burger("!Small Mac", 550, 3.99);
        new Burger("Half Ouncer", 293, 5.99);
        new Burger("McSingle", 1000, 5.99);
        new Burger("Chegg McMuffin", 310, 2.79);
        new Burger("Filet O(fish)", 870, 3.79);

        // Create Drinks
        new Drink("!Pepsi", 1000, 5.99);
        new Drink("Sprite Cranberry", 1000, 5.99);
        new Drink("Boiled Leaf Juice", 1000, 5.99);
        new Drink("Expresso.js", 1000, 5.99);
        new Drink("Coffee.java", 1000, 5.99);

        // Create Desserts
        new Dessert("Apple Glitter", 1000, 5.99);
        new Dessert("Hot Fudge --Monday", 1000, 5.99);
        new Dessert("McFlurry<M&&M>", 1000, 5.99);
        new Dessert("McFlurry<||EO>", 1000, 5.99);
        new Dessert("Baked Apple \u03C0", 1000, 5.99);

        Payment.startOrder();
    }
}