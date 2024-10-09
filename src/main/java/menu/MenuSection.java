package menu;

import java.util.ArrayList;
import java.util.List;

public class MenuSection {
    private String sectionId;
    private String title;
    private String description;
    private List<MenuItem> menuItems;

    public MenuSection(String id, String title, String description) {
        this.sectionId = id;
        this.title = title;
        this.description = description;
        this.menuItems = new ArrayList<>();
    }

    public void addMenuItem(MenuItem menuItem) {
        menuItems.add(menuItem);
    }

    public void printMenuItems() {
        System.out.println(title + ": " + description);
        for (MenuItem item : menuItems) {
            System.out.println("- " + item.getTitle() + ": $" + item.getPrice());
        }
    }
}
