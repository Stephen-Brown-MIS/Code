from game_classes.human import Human

class Barbarian(Human):
    def __init__(self, name):
        super().__init__()
        self.name = name
        self.strength += 20
        self.health += 30
        self.defense -= 5
        
    def berserker_rage(self, target):
        self.agility -= 1
        target.defend(self.strength*2)
        self.defend(self.strength)
        print(f"[RAGE] {self.name} swings wildly, harming everyone")
        print(f"[RAGE] {target.name} now has {target.health} HP")
        print(f"[RAGE] {self.name} now has {self.health} HP")