public class Bat extends Mammal {
    
    public Bat(int energyLevel){    
        super(energyLevel);
        
    }
        
    public void eatHumans(){
        System.out.println("The Giant Bat has eaten a human...burp!");
        this.setEnergyLevel(-25);
    }

    public void fly(){
        System.out.println("The Giant Bat takes to the air! Flappy-mcflappy wings!");
        this.setEnergyLevel(50);
    
    }

    public void attackTown(){
        System.out.println("Argh! The Giant Bat has attacked a town!");
        this.setEnergyLevel(100);
    }
}
