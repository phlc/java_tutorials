public class SpeedCar4x4 extends SpeedCar{
  //state
  private boolean traction;

  //constructor
  public SpeedCar4x4(){
    super();
    traction = false;
  }

  //behavior
  public void setTraction(boolean traction){
    this.traction = traction;
  }

  public boolean getTraction(){
    return(this.traction);
  }

  public void printSpeedcar(){
    super.printSpeedcar();
    System.out.println("Traction: "+this.traction+".");
  }
}
