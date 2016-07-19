package com.company;

/**
 * Created by Fawzan on 7/5/16.
 */
public class Person {

    private int legs;
    private int eyes;
    private int hands;
    private int id;

    public static int count = 0;

    public Person() {

        this.eyes = 2;
        this.legs = 2;
        this.hands = 2;

        count = count + 1;
        this.id = count;

    }

    public Person(int legs, int eyes, int hands) {
        this.legs = legs;
        this.eyes = eyes;
        this.hands = hands;

        count = count + 1;
        this.id = count;


    }

    public int getId() {
        return id;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public int getEyes() {
        return eyes;
    }

    public void setEyes(int eyes) {
        this.eyes = eyes;
    }

    public int getHands() {
        return hands;
    }

    public void setHands(int hands) {
        this.hands = hands;
    }

    public static int getCount() {
        return count;
    }
}
