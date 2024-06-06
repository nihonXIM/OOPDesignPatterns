package com.retrain.jdpattern.ZHprototype.monster;

public class MonsterRegenManager {
	private Monster normalMonPrototype;
	private Monster magicMonPrototype;

	public MonsterRegenManager(){
		//default monster prototype
		normalMonPrototype = new Monster();
		normalMonPrototype.setMinDamage(0);
		normalMonPrototype.setMaxDamage(100);
		normalMonPrototype.setNameColor("white");


		//magic monster prototype
		magicMonPrototype = new Monster();
		magicMonPrototype.setMinDamage(10);
		magicMonPrototype.setMaxDamage(120);
		magicMonPrototype.setNameColor("blue");
	}


	public Monster getMonster(String type){
		if(type.equals("magic")){
			return ((Monster)magicMonPrototype.Clone());
		}
		else if(type.equals("normal")){
			return ((Monster)normalMonPrototype.Clone());
		}
		else{
			return null;
		}

	}
}
