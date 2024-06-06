package com.retrain.jdpattern.ZBbuilder.car;

public class BlueCarBuilder implements CarBuilder {
	private Car car;
	
	public BlueCarBuilder(){
		car = new Car();
	}

	@Override
	public void buildView() {
		// TODO Auto-generated method stub
		car.setWheels(6);
		car.setColor("Blue");
	}

	@Override
	public Car getResult() {
		// TODO Auto-generated method stub
		return car;
	}

}
