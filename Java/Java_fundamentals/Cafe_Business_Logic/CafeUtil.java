import java.util.ArrayList;
import java.text.*;
// import java.util.Date;
public class CafeUtil {

    public int getStreakGoal(){
        int sum = 0;
        for (int i=0; i<11; i++){
            sum += i;
        }
        return sum;
    }

    public double getOrderTotal(double[] amounts){
        double total = 0;
              
        for (int i=0; i< amounts.length; i++){       
            total += amounts[i];
        }
        return total;

    }

    public void displayMenu(ArrayList<String> menuItems){
    for (int i=0; i < menuItems.size(); i++){
        String item = menuItems.get(i);
        System.out.println((i+1) + " - " + item);
        }
    }   

    public void displayMenu(ArrayList<String> menuItems,ArrayList<Double> prices){
        for (int i=0; i < menuItems.size(); i++){
            String item = menuItems.get(i);
            String price = String.format ("$%.2f",prices.get(i));
            System.out.println((i+1) + " - " + item + " -- " + price);
            
            }
        }   
    

    public void addCustomer(ArrayList<String> customers){
        System.out.println("Please enter your name: ");
        String userName = System.console().readLine();
        System.out.println("\n");
        System.out.println("Hello " + userName + "!");
        customers.add(userName);
        System.out.println("There are " + (customers.size() - 1) + " customers ahead of you.");
        System.out.println("\n");
        System.out.println("Customer Queue");
        System.out.println("---------------");

        for (int i=0; i<customers.size(); i++){
            String customerQueue = customers.get(i);
            System.out.println(customerQueue);
        }
    }

    public void printPriceChart(String product, double price, int maxQuantity){
        System.out.println(product);
        double discount = 0;
        for (int i=1; i<maxQuantity + 1; i++){
            String priceString = String.format("$%.2f", price * i - discount);
            System.out.println(i + " - " + (priceString));
            discount = (.5*i);
        }

    }

}   
