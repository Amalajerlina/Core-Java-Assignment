package com.airfare.app;

public class Indigo implements Airfare {

    private Integer hours;
    private Double costPerHour;

    // Default constructor
    public Indigo() {
    }

    // Parameterized constructor
    public Indigo(Integer hours, Double costPerHour) {
        this.hours = hours;
        this.costPerHour = costPerHour;
    }

    // Getters and Setters
    public Integer getHours() {
        return hours;
    }

    public void setHours(Integer hours) {
        this.hours = hours;
    }

    public Double getCostPerHour() {
        return costPerHour;
    }

    public void setCostPerHour(Double costPerHour) {
        this.costPerHour = costPerHour;
    }

    // Interface method implementation
    @Override
    public Double calculateAmount() {
        return hours * costPerHour * 8;
    }
}
