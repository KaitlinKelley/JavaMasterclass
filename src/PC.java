public class PC {

    //example of Composition
    //composition is a design technique in which your class can have an instance of another class as a field of your class. Inheritance is a mechanism under which one object can acquire the properties and behavior of the parent object by extending a class
    //indicates a "has a" relationship
    private Case theCase;
    private Monitor monitor;
    private Motherboard motherboard;

    public PC(Case theCase, Monitor monitor, Motherboard motherboard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    public void powerUp(){
        theCase.pressPowerButton();
        drawLogo();
    }

    private void drawLogo(){
        //graphics of some kind
        monitor.drawPixelAt(1200, 50, "yellow");
    }



    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20, 20, 5);
        Case case1 = new Case("220B", "Dell", "240", dimensions);
        Monitor monitor1 = new Monitor("27inch Beast", "Acer", 27, new Resolution(2540, 1440));
        Motherboard motherboard1 = new Motherboard("BJ-200", "Asus", 4, 6, "v2.44");

        PC PC1 = new PC(case1, monitor1, motherboard1);

        PC1.powerUp();
    }

}
