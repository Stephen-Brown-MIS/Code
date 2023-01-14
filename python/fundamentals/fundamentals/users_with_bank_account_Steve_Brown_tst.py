class BankAcct:
    
    def __init__(self,int_rate,balance) :
        self.int_rate = int_rate
        self.balance = balance
        
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

# Create a User class with the __init__ method - include name and email
class User:
    def __init__(self, name, email):
        self.name = name
        self.email = email
        self.account = BankAcct(int_rate=1.02, balance=0)

# Add a make_deposit method for the User class that calls on the bank accounts instance methods

    def make_deposit(self, amount):
        self.account.deposit(amount)
        return self
        
# Add a make_withdrawl method for the User class that calls on the bank accounts instance methods

    def make_withdrawl(self, amount):
        self.account.witdraw(amount)
        return self

# Add a display interest method under the User

    def calc_interest(self):
        self.account.yield_interest()
        return self

# Add a display balance method under the User - call the yield interest function

    def display_user_balance(self):
        self.account.yield_interest()
        print(f"The account balance for {self.name} is {self.account.balance}")
        return self

user1 = User("Steve","Steve@gmail.com")
user2 = User("Louise", "Louise@gmail.com")

user1.make_deposit(1000).display_user_balance()
user2.make_deposit(60000).make_deposit(203).make_withdrawl(42000).display_user_balance()






