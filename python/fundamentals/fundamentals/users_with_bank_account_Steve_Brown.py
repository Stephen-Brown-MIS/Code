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

class User:
    def __init__(self, name, email):
        self.name = name
        self.email = email
        self.account = BankAcct(int_rate=1.12, balance=0)
            
    def make_deposit(self, amount):
        self.account.deposit(amount)
        return self
        

    def make_withdrawl(self, amount):
        self.account.witdraw(amount)
        return self

    def calc_interest(self):
        self.account.yield_interest()
        return self

    def display_user_balance(self):
        print(f"The account balance for {self.name} is {self.account.balance}")
        return self

user1 = User("Steve","Steve@gmail.com")
user2 = User("Louise", "Louise@gmail.com")


user1.make_deposit(1000).calc_interest().display_user_balance()

user2.make_deposit(60000).make_deposit(203).make_withdrawl(42000).calc_interest().display_user_balance()






