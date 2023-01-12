class BankAcct:
    all_accts =[]

    def __init__(self,int_rate,balance) :
        self.int_rate = int_rate
        self.balance = balance
        BankAcct.all_accts.append(self)  
    
    def deposit(self,amount):
        self.balance = self.balance + amount
        return self

    def witdraw(self,amount):
        self.balance = self.balance - amount
        return self

    def display_account(self):
        print(f"Balance: {self.balance}")
        return self

    def yield_interest(self):
        if self.balance > 0:
            self.balance = self.balance * self.int_rate    
        return self

    # @classmethod
    # def display_info(cls):
    #     for account in cls.all_accts:
    #     account.display_account


account1 = BankAcct(1.1,1000)
account2 = BankAcct(1.15,5000)

# account1.display_account()
# account2.display_account()

account1.deposit(100).deposit(100).deposit(100).witdraw(150).yield_interest().display_account()
account2.deposit(500).deposit(6000).witdraw(150).witdraw(120).witdraw(90).witdraw(1650).yield_interest().display_account()


