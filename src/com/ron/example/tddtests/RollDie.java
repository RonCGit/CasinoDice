package com.ron.example.tddtests;



public class RollDie {
	
	private int dieState = 0;
	

	public int getDieState() {
		int dieState = (int)(Math.random()*6+1);
		return dieState;
}
}