public class Main {
    public static void main(String[] args) {
        // Create Burgers
        new Burger("!Small Mac", 550, 3.99);
        new Burger("Half Ouncer", 293, 5.99);
        new Burger("McSingle", 1000, 5.99);
        new Burger("Chegg McMuffin", 310, 2.79);
        new Burger("Filet O(fish)", 870, 3.79);

        // Create Drinks
        new Drink("!Pepsi", 210, 1.29);
        new Drink("Sprite Cranberry", 170, 1.49);
        new Drink("Boiled Leaf Juice", 50, 1.19);
        new Drink("Expresso.js", 260, 3.49);
        new Drink("Coffee.java", 210, 1.99);

        // Create Desserts
        new Dessert("Apple Glitter", 510, 1.99);
        new Dessert("Hot Fudge --Monday", 340, 1.29);
        new Dessert("McFlurry<M&&M>", 640, 3.99);
        new Dessert("McFlurry<||EO>", 640, 1.79);
        new Dessert("Baked Apple \u03C0", 240, 2.99);

        // Begin Order
        Payment.startOrder();
    }
}