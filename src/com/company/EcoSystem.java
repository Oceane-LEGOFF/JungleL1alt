package com.company;

public class EcoSystem {
    private int m_iWidth;
    private int m_iHeight;

    private WaterSpot m_WaterSpot;

    public EcoSystem() {
        m_iHeight =30;
        m_iWidth = 120;
        m_WaterSpot = new WaterSpot(500,
                                    m_iHeight/4,
                                    m_iHeight/4);
    }
}
