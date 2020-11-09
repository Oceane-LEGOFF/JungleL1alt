package com.company;

public class Predator {
    private static int s_iMaxPredatorAge = 40;
    private int m_iAgeMax;
    private int m_iAge;

    private static int s_iMaxPredatorLifePoint = 120;
    private int m_iLifePointMax;
    private int m_iLifePoint;

    private Vision m_Vision;
    private Smellling m_Smelling;

    public Predator() {
        int age = 0;
        age += 1;
    }


    void hunt(Prey p_Prey) { }

    void move() { }

    void mate(Predator p_Predator) { }

    void eat(Plant plant) { }

    void drink(WaterSpot p_WaterSpot) { }


}