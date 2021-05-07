//Illustration of Polymorphism

public class Movie {

    private String name;

    public Movie(String name) {
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public String plot(){
        return "No plot here";
    }

    public static void main(String[] args) {
        for(int i = 1; i<11; i++){
            Movie movie = randomMovie();
            System.out.println("Movie #" + i + " : " + movie.getName() + "\n" + "Plot: " + movie.plot() + "\n");
        }
    }

    public static Movie randomMovie(){
        int random = (int) (Math.random() * 5) + 1;
        System.out.println("Random int was: " + random);
        switch(random){
            case 1:
                return new Jaws();
            case 2:
                return new IndependenceDay();
            case 3:
                return new MazeRunner();
            case 4:
                return new StarWars();
            case 5:
                return new ForgettableMovie();
        }
        return null;
    }
}

class Jaws extends Movie{

    public Jaws(){
        super("Jaws");
    }

    @Override
    public String plot(){
        return "Shark stuff.";
    }
}

class IndependenceDay extends Movie{

    public IndependenceDay(){
        super("Independence Day");
    }

    @Override
    public String plot(){
        return "Aliens and stuff.";
    }
}

class MazeRunner extends Movie{

    public MazeRunner(){
        super("Maze Runner");
    }

    @Override
    public String plot(){
        return "Running in mazes and stuff.";
    }
}

class StarWars extends Movie{

    public StarWars(){
        super("Star Wars");
    }

    @Override
    public String plot(){
        return "Insert plot of A New Hope here.";
    }
}

class ForgettableMovie extends Movie{

    public ForgettableMovie(){
        super("Forgettable");
    }
}

