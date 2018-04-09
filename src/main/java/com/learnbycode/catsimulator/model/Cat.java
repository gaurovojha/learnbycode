package com.learnbycode.catsimulator.model;

public class Cat {

	private boolean hungry;
	private boolean bored;
	private boolean isAwake;
	private int turns;
	private int points;
	private int hungerCounter;
	private int boredomCounter;
	private String name;
	
	
	//*******************GETTERS AND SETTERS*********************
	public boolean isHungry() {
		return hungry;
	}
	public void setHungry(boolean hungry) {
		this.hungry = hungry;
	}
	public boolean isBored() {
		return bored;
	}
	public void setBored(boolean bored) {
		this.bored = bored;
	}
	public int getPoints() {
		return points;
	}
	public void setPoints(int points) {
		this.points = points;
	}
	public int getHungerCounter() {
		return hungerCounter;
	}
	public void setHungerCounter(int hungerCounter) {
		this.hungerCounter = hungerCounter;
	}
	public int getBoredomCounter() {
		return boredomCounter;
	}
	public void setBoredomCounter(int boredomCounter) {
		this.boredomCounter = boredomCounter;
	}
	public boolean isAwake() {
		return isAwake;
	}
	public void setAwake(boolean isAwake) {
		this.isAwake = isAwake;
	}
	public int getTurns() {
		return turns;
	}
	public void setTurns(int turns) {
		this.turns = turns;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
