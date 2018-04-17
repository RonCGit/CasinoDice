package com.ron.example.tddtests;

import java.util.ArrayList;
import java.util.List;



public class RollDie {
	
	private int dieState = 0;
	

	public int getDieState() {
		int dieState = (int)(Math.random()*6+1);
		return dieState;
}
	public ArrayList<Integer> getDiesStates() {
		ArrayList<Integer> myList = new ArrayList<Integer>();
		myList.add((int)(Math.random()*6+1));
		myList.add((int)(Math.random()*6+1));
		myList.add((int)(Math.random()*6+1));
		return myList;
		
	}
	
	public void readList() {
		ArrayList<Integer> aList = this.getDiesStates();
		for (int x=0;x<aList.size();x++){
			System.out.println("value: " + aList.get(x));
		}
		
	}
}