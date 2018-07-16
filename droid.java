class Droid {

  int batteryLevel;

  public Droid(){
    batteryLevel = 100;
  }; //constructs droid

  public void activate() { //method for activating droid

    System.out.println("Droid activated.  How can I help you?");

    batteryLevel = batteryLevel - 5;
    System.out.println("Battery level is: " + batteryLevel + " percent.");
  }

  public void chargeBattery(int hours){ //method for charging droid
    System.out.println("Droid charging...");

    batteryLevel = batteryLevel + hours;

    if (batteryLevel > 100){
      batteryLevel = 100;
    System.out.println("Battery level is: " + batteryLevel + " percent.");
      }
  	else {
      System.out.println("Battery level is: " + batteryLevel + " percent.");
      }
  }
  public int checkBatteryLevel() { //method for checking battery level
    System.out.println("Battery level is: " + batteryLevel + " percent.");
    return batteryLevel;
  }



    public void hover(int feet) {
      if (feet > 2){
        System.out.println("Error!  I cannot hover above 2 feet.");
      }
      else {
        System.out.println("Hovering...");
        batteryLevel = batteryLevel - 20;
           System.out.println("Battery level is: " + batteryLevel + " percent.");
      }


  }
public static void main(String[] args) {
  Droid newDroid = new Droid();
  newDroid.activate();
  newDroid.chargeBattery(5);
  newDroid.hover(1);

}

}