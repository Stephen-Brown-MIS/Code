public class CafeJava {
    public static void main(String[] args) {
        // APP VARIABLES
        // Lines of text that will appear in the app. 
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";
        String linebreak = "------------------------------------";


        // Menu variables (add yours below)
        double mochaPrice = 6.50;
        double dripCoffeePrice = 3.00;
        double lattePrice = 4.95;
        double cappuccinoPrice = 4.25;
    
        // Customer name variables (add yours below)
        String customer1 = "Cindhuri";
        String customer2 = "Sam";
        String customer3 = "Jimmy";
        String customer4 = "Noah";

    
        // Order completions (add yours below)
        boolean isReadyOrder1 = false;
        boolean isReadyOrder2 = true;
        boolean isReadyOrder3 = false;
        boolean isReadyOrder4 = true;
            
        // APP INTERACTION SIMULATION (Add your code for the challenges below)
        // Example:
        System.out.println(linebreak);
        System.out.println(generalGreeting + customer1); // Displays "Welcome to Cafe Java, Cindhuri"
        
        // ** Your customer interaction print statements will go here ** //
        
        //Cindhuri ordered a coffee. Print to the console the correct status message,
        // based on her order status.
        if (isReadyOrder1 == true) {
            System.out.println(customer1 + readyMessage);
        }else {
            System.out.println(customer1 + pendingMessage);
        }

        //Noah ordered a cappucino. Use an if statement to check the status of his order and print 
        // the correct status message. If it is ready, also print the message to display the 
        // total. Note: Outcomes may be different depending on what you assigned as the status.
        System.out.println(linebreak);
        System.out.println(generalGreeting + customer4); 

        if (isReadyOrder4 == true) {
            System.out.println(customer4 + readyMessage);
            System.out.println(displayTotalMessage + cappuccinoPrice);
        }else {
            System.out.println(customer4 + pendingMessage);
        }


        // Sam just ordered 2 lattes, print the message to display their total. 
        // Next, use an if statement to print the appropriate order status message. 
        // Change the isReady flag value from true to false or 
        // vice versa in order to test your control logic (if-statement).
        System.out.println(linebreak);
        System.out.println(generalGreeting + customer2); 

        if (isReadyOrder2 == true) {
            System.out.println(customer2 + readyMessage);
            System.out.println(displayTotalMessage + lattePrice*2);
        }else {
            System.out.println(customer2 + pendingMessage);
        }

        // Jimmy just realized he was charged for a coffee but had ordered a latte. 
        // Print the total message with the new calculated total (what he owes) 
        // to make up the difference.
        System.out.println(linebreak);
        System.out.println(generalGreeting + customer3);
        double newTotal =  (lattePrice - dripCoffeePrice);
        System.out.println(displayTotalMessage + newTotal);

    }
}
