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

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    public String startEngine(){
        return getClass().getSimpleName() + " :Engine started";
    }

    public String accelerate(){
        return getClass().getSimpleName() + " :Accelerating";
    }

    public String brake(){
        return getClass().getSimpleName() + " :Stopped";
    }
}

class Mitsubishi extends Car{

    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine(){
        return getClass().getSimpleName() + " :Engine started";
    }

    @Override
    public String accelerate(){
        return getClass().getSimpleName() + " :Accelerating";
    }

    @Override
    public String brake(){
        return getClass().getSimpleName() + " :Stopped";
    }
}

class Ford extends Car {

    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine(){
        return getClass().getSimpleName() + " :Engine started";
    }

    @Override
    public String accelerate(){
        return getClass().getSimpleName() + " :Accelerating";
    }

    @Override
    public String brake(){
        return getClass().getSimpleName() + " :Stopped";
    }
}

class Holden extends Car{

    public Holden(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine(){
        return getClass().getSimpleName() + " :Engine started";
    }

    @Override
    public String accelerate(){
        return getClass().getSimpleName() + " :Accelerating";
    }

    @Override
    public String brake(){
        return getClass().getSimpleName() + " :Stopped";
    }






    public static void main(String[] args) {
        Car car = new Car(8, "Car");
        car.startEngine();
        car.accelerate();
        car.brake();

        Mitsubishi mitsubishi = new Mitsubishi(8, "Car");
        mitsubishi.startEngine();
        mitsubishi.accelerate();
        mitsubishi.brake();

        Ford ford = new Ford(8, "Car");
        ford.startEngine();
        ford.accelerate();
        ford.brake();

        Holden holden = new Holden(8, "Car");
        holden.startEngine();
        holden.accelerate();
        holden.brake();
    }
}

