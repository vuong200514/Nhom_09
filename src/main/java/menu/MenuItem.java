package menu;

public class MenuItem {
    private String menuItemId;
    private String title;
    private String description;
    private double price;

    public MenuItem(String id, String title, String description, double price) {
        this.menuItemId = id;
        this.title = title;
        this.description = description;
        this.price = price;
    }

    public void updatePrice(double price) {
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }
}
