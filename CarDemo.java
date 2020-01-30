public class CarDemo{
  //main
  public static void main (String[] args){
    //declarations
    SpeedCar car1 = new SpeedCar();
    SpeedCar4x4 car2 = new SpeedCar4x4();

    car1.printSpeedcar();
    car2.printSpeedcar();

    car1.changeGear(5);
    car1.setSpeed(100.0);
    car1.setTurbo(true);

    car2.changeGear(4);
    car2.setSpeed(60.0);
    car2.setTurbo(true);
    car2.setTraction(true);

    car1.printSpeedcar();
    car2.printSpeedcar();

  }
}
