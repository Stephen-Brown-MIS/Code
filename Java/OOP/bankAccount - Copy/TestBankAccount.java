class TestBankAccount {
    public static void main(String[] args) {
    
        BankAccount account1 = new BankAccount();
        account1.deposit(100,true);
        account1.deposit(1000,false);
        account1.withdraw(100,false);
        System.out.println("Account1 - checking balance: " + account1.getCheckingBalance());
        System.out.println("Account1 - savings balance:  " + account1.getSavingsBalance());

        BankAccount account2 = new BankAccount();
        account2.deposit(6000,true);
        account2.deposit(5000,false);
        account2.withdraw(100,false);
        account2.withdraw(10000,false);
        System.out.println("Account2 - checking balance: " + account2.getCheckingBalance());
        System.out.println("Account2 - savings balance:  " + account2.getSavingsBalance());

        System.out.println("Total balance: " + BankAccount.totalBalance); 
        System.out.println("Total accounts: " + BankAccount.numberOfAccounts); 
    }
    
}
