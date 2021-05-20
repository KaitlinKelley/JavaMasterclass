package Generics;

import java.util.ArrayList;

//This class will now accept any object that is a Player type, or a subclass of Player
//T can also use interfaces(can extend only one class, but can use multiple interfaces)
public class Team<T extends Player> implements Comparable<Team<T>> {

    private String name;
    int played = 0;
    int won = 0;
    int tied = 0;
    int lost = 0;

    //T - Type
    private ArrayList<T> members = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean addPlayer(T player){
        if (members.contains(player)){
            System.out.println(player.getName() + " is already on the team.");
            return false;
        }else{
            members.add(player);
            System.out.println(player.getName() + " was added.");
            return true;
        }
    }

    public int numPlayers(){
        return this.members.size();
    }

    //The T in this case makes sure that only teams of the same type can play each other
    public void matchResult(Team<T> opponent, int ourScore, int theirScore){
        String message;
        //saving results for our team
        if(ourScore > theirScore){
            won++;
            message = " beat ";
        }else if(ourScore == theirScore){
            tied++;
            message = " tied with ";
        }else{
            lost++;
            message = " lost to ";
        }
        played++;
        //saving results for opponent as well, while avoiding infinite loop
        if(opponent != null){
            System.out.println(this.getName() + message + opponent.getName());
            opponent.matchResult(null, theirScore, ourScore);
        }
    }

    public int ranking(){
        return (won*2) + tied;
    }

    @Override
    //Can only compare teams of the same type
    public int compareTo(Team<T> team) {
        if(this.ranking() > team.ranking()){
            return -1;
        }else if(this.ranking() < team.ranking()){
            return 1;
        }
        return 0;
    }

    public static void main(String[] args) {
        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer beckham = new SoccerPlayer("Beckham");

//        Team adelaideCrows = new Team("Adelaide Crows");
//        adelaideCrows.addPlayer(joe);
//        adelaideCrows.addPlayer(pat);
//        adelaideCrows.addPlayer(beckham);
//
//        System.out.println(adelaideCrows.numPlayers());

        Team<FootballPlayer> adelaideCrows = new Team<>("Adelaide Crows");
        //This team will now only accept Football Players
        adelaideCrows.addPlayer(joe);
//        adelaideCrows.addPlayer(pat);
//        adelaideCrows.addPlayer(beckham);

        Team<BaseballPlayer> baseballTeam = new Team<>("Chicago Cubs");
        baseballTeam.addPlayer(pat);

        Team<SoccerPlayer> soccerTeam = new Team<>("Some name");
        soccerTeam.addPlayer(beckham);
    }


}
