import java.util.ArrayList;

public class TestOrders {
    public static void main(String[] args) {
    

        // Menu items
        Item item1 = new Item("drip", 5);
        Item item2 = new Item("cappuccino", 3.5);
        Item item3 = new Item("mocha", 4);
        Item item4 = new Item("latte", 4.5);


        // Create 2 new orders for unspecified guests(no names):
        Order order1 = new Order();
        Order order2 = new Order();


        // Create 3 new orders using overload constructor:
        Order order3 = new Order("Ryan");
        Order order4 = new Order("Dad");
        Order order5 = new Order("Jacque");


        // Add at least 2 items to every order using the addItem method:
        order1.addItem(item1);
        order1.addItem(item3);

        order2.addItem(item2);
        order2.addItem(item1);

        order3.addItem(item1);
        order3.addItem(item1);

        order4.addItem(item4);
        order4.addItem(item2);

        order5.addItem(item1);
        order5.addItem(item4);


        // Test getStatusMessage() method- set some order to ready:
        order1.setReady(true);
        System.out.println(order1.getStatusMessage());

        order2.setReady(true);
        System.out.println(order2.getStatusMessage());

        order3.setReady(true);
        System.out.println(order3.getStatusMessage());

        System.out.println(order4.getStatusMessage());
        System.out.println(order5.getStatusMessage());


        // Test getOrderTotal() method:
        System.out.println(order1.getOrderTotal());
        System.out.println(order2.getOrderTotal());
        System.out.println(order3.getOrderTotal());
        System.out.println(order4.getOrderTotal());
        System.out.println(order5.getOrderTotal());
        

        // Test the display() method:
        order1.display();
        order2.display();
        order3.display();
        order4.display();
        order5.display();
    }
}