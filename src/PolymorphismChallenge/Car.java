package PolymorphismChallenge;

public class Car {

    private boolean engine;
    private int cylinders;
    private int wheels;
    private String name;

    public Car(int cylinders, String name) {
        this.engine = true;
        this.cylinders = cylinders;
        this.wheels = 4;
        this.name = name;
    }

    public boolean hasEngine() {
        return engine;
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getWheels() {
        return wheels;
    }

    public String getName() {
        return name;
    }

    public void startEngine(){
        System.out.println("Started engine");
    }

    public void accelerate(){
        System.out.println("Accelerating...");
    }

    public void brake(){
        System.out.println("Stopped");
    }
}

class Honda extends Car{

    public Honda(int cylinders, String name) {
        super(cylinders, name);
    }

    public void startEngine(){
        System.out.println(this.getName() + ": Started engine");
    }

    public void accelerate(){
        System.out.println(this.getName() + ": Accelerating...");
    }

    public void brake(){
        System.out.println(this.getName() + ": Stopped");
    }
}

class Ford extends Car{

    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }

    public void startEngine(){
        System.out.println("The ford has started its engine");
    }

    public void accelerate(){
        System.out.println("Ford is accelerating...");
    }






    public static void main(String[] args) {
        Honda brian = new Honda(6, "Brian");
        Ford ford = new Ford(8, "Truck");
        brian.startEngine();
        brian.accelerate();
        brian.brake();
        ford.startEngine();
        ford.accelerate();
        ford.brake();
    }
}

