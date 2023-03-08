public class Gorilla extends Mammal {
    public Gorilla(int energyLevel){
        super(energyLevel);
    }
        
    public void throwSomething(){
        System.out.println("The Gorrilla has thrown something...ew!");
        this.setEnergyLevel(5);
    }

    public void eatBanas(){
        System.out.println("The Gorrilla has eaten a banana, and is very happy!");
        this.setEnergyLevel(-10);
    
    }

    public void climb(){
        System.out.println("The Gorrilla has climbed a tree!");
        this.setEnergyLevel(10);
    }
}
