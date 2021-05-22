package Generics;
import java.util.ArrayList;
import java.util.Collections;

public class League <T extends Team>{

    //Type Parameters:
//    E - Element
//    K - Key
    //T - Type
    //V - Value
    //S, U, V, etc. - 2nd, 3rd, 4th types


    private String name;

    private ArrayList<T> league = new ArrayList<>();

    public League(String name){
        this.name = name;
    }

    public boolean addTeam(T team){
        if(league.contains(team)){
            System.out.println("Team is already in the league");
            return false;
        }
        league.add(team);
        System.out.println("Team added to league");
        return true;
    }

    public void showLeagueTable(){
        Collections.sort(league);
        for(T t : league){
            System.out.println(t.getName() + ": " + t.ranking());
        }
    }

    public static void main(String[] args) {
        League<Team<FootballPlayer>> footballLeague = new League<>("AFL");
        Team<FootballPlayer> adelaideCrows = new Team<>("Adelaide Crows");
        Team<FootballPlayer> melbourne = new Team<>("Melbourne");
        Team<FootballPlayer> hawthorne = new Team<>("Hawthorn");
        Team<FootballPlayer> fremantle = new Team<>("Fremantle");

        footballLeague.addTeam(adelaideCrows);
        footballLeague.addTeam(melbourne);
        footballLeague.addTeam(hawthorne);
        footballLeague.addTeam(fremantle);
    }
}
