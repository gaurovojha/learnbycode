package com.learnbycode.catsimulator.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.learnbycode.catsimulator.model.Brittabot;
import com.learnbycode.catsimulator.model.Cat;
import com.learnbycode.catsimulator.model.Spuddles;
import com.learnbycode.catsimulator.rules.CatSimulatorRuleFactory;
import com.learnbycode.catsimulator.service.CatHappinessSimulatorService;

public class CatHappinessSimulatorController {

	Spuddles spuddles = null;
	Brittabot brittabot = null;
	CatHappinessSimulatorService catService = null;
	CatSimulatorRuleFactory catFactory = null;
	List<Cat> cats =null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CatHappinessSimulatorController controller = new CatHappinessSimulatorController();
		controller.initialize();
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("*************Choose Action**************");
			System.out.println("0 -feed Spuddles");
			System.out.println("1 -play with Spuddles");
			System.out.println("2 -feed Brittabot");
			System.out.println("3 -play with Brittabot");
			System.out.println("4 -no action");
			System.out.println("5 -exit (quit the program)");
			int action = sc.nextInt();
			controller.doAction(action);
		}
	}

	public void doAction(int action) {

		switch (action) {
		case 0:
			this.catService.performAction(this.spuddles, "feed");
			this.catService.showResult(cats);
			break;
		case 1:
			this.catService.performAction(this.spuddles, "play");
			this.catService.showResult(cats);
			break;
		case 2:
			this.catService.performAction(this.brittabot, "feed");
			this.catService.showResult(cats);
			break;
		case 3:
			this.catService.performAction(this.brittabot, "play");
			this.catService.showResult(cats);
			break;
		case 4:
			this.catService.performAction(null, "noAction");
			this.catService.showResult(cats);
			break;
		case 5:
			System.out.println("BBYEEEE................Happy Coding!!!!!");
			System.exit(1);
			break;
		default:
			System.out.println("You need to provide an input mate!!");
		}
	}

	private void initialize() {
		spuddles = new Spuddles("Spuddles");
		brittabot = new Brittabot("Brittabot");
		cats = new ArrayList<Cat>();
		cats.add(spuddles);
		cats.add(brittabot);
		catFactory = new CatSimulatorRuleFactory();
		catService = new CatHappinessSimulatorService(catFactory);
	}

}
