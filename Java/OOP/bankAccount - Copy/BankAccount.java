public class BankAccount{
    private double checkingBalance;
    private double savingsBalance;
    public static int numberOfAccounts = 0;
    public static double totalBalance = 0;
    public BankAccount(){
        this.checkingBalance = 0;
        this.savingsBalance = 0;
        numberOfAccounts++;
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
                System.out.println("Checking Account - Insufficient Funds");
            }
        }
        else{   
            if(this.savingsBalance >= amount){
            this.savingsBalance -= amount;
            totalBalance -= amount;
            }
            else{
                System.out.println("Savings Account -Insufficient Funds");
            }
        }
        
    }
    
    // getters
    public double getCheckingBalance(){
        return this.checkingBalance;
    }
    
    public double getSavingsBalance(){
        return this.savingsBalance;
    }
    // // setters
    // public void setCheckingBalance(double checkingBalance){
    //     this.checkingBalance = checkingBalance;
    //     this.totalBalance = totalBalance + checkingBalance;

    // }

    // public void setSavingsBalance(double savingsBalance){
    //     this.savingsBalance = savingsBalance;
    //     this.totalBalance = totalBalance + savingsBalance;
    // }



}