package menu;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private String menuId;
    private String title;
    private String description;
    private List<MenuSection> sections;

    public Menu(String id, String title, String description) {
        this.menuId = id;
        this.title = title;
        this.description = description;
        this.sections = new ArrayList<>();
    }

    public void addMenuSection(MenuSection section) {
        sections.add(section);
    }

    public void printMenu() {
        System.out.println("Menu: " + title);
        for (MenuSection section : sections) {
            section.printMenuItems();
        }
    }
}
