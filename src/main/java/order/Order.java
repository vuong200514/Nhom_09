package order;

import menu.MenuItem;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private String orderId;
    private List<MenuItem> items;

    public Order(String id) {
        this.orderId = id;
        this.items = new ArrayList<>();
    }

    public void addItem(MenuItem item) {
        items.add(item);
    }

    public void printOrder() {
        System.out.println("Order ID: " + orderId);
        for (MenuItem item : items) {
            System.out.println("- " + item.getTitle() + ": $" + item.getPrice());
        }
    }
}
