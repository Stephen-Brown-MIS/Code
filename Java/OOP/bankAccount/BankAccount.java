import java.util.Random;

public class BankAccount{
    private double checkingBalance;
    private double savingsBalance;
    private String accountNumber;
    public static int numberOfAccounts = 0;
    public static double totalBalance = 0;
    public BankAccount(){
        this.checkingBalance = 0;
        this.savingsBalance = 0;
        numberOfAccounts++;
        this.accountNumber = generateAccountNumber();
        // totalBalance += checkingBalance + savingsBalance;
    }
    
    
    //deposit funds to an account
    public void deposit(double amount, boolean isChecking){
        if(isChecking){
            this.checkingBalance += amount;
        }
        else{
            this.savingsBalance += amount;
        }
        totalBalance += amount;
    }

    //withdraw funds from an account
    public void withdraw(double amount, boolean isChecking){
        if(isChecking){
            if (this.checkingBalance >= amount){
                this.checkingBalance -= amount;
                totalBalance -= amount;
            }
            else{
                System.out.println("Checking Account - balance insufficient for withdrawal");


            }
        }
        else{   
            if(this.savingsBalance >= amount){
            this.savingsBalance -= amount;
            totalBalance -= amount;
            }
            else{
                System.out.println("Savings Account - balance insufficient for withdrawal");


            }
        }
        
    }
    
    // Generate a random 10-digit account number 

    private String generateAccountNumber() {
        Random rand = new Random();

        String numbers = "0123456789";
        String accountnumber = "";

        for (int i = 0; i < 10; i++) {
            char onePick = numbers.charAt(rand.nextInt(10));
            accountnumber = accountnumber + String.valueOf(onePick);
            }
        return String.join("", accountnumber);
        }

    // getters
    public double getCheckingBalance(){
        return this.checkingBalance;
    }
    
    public double getSavingsBalance(){
        return this.savingsBalance;
    }

    public String getAccountNumber(){
        return this.accountNumber;
    }
 


}