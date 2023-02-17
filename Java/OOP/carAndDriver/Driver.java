public class Driver extends Car {
    
    public Driver() {
        super();
    }
    public void driveCar() {
         if(isGameOver() == true) {
            System.exit(1);
         } else {
                this.setGasLevel(1);
                System.out.println("You are driving the car. Gas remaining: " + this.getGasLevel() + "/10");
        }
   }

    public void boostCar() {
        if(isGameOver() == true) {
            System.exit(1);
        } else {
        if(this.getGasLevel() > 3) {
            this.setGasLevel(3);
            System.out.println("You used the boosters. Gas remaining: " + this.getGasLevel()+ "/10");
          } else {
            System.out.println("You can't boost the car. Gas remaining: " + this.getGasLevel()+ "/10");
          }
        }
         
    }

    public void refuelCar() {
        if (this.getGasLevel() < 9) {
            this.setGasLevel(-2);
            System.out.println("You refueled the car. Gas remaining: " + this.getGasLevel()+ "/10");
        } else {
            System.out.println("You can't refuel the car. Gas remaining: " + this.getGasLevel()+ "/10");
        }

    }

    public Boolean isGameOver(){
        if (this.getGasLevel() < 1) { 
            System.out.println("Game Over! Your tank is empty!");
            return true;
        }
        return false;
    }
}