import java.util.Date;
public class AlfredQuotes {
    
    public String basicGreeting() {
        // You do not need to code here, this is an example method
        return "Hello, lovely to see you. How are you?";
    }
    
    public String guestGreeting(String name) {
        // YOUR CODE HERE
        String greeting = String.format("Hello, %s. Lovely to see you!", name);
        return greeting;

    }
    
    public String dateAnnouncement() {
        // YOUR CODE HERE
        String announcement = String.format("Today is %s", new Date());
        return announcement;
    }
    
    public String respondBeforeAlexis(String conversation) {
        // YOUR CODE HERE
        int alexis_conversation = conversation.indexOf("Alexis");    
        int alfred_conversation = conversation.indexOf("Alfred");
        
        // System.out.println(alexis_conversation);        

        if (alexis_conversation < 0 && alfred_conversation < 0) {
            return "Right. And with that I shall retire.";
        }
        
        else if (alfred_conversation > 0) {
            return "+ Alfred At your service. As you wish, naturally.";
        }
        else if (alexis_conversation > 0) {
            return "+ Alexis Right away, sir. She certainly isn't sophisticated enough for that.";
        }
        return "Broken";
    }
    
	// NINJA BONUS
	// See the specs to overload the guessGreeting method
    // SENSEI BONUS
    // Write your own AlfredQuote method using any of the String methods you have learned!
}

