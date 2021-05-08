package PolymorphismChallenge;

public class DeluxeBurger extends Hamburger{

    public DeluxeBurger(String name, String meat, double price, String breadRollType) {
        super(name, meat, price, breadRollType);
    }

    public DeluxeBurger(){
        super("Deluxe", "Double Bacon", 14.54, "Brioche");
        super.addHamburgerAddition1("Chips", 2.75);
        super.addHamburgerAddition2("Drink", 1.81);
    }

    @Override
    public void addHamburgerAddition1(String name, double price){
        System.out.println("Cannot add additional items to this.");
    }

    @Override
    public void addHamburgerAddition2(String name, double price){
        System.out.println("Cannot add additional items to this.");
    }

    @Override
    public void addHamburgerAddition3(String name, double price){
        System.out.println("Cannot add additional items to this.");
    }

    @Override
    public void addHamburgerAddition4(String name, double price){
        System.out.println("Cannot add additional items to this.");
    }

    @Override
    public double itemizeHamburger(){
        return super.itemizeHamburger();
    }
}