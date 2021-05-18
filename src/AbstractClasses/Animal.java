package AbstractClasses;

public abstract class Animal {

    //can have member variables, constructor, as opposed to interface = methods only
    //Abstract classes canNOT be instantiated directly

    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    //Abstract methods, MUST be used in any class that inherits from Animal
    public abstract void eat();
    public abstract void breathe();


}
