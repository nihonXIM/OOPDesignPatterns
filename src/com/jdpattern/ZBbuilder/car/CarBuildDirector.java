package com.jdpattern.ZBbuilder.car;
class CarBuildDirector {
	
	private CarBuilder builder;

	public CarBuildDirector(CarBuilder builder) {
		this.builder = builder;
	}

    public Car construct() {
        builder.buildView();
        return builder.getResult();
    }

    public static void main(String[] args) {
        CarBuilder builder = new RedCarBuilder();
        CarBuildDirector carBuildDirector = new CarBuildDirector(builder);
        System.out.println(carBuildDirector.construct());
        builder = new BlueCarBuilder();
        carBuildDirector = new CarBuildDirector(builder);
        System.out.println(carBuildDirector.construct());
    }
    
    
}
