package com.learnbycode.catsimulator.rules;

import com.learnbycode.catsimulator.model.Cat;

public class CatSimulatorRuleFactory {

	public  HappinessRules getHappinessRules(Cat cat) {
		if (cat.getName().equals("Spuddles")) {
			return new SpuddlesHappinessRules(cat);
		}else if(cat.getName().equals("Brittabot")) {
			return new BrittabotHappinessRules(cat);
		}else {
			System.out.println("Incorrect Input");
		}
		return null;
	}
}
