import java.util.ArrayList;
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

    public void addCustomer(ArrayList<String> customers){
        System.out.println("Please enter your name: ");
        String userName = System.console().readLine();
        System.out.println("Hello " + userName + "!");

    }


}   
