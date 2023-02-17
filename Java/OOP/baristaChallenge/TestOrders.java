import java.util.ArrayList;
public class TestOrders {
    public static void main(String[] args) {
        
        // Menu items
        Item item1 = new Item("mocha", 4.00);
        Item item2 = new Item("latte", 5.50);
        Item item3 = new Item("drip coffee", 2.50);
        Item item4 = new Item("cappuccino",5.50);
        
        
        // Order variables -- order1, order2 etc.
        ArrayList<Order> orders = new ArrayList<Order>();
        Order order1 = new Order();
        Order order2 = new Order();
        Order order3 = new Order("Jimmy");
        Order order4 = new Order("Noah");
        Order order5 = new Order("Sam");
                
                
        // Application Simulations
        
        order1.addItem(item4);
        order1.addItem(item4);
        
        order2.addItem(item1);
        order2.addItem(item2);
        
        order3.addItem(item1);
        order3.addItem(item2);
        order3.addItem(item3);
        
        order4.addItem(item1);
        order4.addItem(item4);
        
        order5.addItem(item4);
        order5.addItem(item2);
        order5.addItem(item3);


        order2.setReady(true);
        System.out.println(order2.getStatusMessage());

        System.out.println(order1.getName());
        System.out.println(order2.getOrderTotal());
        System.out.println(order3.getName() + order3.getOrderTotal());
        System.out.println(order4.getOrderTotal());
        System.out.println(order5.getOrderTotal());
        

        // // Use this example code to test various orders' updates
        
        // System.out.printf("Name: %s\n", order1.name);
        // System.out.printf("Total: %s\n", order1.total);
        // System.out.printf("Ready: %s\n", order1.ready);
        // System.out.printf("-------------------\n");

        // System.out.printf("Name: %s\n", order2.name);
        // System.out.printf("Total: %s\n", order2.total);
        // System.out.printf("Name: %s\n", order2.name);
        // System.out.printf("Ready: %s\n", order2.ready);
        // System.out.printf("-------------------\n");
        
        // System.out.printf("Name: %s\n", order3.name);
        // System.out.printf("Name: %s\n", order2.name);
        // System.out.printf("Total: %s\n", order3.total);
        // System.out.printf("Ready: %s\n", order3.ready);
        // System.out.printf("-------------------\n");
        
        // System.out.printf("Name: %s\n", order4.name);
        // System.out.printf("Total: %s\n", order4.total);
        // System.out.printf("Name: %s\n", order2.name);
        // System.out.printf("Ready: %s\n", order4.ready);

    }
}
