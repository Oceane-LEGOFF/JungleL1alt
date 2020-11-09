package com.company;

public class Prey {
    private int AgeNow;
    private int AgeMax;
    private static final int AgeAll = 30;

    private int NbLifePointsNow;
    private int NbLifePointsMax;
    private static final int NbLifePointsAll = 70;

    private Smellling smellling;
    private Vision vision;

    void moveToFeed(Plant plant) { }

    void eat(Plant plant) { }

    void drink(WaterSpot waterSpot) { }

    void flee(Predator predator) { }

    void mate(Prey prey) { }
}
