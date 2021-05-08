package PolymorphismChallenge;

public class Hamburger {

    private String name;
    private String meat;
    private double price;
    private String breadRollType;

    private String addition1Name;
    private double addition1Price;
    private String addition2Name;
    private double addition2Price;
    private String addition3Name;
    private double addition3Price;
    private String addition4Name;
    private double addition4Price;

    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
        System.out.println(this.name + " hamburger on a " + this.breadRollType + " roll with " + this.meat + ", price is " + this.price);
    }

    public Hamburger(String meat, double price){
        this.meat = meat;
        this.price = price;
    }

    public Hamburger(){}

    public void addHamburgerAddition1(String name, double price){
        this.addition1Name = name;
        this.addition1Price = price;
        System.out.println("Added " + name + " for an extra " + price);
    }

    public void addHamburgerAddition2(String name, double price){
        this.addition2Name = name;
        this.addition2Price = price;
        System.out.println("Added " + name + " for an extra " + price);
    }

    public void addHamburgerAddition3(String name, double price){
        this.addition3Name = name;
        this.addition3Price = price;
        System.out.println("Added " + name + " for an extra " + price);
    }

    public void addHamburgerAddition4(String name, double price){
        this.addition4Name = name;
        this.addition4Price = price;
        System.out.println("Added " + name + " for an extra " + price);
    }

    public double itemizeHamburger(){
        double totalPrice = this.price;
        if(this.addition1Name != null){
            totalPrice += this.addition1Price;
        }
        if(this.addition2Name != null){
            totalPrice += this.addition2Price;
        }
        if(this.addition3Name != null){
            totalPrice += this.addition3Price;
        }
        if(this.addition4Name != null){
            totalPrice += this.addition4Price;
        }
        return totalPrice;
    }


    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("Basic", "Beef", 3.56, "White");
        hamburger.addHamburgerAddition1("Tomato", 0.27);
        hamburger.addHamburgerAddition2("Lettuce", 0.75);
        hamburger.addHamburgerAddition3("Cheese", 1.13);
        System.out.println("Total burger price is " + hamburger.itemizeHamburger());

        HealthyBurger healthyBurger = new HealthyBurger("Turkey bacon", 5.67);
        healthyBurger.addHamburgerAddition1("Egg", 5.43);
        healthyBurger.addHealthyAddition1("Lentils", 3.41);
        System.out.println("Total Healthy Burger price is " + healthyBurger.itemizeHamburger());

        DeluxeBurger db = new DeluxeBurger();
        db.addHamburgerAddition3("Lettuce", 0.30);
        System.out.println("Total Deluxe Burger price is " + db.itemizeHamburger());
    }
}



