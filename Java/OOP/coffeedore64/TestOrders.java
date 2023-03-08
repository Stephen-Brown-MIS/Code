
public class TestOrders {
    public static void main(String[] args) {
    
    CoffeeKiosk coffeeKiosk = new CoffeeKiosk();

    coffeeKiosk.addMenuItem("coffee", 2.00);
    coffeeKiosk.addMenuItem("latte", 4.50);
    coffeeKiosk.addMenuItem("mocha", 4.00);
    coffeeKiosk.addMenuItem("kombucha", 3.50);
    coffeeKiosk.addMenuItem("pale ale", 6.00);
    
    // coffeeKiosk.newOrder();
    coffeeKiosk.adminUsercheck();


    }
}
