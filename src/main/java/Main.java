import account.Account;
import constants.AccountStatus;
import menu.Menu;
import menu.MenuItem;
import menu.MenuSection;
import order.Order;
import person.Receptionist;
import restaurant.Branch;
import restaurant.Restaurant;
import table.Table;
import constants.TableStatus;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create restaurant
        Restaurant restaurant = new Restaurant("My Restaurant");

        // Create branch
        Branch mainBranch = new Branch("Main Branch", "123 Main St");
        restaurant.addBranch(mainBranch);

        // Create a menu
        Menu menu = new Menu("1", "Main Menu", "The main menu for the restaurant");

        // Create menu items
        MenuItem burger = new MenuItem("1", "Burger", "Delicious beef burger", 10.99);
        MenuItem pizza = new MenuItem("2", "Pizza", "Cheesy pizza with toppings", 8.99);
        MenuItem salad = new MenuItem("3", "Salad", "Fresh garden salad", 5.99);

        // Create a menu section and add items
        MenuSection section = new MenuSection("1", "Main Dishes", "Our main dishes");
        section.addMenuItem(burger);
        section.addMenuItem(pizza);
        section.addMenuItem(salad);
        menu.addMenuSection(section);

        // Print the menu
        menu.printMenu();

        // Create a table
        Table table1 = new Table("T1", 4, TableStatus.FREE);
        mainBranch.addTable(table1);

        // Create an account
        Account account = new Account("user1", "pass123", "123 Main St", AccountStatus.ACTIVE);
        
        // Create a receptionist
        Receptionist receptionist = new Receptionist("1", account, "Alice", "alice@example.com", "123456789");

        // Create an order
        Order order = new Order("O1");
        order.addItem(burger);
        order.addItem(pizza);
        
        // Print the order
        order.printOrder();
        
        scanner.close();
    }
}
