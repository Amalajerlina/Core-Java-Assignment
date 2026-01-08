package com.airfare.app;

	public class KingFisher implements Airfare {

	    private Integer hours;
	    private Double costPerHour;

	    // Default constructor
	    public KingFisher() {
	    }

	    // Parameterized constructor
	    public KingFisher(Integer hours, Double costPerHour) {
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
	        return hours * costPerHour * 4;
	    }
	}



