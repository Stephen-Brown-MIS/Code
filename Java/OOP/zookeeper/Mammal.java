public class Mammal{
    protected int energyLevel;

    public Mammal(int energyLevel) {
        this.energyLevel = energyLevel;    

    }

    //Getter for the energy level
    public  int getEnergyLevel(){
        return this.energyLevel;
    } 

    //Setter for the energy level
    public void setEnergyLevel(int energyExpended) {
        this.energyLevel = this.energyLevel - energyExpended;
        System.out.println("Energy: " + this.energyLevel);
    }   

}