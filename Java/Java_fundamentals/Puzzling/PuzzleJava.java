import java.util.Random;
import java.util.ArrayList;

public class PuzzleJava {
    public ArrayList<Integer> getTenRolls() {
        ArrayList<Integer> tenRolls = new ArrayList<Integer>();
        for (int i = 1; i <= 10; i++) {
            tenRolls.add(new Random().nextInt(20) +  1);
        }
        return tenRolls;
    }

    public String getRandomLetter() {
        Random rand = new Random();

        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        
        char onePick = alphabet.charAt(rand.nextInt(26));
        return String.valueOf(onePick);
    }

    public String generatePassword() {
        Random rand = new Random();

        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String password = "";

        for (int i = 0; i < 8; i++) {
            char onePick = alphabet.charAt(rand.nextInt(26));
            password = password + String.valueOf(onePick);
            }
        return String.join("", password);
    }

    public String getNewPasswordSet(int digits) {
        Random rand = new Random();
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String password = "";
        ArrayList<String> passwordSet = new ArrayList<String>();
        while (passwordSet.size() < digits) {
            for (int i = 0; i < 8; i++) {
                char onePick = alphabet.charAt(rand.nextInt(26));
                password = password + String.valueOf(onePick);
                }
            passwordSet.add(password + " ");
            password = "";
        }
        return String.join("", passwordSet);

    }


}
