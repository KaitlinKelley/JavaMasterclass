public class Bedroom {

    private String name;
    private BedroomWall wall1;
    private BedroomWall wall2;
    private BedroomWall wall3;
    private BedroomWall wall4;
    private Ceiling ceiling;
    private Bed bed;
    private Lamp lamp;

    public Bedroom(String name, BedroomWall wall1, BedroomWall wall2, BedroomWall wall3, BedroomWall wall4, Ceiling ceiling, Bed bed, Lamp lamp) {
        this.name = name;
        this.wall1 = wall1;
        this.wall2 = wall2;
        this.wall3 = wall3;
        this.wall4 = wall4;
        this.ceiling = ceiling;
        this.bed = bed;
        this.lamp = lamp;
    }

    public Lamp getLamp(){
        return lamp;
    }

    public void makeBed(){
        System.out.println("Bed is being made from Bedroom Class");
        bed.make();
    }
}
