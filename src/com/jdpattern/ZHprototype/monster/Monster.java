package com.jdpattern.ZHprototype.monster;

public class Monster implements Prototype {
	private int minDamage;
	private int maxDamage;
	private String nameColor;
	
	public Monster(){
	}

	public Monster(Monster monster){
		minDamage = monster.minDamage;
		maxDamage = monster.maxDamage;
		nameColor = monster.nameColor;
	}

	public void setMinDamage(int minDamage){
		this.minDamage = minDamage;

	}

	public void setMaxDamage(int maxDamage){
		this.maxDamage = maxDamage;
	}

	public void setNameColor(String nameColor){
		this.nameColor = nameColor;
	}

	@Override
	public Prototype Clone() {
		return new Monster(this);
	}


}
