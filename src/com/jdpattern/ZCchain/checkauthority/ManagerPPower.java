package com.jdpattern.ZCchain.checkauthority;

public class ManagerPPower extends PurchasePower {

	@Override
	protected double getAllowable() {
		// TODO Auto-generated method stub
		return BASE * 10;
	}

	@Override
	protected String getRole() {
		// TODO Auto-generated method stub
		return "Manager";
	}
	
}
