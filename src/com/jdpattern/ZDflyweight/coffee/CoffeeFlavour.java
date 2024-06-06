package com.jdpattern.ZDflyweight.coffee;

public class CoffeeFlavour {
	  private final String name;
	
	  CoffeeFlavour(String newFlavor) {
	    this.name = newFlavor;
	  }
	
	  @Override
	  public String toString() {
	    return name;
	  }
}
