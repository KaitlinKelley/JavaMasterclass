package Generics;

import java.util.ArrayList;
import java.util.Collections;

public class League <T extends Team>{

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
        Team<FootballPlayer> hawthorne = new Team<>("Hawthron");
        Team<FootballPlayer> fremantle = new Team<>("Fremantle");

        footballLeague.addTeam(adelaideCrows);
        footballLeague.addTeam(melbourne);
        footballLeague.addTeam(hawthorne);
        footballLeague.addTeam(fremantle);
    }
}
