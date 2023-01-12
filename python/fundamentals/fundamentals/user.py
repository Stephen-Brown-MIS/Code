class User:
    def __init__(self,first_name,last_name,email,age) :
        # if self.first_name != self.first_name:
        self.first_name = first_name,
        self.last_name = last_name,
        self.email = email,
        self.age = age,
        self.is_rewards_member="False",
        self.gold_card_point=0
        # else:
        #     print("User already enrolled")
    
    def display_info(self):
        print(self.first_name)
        print(self.last_name)
        print(self.email)
        print(self.age)
        print(self.is_rewards_member)
        print(self.gold_card_point)

    def enroll(self):
        self.is_rewards_member = "True",
        self.gold_card_point = 200

    def spend_points(self,amount):
        self.gold_card_point = self.gold_card_point - amount 

    def display_info(self):
        print(self.first_name),
        print(self.last_name),
        print(self.email),
        print(self.age),
        print(self.is_rewards_member),
        print(self.gold_card_point)
        

new_user = User("Bill", "Burr","BillBurr@gamil.com",55)
new_user = User("Bill", "Burr","BillBurr@gamil.com",55)
print(new_user.first_name)

print(new_user.is_rewards_member)
new_user.enroll()
print(new_user.is_rewards_member)

# new_user.spend_points(self,50)
new_user.spend_points(50)
print(new_user.gold_card_point)

new_user2 = User("Stan", "Daman","SamDaman@gmail.com",105)
new_user3 = User("Jill", "Bladen","JokerJill@gmail.com",75)

new_user2.enroll()
new_user2.spend_points(80)
print(new_user2.gold_card_point)

new_user.display_info()
new_user2.display_info()
new_user3.display_info()