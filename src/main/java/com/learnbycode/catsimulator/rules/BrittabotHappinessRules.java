package com.learnbycode.catsimulator.rules;

import com.learnbycode.catsimulator.model.Cat;

public class BrittabotHappinessRules implements HappinessRules{
	
	private Cat cat ;
	
	public BrittabotHappinessRules(Cat cat){
		this.cat = cat;
	}

	public void feedCat() {
		// TODO Auto-generated method stub
		cat.setTurns(cat.getTurns()+1);
		
		if(cat.getHungerCounter()<=3) {
			cat.setPoints(cat.getPoints()+5);
		}else {
			cat.setHungerCounter(0);
			cat.setPoints(cat.getPoints()-1);
		}
	}

	public void playWithCat() {
		// TODO Auto-generated method stub
		if(cat.getBoredomCounter()<=3) {
			cat.setPoints(cat.getPoints()+5);
		}else {
			cat.setBoredomCounter(0);
			cat.setPoints(cat.getPoints()-1);
		}
		
	}

}
