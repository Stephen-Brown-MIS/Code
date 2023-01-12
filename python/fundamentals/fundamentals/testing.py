class BankAcct:
    all_accts =[]

    def __init__(self,int_rate,balance,acct_num) :
        self.int_rate = int_rate
        self.balance = balance
        self.acct_num = acct_num
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
    def __init__(self, name, email,user_acct):
        self.name = name
        self.email = email
        self.account = BankAcct(int_rate=0.02, balance=0,acct_num=user_acct)
            
    def make_deposit(self, amount):
        self.account.deposit(amount)
        return self
        

    def make_withdrawl(self, amount):
        self.account.witdraw(amount)
        return self

    def display_user_balance(self):
        print(self.account.balance)
        return self

user1 = User("Steve","Steve@gmail.com",1)
user2 = User("Louise", "Louise@gmail.com",1)
user3 = User("Louise", "Louise@gmail.com",2)

user1.make_deposit(1000).display_user_balance()

user2.make_deposit(60000).make_deposit(203).make_withdrawl(42000).display_user_balance()




# account1 = BankAcct(1.1,1000)
# account2 = BankAcct(1.15,5000)

# account1.deposit(100).deposit(100).deposit(100).witdraw(150).yield_interest().display_account()
# account2.deposit(500).deposit(6000).witdraw(150).witdraw(120).witdraw(90).witdraw(1650).yield_interest().display_account()


