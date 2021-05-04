public class Car extends Vehicle{

    private int doors;
    private int wheels;
    private int gears;
    private boolean isManual;

    private int currentGear;

    //Custom classes MUST be initialized with "new", for they have no default value


    public Car(String name, String size, int doors, int wheels, int gears, boolean isManual) {
        super(name, size);
        this.doors = doors;
        this.wheels = wheels;
        this.gears = gears;
        this.isManual = isManual;
        this.currentGear = 1;
    }

    public void changeGear(int gear){
        this.currentGear = gear;
        System.out.println("Car.setCurrentGear(): Changed to " + gear + " gear");
    }

    public void changeVelocity(int speed, int direction){
        System.out.println("Car.changeVelocity(): Velocity " + speed + ", direction " + direction);
        move(speed, direction);
    }

}
