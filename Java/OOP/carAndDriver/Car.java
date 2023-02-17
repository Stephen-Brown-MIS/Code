public class Car{
    private int gasLevel = 10;

    // Constructor
    public Car(){

    }
    // Getter
    public int getGasLevel() {
        return gasLevel;
    }
    // Setter
    public void setGasLevel(int amount) {
        this.gasLevel =  this.gasLevel - amount;
     }
}


