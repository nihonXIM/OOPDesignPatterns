package com.jdpattern.ZBbuilder.car;

public class RedCarBuilder implements CarBuilder {
	private Car car;

    public RedCarBuilder() {
        car = new Car();
    }

    @Override
    public void buildView() {
    	car.setColor("Red");
    	car.setWheels(4);
    }

    @Override
    public Car getResult() {
        return car;
    }
}
