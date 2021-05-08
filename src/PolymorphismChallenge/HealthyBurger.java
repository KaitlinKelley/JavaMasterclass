package PolymorphismChallenge;

public class HealthyBurger extends Hamburger{

    private String healthyExtra1Name;
    private double healthyExtra1Price;
    private String healthyExtra2Name;
    private double healthyExtra2Price;
    private int healthyExtraCount;

    public HealthyBurger(String meat, double price) {
        super("Healthy Burger", meat, price, "Wheat");
        this.healthyExtraCount = 0;
    }

    public void addHealthyAddition1(String name, double price){
        if(healthyExtraCount < 2){
            this.healthyExtra1Name = name;
            this.healthyExtra1Price = price;
            this.healthyExtraCount++;
            System.out.println("Added " + name + " for an extra " + price);
        }else{
            System.out.println("Cannot add any more healthy extras");
        }
    }

    public void addHealthyAddition2(String name, double price){
        if(healthyExtraCount < 2){
            this.healthyExtra2Name = name;
            this.healthyExtra2Price = price;
            this.healthyExtraCount++;
            System.out.println("Added " + name + " for an extra " + price);
        }else{
            System.out.println("Cannot add any more healthy extras");
        }
    }

    @Override
    public double itemizeHamburger(){
        double totalPrice = super.itemizeHamburger();
        if(this.healthyExtra1Name != null){
            totalPrice += this.healthyExtra1Price;
        }
        if(this.healthyExtra2Name != null){
            totalPrice += this.healthyExtra2Price;
        }
        return totalPrice;
    }
}
