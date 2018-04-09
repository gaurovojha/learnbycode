package com.learnbycode.catsimulator.service;

import java.util.List;

import com.learnbycode.catsimulator.model.Cat;
import com.learnbycode.catsimulator.rules.CatSimulatorRuleFactory;

public class CatHappinessSimulatorService {

	CatSimulatorRuleFactory catFactory = null;

	public CatHappinessSimulatorService(CatSimulatorRuleFactory catFactory) {
		this.catFactory = catFactory;
	}

	// contains business logic and executes cat happiness rules
	public void performAction(Cat cat, String actionType) {

		if ("feed".equals(actionType)) {
			catFactory.getHappinessRules(cat).feedCat();
		} else if ("play".equals(actionType)) {
			catFactory.getHappinessRules(cat).playWithCat();
		}
	}

	public void showResult(List<Cat> cats) {
		for (Cat cat : cats) {
			System.out.println("********************" + cat.getName() + "********************");
			System.out.println("Turn No : " + cat.getTurns() + "	Happiness Score : " + cat.getPoints() + "	Status :"
					+ cat.isAwake() );
			System.out.println("====================================================");
		}
	}

}
