package com.qamindslab.petsimulator.data;

public class Creature {

	private String name;
	private int age;
	private int healthPoints;
	private double weight;
	private int strength;
	private int expPoints;
	private int level;
	private int foodLevel;
	private int waterLevel;
	private int friendship;
	private int happiness;
	private boolean dead;
	private int sicknessLevel;
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return this.age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	public int getHealthPoints() {
		return this.healthPoints;
	}
	
	public void sethealthPoints(int healthPoints) {
		this.healthPoints = healthPoints;
	}
	public double getWeight() {
		return this.weight;
	}
	
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public int getStrength() {
		return this.strength;
	}
	
	public void setStrength(int strength) {
		this.strength = strength;
	}
	public int getExpPoints() {
		return this.expPoints;
	}
	
	public void setExpPoints(int expPoints) {
		this.expPoints = expPoints;
	}
	public int getLevel() {
		return this.level;
	}
	
	public void setLevel(int level) {
		this.level = level;
	}
	public int getFoodLevel() {
		return this.foodlevel;
	}
	
	public void setFoodLevel(int foodlevel) {
		this.foodlevel = foodlevel;
	}
	public int getWaterlevel() {
		return this.waterlevel;
	}
	
	public void setWaterLevel(int waterLevel) {
		this.waterlevel = waterlevel;
	}
	public int getFriendship() {
		return this.friendship;
	}
	
	public void setFriendship(int friendship) {
		this.friendship = friendship;
	}
	public int getHappiness() {
		return this.happiness;
	}
	
	public void setHappiness(int happiness) {
		this.happiness = happiness;
	}
	public boolean isDead() {
		return this.dead;
	}
	
	public void setDead(boolean dead) {
		this.dead = dead;
	}
	public int getSicknessLevel() {
		return this.sicknessLevel;
	}
	
	public void setSicknessLevel(int sicknessLevel) {
		this.sicknessLevel = sicknessLevel;
	}
}