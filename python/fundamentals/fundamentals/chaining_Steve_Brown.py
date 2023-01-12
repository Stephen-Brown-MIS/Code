class User:
    def __init__(self,first_name,last_name,email,age) :
        self.first_name = first_name,
        self.last_name = last_name,
        self.email = email,
        self.age = age,
        self.is_rewards_member="False",
        self.gold_card_point=0
    
    def display_info(self):
        print(self.first_name)
        print(self.last_name)
        print(self.email)
        print(self.age)
        print(self.is_rewards_member)
        print(self.gold_card_point)
        return self

    def enroll(self):
        self.is_rewards_member = "True",
        self.gold_card_point = 200,
        return self

    def spend_points(self,amount):
        self.gold_card_point = self.gold_card_point - amount 
        return self

    def display_info(self):
        print(self.first_name),
        print(self.last_name),
        print(self.email),
        print(self.age),
        print(self.is_rewards_member),
        print(self.gold_card_point),
        return self

new_user = User("Bill", "Burr","BillBurr@gamil.com",55)

new_user.enroll().spend_points(50).display_info()

new_user2 = User("Stan", "Daman","SamDaman@gmail.com",105)
new_user3 = User("Jill", "Bladen","JokerJill@gmail.com",75)

new_user2.enroll().spend_points(80).display_info()

new_user3.display_info()