package com.example.game;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Player implements ISaveable {

    private String name;
    private int hitPoints;
    private int strength;
    private String weapon;

    public Player(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
        this.weapon = "Sword";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", hitPoints=" + hitPoints +
                ", strength=" + strength +
                ", weapon='" + weapon + '\'' +
                '}';
    }

    @Override
    public List<String> write() {
        List<String> values = new ArrayList<>();
        values.add(0, this.name);
        values.add(1, "" + this.hitPoints);
        values.add(2, "" + this.strength);
        values.add(3, this.weapon);

        return values;
    }

    @Override
    public void read(List<String> values) {
        if(values != null && values.size() > 0){
            this.name = values.get(0);
            this.hitPoints = Integer.parseInt(values.get(1));
            this.strength = Integer.parseInt(values.get(2));
            this.weapon = values.get(3);
        }
    }

    public static ArrayList<String> readValues(){
        ArrayList<String> values = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.println("Choose:");
        System.out.println("1 to enter a string");
        System.out.println("0 to quit");

        while(!quit){
            System.out.println("Choose an option:");
            int choice = sc.nextInt();
            sc.nextLine();
            switch(choice){
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.println("Enter a string:");
                    String input = sc.nextLine();
                    values.add(index, input);
                    index++;
                    break;
            }
        }
        return values;
    }

    //will accept any object that implements ISaveable
    public static void saveObject(ISaveable objectToSave){
        for (int i= 0; i<objectToSave.write().size(); i++){
            System.out.println("Saving " + objectToSave.write().get(i) + " to storage device.");

        }
    }

    //will accept any object that implements ISaveable
    public static void loadObject(ISaveable objectToLoad){
        ArrayList<String> values = readValues();
        objectToLoad.read(values);
    }

    public static void main(String[] args) {
        Player tim = new Player("Tim", 10, 15);
        System.out.println(tim.toString());
        saveObject(tim);

        tim.setHitPoints(8);
        System.out.println(tim);
        tim.setWeapon("Stormbringer");
        saveObject(tim);
        System.out.println(tim);

        Monster werewolf = new Monster("Werewolf", 20, 40);

        //Could also do this! Makes it more generic. But if you want to access methods like getStrength(), you must first cast it to Monster**
//        ISaveable werewolf = new Monster("Werewolf", 20, 40);

        System.out.println(werewolf);
        saveObject(werewolf);
    }
}
