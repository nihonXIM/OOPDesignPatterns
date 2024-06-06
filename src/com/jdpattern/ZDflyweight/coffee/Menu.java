package com.jdpattern.ZDflyweight.coffee;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Menu {
	  private Map<String, CoffeeFlavour> flavours = new ConcurrentHashMap<String, CoffeeFlavour>();

	  CoffeeFlavour lookup(String flavorName) {
	    if (!flavours.containsKey(flavorName))
	      flavours.put(flavorName, new CoffeeFlavour(flavorName));
	    return flavours.get(flavorName);
	  }

	  int totalCoffeeFlavoursMade() {
	    return flavours.size();
	  }
}
