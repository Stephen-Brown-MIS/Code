from game_classes.human import Human
print(Human)

class Knight(Human):
    def __init__(self, name):
        super().__init__() # call my parent
        self.name = name
        self.health = 110
        self.strength += 10 # 20
        self.mana -= 3
        self.defense += 5
    
    def heal(self):
        self.health += self.mana
        print(f"[KNIGHT] {self.name} heals for {self.mana} and now has {self.health} HP ")
