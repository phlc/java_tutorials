public class SpeedCar implements Car{

  //state
  private int gear;
  private double speed;
  private boolean turbo;

  //constructor
  public SpeedCar(){
    gear = 1;
    speed = 0.0;
    turbo = false;
  }

  //behavior
  public void changeGear (int gear){
    this.gear = gear;
  }

  public void setSpeed (double speed){
    this.speed = speed;
  }

  public int getGear(){
    return (this.gear);
  }

  public double getSpeed(){
    return (this.speed);
  }

  public void setTurbo(boolean turbo){
    this.turbo = turbo;
  }

  public void printSpeedcar(){
    System.out.println("Gear: "+this.gear+". Speed: "+this.speed+". Turbo: "+this.turbo+".");
  }
}
