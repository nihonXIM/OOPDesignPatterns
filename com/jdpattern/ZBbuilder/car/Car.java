package com.retrain.jdpattern.ZBbuilder.car;

public class Car {

    private int wheels;
    private String color;

    public Car() {
    }

    @Override
	public String toString() {
		return "Car [wheels=" + wheels + ", color=" + color + "]";
	}

	public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
    	this.wheels = wheels;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
