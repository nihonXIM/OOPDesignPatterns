package com.jdpattern.Bobserver.weather;

public interface Observer {
	public void update(float temp, float humidity, float pressure);
}
