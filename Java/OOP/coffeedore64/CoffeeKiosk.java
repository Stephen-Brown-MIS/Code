import java.util.ArrayList;

public class CoffeeKiosk {
    private ArrayList<Item> menu;
    private ArrayList<Order> orders;


    public CoffeeKiosk () {
        this.menu = new ArrayList<Item>();
        this.orders = new ArrayList<Order>();
    }

    public void addMenuItem (String name, double price ) {
        Item newItem = new Item(name, price);
        menu.add(newItem);
        newItem.setIndex(menu.indexOf(newItem));
        // ***** Need to revist ****
    }
    
    public void displayMenu() {
        for (Item item : menu){
            System.out.println(item.getIndex() + ": " + item.getName() + " -  $" + item.getPrice());
        }
    }

    public void newOrder() {
        // Shows the user a message prompt and then sets their input to a variable, name
        System.out.println("Please enter customer name for new order:");
        String name = System.console().readLine();
    
        // Your code:
        // Create a new order with the given input string
        Order order = new Order(name);

        // Show the user the menu, so they can choose items to add.
        displayMenu();
        // Prompts the user to enter an item number
        System.out.println("Please enter a menu item index or q to quit:");
        String itemNumber = System.console().readLine();
        
        // Write a while loop to collect all user's order items
        while(!itemNumber.equals("q")) {
        
            // Get the item object from the menu, and add the item to the order
            try{
                order.addItem(menu.get(Integer.parseInt(itemNumber)));
            }catch (IndexOutOfBoundsException i){
                System.out.println("Please select a valid order item");
            }catch(NumberFormatException n){
                System.out.println("Please select a valid order item");
            }
            // Ask them to enter a new item index or q again, and take their input
            System.out.println("Please enter a menu item index or q to quit:");
            itemNumber = System.console().readLine();
        }
        // After you have collected their order, print the order details 
        // as the example below. You may use the order's display method.
        order.display();
    }

    public void adminUsercheck(){
        System.out.println("Please enter 1 to create an order, or press Enter for admin options.");
        String selection = System.console().readLine();
        System.out.println(selection);
        if (selection.equals("1")){
            this.newOrder();
        } else {
            this.addMenuEntry();
        }
    }

    public void addMenuEntry(){
        String continuePrompt = new String();
        
        while(!continuePrompt.equals("q")){
        System.out.println("Please enter the name of a new item");
        String newItem = System.console().readLine();
        System.out.println("Please enter the price of the new item");
        
        try{
            String newPrice = System.console().readLine();
            double doublePrice = Double.parseDouble(newPrice);
            addMenuItem(newItem, doublePrice);
        }catch(NumberFormatException n){
            System.out.println("Please enter a valid price");
        }


        System.out.println("** Press ENTER ** to add another item to the menu, or q to quit:");
        continuePrompt = System.console().readLine();

        }
        System.out.println("    Current Menu");
        System.out.println("------------------------\n");
        this.displayMenu();
    }
    //Getters
    // public Arraylist<Item> getMenu() {
    //     return this.menu;
    // }
    // public Arraylist<Order> getOrders() {
    //     return this.orders;
    // }

     // //Setters
    // public void setMenu(Arraylist<Item> menu) {
    //     this.menu = menu;
    // }

    // public void setOrders(Arraylist<Order> orders) {
    //     this.orders = orders;
    // }
}


