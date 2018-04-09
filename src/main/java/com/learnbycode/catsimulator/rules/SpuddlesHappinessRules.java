package com.learnbycode.catsimulator.rules;

import com.learnbycode.catsimulator.model.Cat;

public class SpuddlesHappinessRules implements HappinessRules {

	private Cat cat;

	public SpuddlesHappinessRules(Cat cat){
		this.cat = cat;
	}

	public void feedCat() {
		// TODO Auto-generated method stub
		if (cat.getHungerCounter() <= 5) {
			cat.setPoints(cat.getPoints() + 3);
		} else {
			cat.setHungerCounter(0);
			cat.setPoints(cat.getPoints() - 2);
		}
	}

	public void playWithCat() {
		// TODO Auto-generated method stub
		if (cat.getBoredomCounter() <= 3) {
			cat.setPoints(cat.getPoints() + 7);
		} else {
			cat.setBoredomCounter(0);
			cat.setPoints(cat.getPoints() - 2);
		}

	}

}
