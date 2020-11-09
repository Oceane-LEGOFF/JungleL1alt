package com.company;

public class Predator {
    private int AgeNow;
    private int AgeMax;
    private static final int AgeAll = 40;

    private int NbLifePointsNow;
    private int NbLifePointsMax;
    private static final int NbLifePointsAll = 120;

    private Smellling smellling;
    private Vision vision;
    

    public void hunt(Prey prey) { }

    public void move() { }

    public void mate(Predator predator) { }

    public void eat(Prey prey) { }

    public void drink(WaterSpot waterSpot) { }
}