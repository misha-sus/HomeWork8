package com.company;

public class Goods {
    private String nameCarrier;
    private String nameFlight;
    private double maxWeight;

    public Goods(String nameCarrier, String nameFlight, double maxWeight) {
        this.nameCarrier = nameCarrier;
        this.nameFlight = nameFlight;
        this.maxWeight = maxWeight;
    }

    public String getNameCarrier() {
        return nameCarrier;
    }

    public void setNameCarrier(String nameCarrier) {
        this.nameCarrier = nameCarrier;
    }

    public String getNameFlight() {
        return nameFlight;
    }

    public void setNameFlight(String nameFlight) {
        this.nameFlight = nameFlight;
    }

    public double getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(double maxWeight) {
        this.maxWeight = maxWeight;
    }

    @Override
    public String toString() {
        return String.format("Авиаперевозчик %s, класс -%s ,вес багажа - %s" ,nameCarrier,nameFlight,maxWeight);
    }

}
