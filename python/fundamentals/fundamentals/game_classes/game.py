from game_classes.barbarian import Barbarian
from game_classes.knight import Knight
import random

# declare the instances
barb = Barbarian("Conan")
knight = Knight("Arthur")

while barb.health > 0 and knight.health > 0:
    print("You are the mighty Barbarian, approach a Knight")
    response = ""
    
    while not response == "1" and not response == "2":
        response = input("What do? \n 1)attack \n 2) REALLY ATTACK \n >>>>")
        
        if response == "1":
            barb.attack(knight)
        elif response == "2":
            barb.berserker_rage(knight)
        else:
            print(">>>> please choose a valid option")
        
        # CPU respond
        dice_roll = random.randint(1,2) # integer
        if dice_roll == 1:
            knight.attack(barb)
        else:
            knight.heal()

# endgame
if barb.health > 0:
    print("Congratulations, you Won!")
elif knight.health <= 0:
    print("double KO")
else:
    print("the Knight Won")