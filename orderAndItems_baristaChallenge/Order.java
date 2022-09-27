import java.util.ArrayList;

public class Order {
    private String name;
    // private double total;
    private boolean ready;
    private ArrayList<Item> items = new ArrayList<Item>();


    // constructors
    public Order() {
        this.name = "Guest";
        this.ready = false;
    }
    public Order(String name) {
        this.name = name;
        this.ready = false;
    }


    // getters and setters
    public String getName() {
        return this.name;
    }
    public boolean getReady() {
        return this.ready;
    }
    public ArrayList<Item> getItems() {
        return items;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setReady(boolean ready) {
        this.ready = ready;
    }
    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }


    // class methods
    public void addItem(Item item){
        this.items.add(item);
    }
    public String getStatusMessage(){
        if(this.ready == true) {
            return "Your order is ready";
        } else {
            return "Thank you for waiting, " + this.name + ". Your order will be ready soon.";
        }
    }
    public double getOrderTotal() {
        double total = 0.0;
        for(Item i: this.items) {
            total += i.getPrice();
        }
        return total;
    }
    public void display() {
        System.out.println("Customer Name: " + this.name);
        for(Item i: this.items) {
            System.out.println(i.getName() + " : $" + i.getPrice());
        }
        System.out.println("Total: $" + this.getOrderTotal());
    }
}