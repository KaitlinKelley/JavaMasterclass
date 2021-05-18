import java.util.ArrayList;

//EXAMPLE OF INNER CLASS
//Also an example of encapsulation: Gear can only be accessed from within Gearbox
public class Gearbox {
    private ArrayList<Gear> gears;
    private int maxGears;
    private int currentGear = 0;
    private boolean clutchIsIn;

    public Gearbox(int maxGears) {
        this.maxGears = maxGears;
        this.gears = new ArrayList<>();
        Gear neutral = new Gear(0,0.0);
        this.gears.add(neutral);

        for(int i = 0; i<maxGears; i++){
            addGear(i, i*5.3);
        }
    }

    public void operateClutch(boolean in){
        this.clutchIsIn = in;
    }

    public void addGear(int number, double ratio){
        if(number > 0 && number <= maxGears){
            this.gears.add(new Gear(number, ratio));
        }
    }

    public void changeGear(int newGear){
        if(newGear >= 0 && newGear < gears.size() && this.clutchIsIn){
            this.currentGear = newGear;
            System.out.println("Gear " + newGear + " selected");
        }else{
            System.out.println("Grrriiinddd");
            this.currentGear = 0;
        }
    }

    public double wheelSpeed(int revs){
        if(clutchIsIn){
            System.out.println("Scream!!");
            return 0.0;
        }
        return revs * gears.get(currentGear).getRatio();
    }


    //Gear has access to all fields and methods from Gearbox
    //Inner classes are often private
    private class Gear{
        private int gearNumber;
        private double ratio;

        public Gear(int gearNumber, double ratio) {
            this.gearNumber = gearNumber;
            this.ratio = ratio;
        }

        public double driveSpeed(int revs){
            return revs*this.ratio;
        }

        public double getRatio() {
            return ratio;
        }
    }

    public static void main(String[] args) {
        Gearbox mcLaren = new Gearbox(6);
        mcLaren.operateClutch(true);
        mcLaren.changeGear(1);
        mcLaren.operateClutch(false);
        System.out.println(mcLaren.wheelSpeed(1000));
        mcLaren.changeGear(2);
        System.out.println(mcLaren.wheelSpeed(3000));
        mcLaren.operateClutch(true);
        mcLaren.changeGear(3);
        mcLaren.operateClutch(false);
        System.out.println(mcLaren.wheelSpeed(6000));
        //Gear is a nested class, so to instantiate, use dot notation as below, and a Gearbox must be instantiated first
//        Gearbox.Gear first = mcLaren.new Gear(1, 12.3);
//        System.out.println(first.driveSpeed(1000));
    }
}
