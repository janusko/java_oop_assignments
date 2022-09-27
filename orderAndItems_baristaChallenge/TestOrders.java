import java.util.ArrayList;

public class TestOrders {
    public static void main(String[] args) {
    
        CoffeeKiosk coffeeKiosk = new CoffeeKiosk();

        // Menu items
        coffeeKiosk.addMenuItem("drip", 5);
        coffeeKiosk.addMenuItem("cappuccino", 3.5);
        coffeeKiosk.addMenuItem("mocha", 4);
        coffeeKiosk.addMenuItem("latte", 4.5);

        // Order
        coffeeKiosk.newOrder();
    }
}