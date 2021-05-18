package AbstractClasses;

public class Penguin extends Bird{
    public Penguin(String name) {
        super(name);
    }

    @Override
    public void fly() {
        super.fly();
        System.out.println("Uh oh..." + getName() + " cannot fly!!");
    }

    public static void main(String[] args) {
        Penguin penguin = new Penguin("Gentoo");
        penguin.fly();
    }
}
