package loop.model;

import java.util.ArrayList;

public class Looper
{
	
	private ArrayList<String> graveNameList;
	
	public Looper()
	{
		graveNameList = new ArrayList<String>();
		
		fillTheNameList();
	}
	
	private void fillTheNameList()
	{
		graveNameList.add("Gunilla J. Kim");
		graveNameList.add("Nils Peter Kim");
		graveNameList.add("Katherine Proctor");
		graveNameList.add("Arthur Spencer");
		graveNameList.add("Samuel Spencer");
		graveNameList.add("Elizabeth Spencer");
		graveNameList.add("John Cushing");
	}
	
	public ArrayList<String> getGraveNameList()
	{
		return graveNameList;
	}
	public String loopTestOne()
	{
		String loopResult = "";
		int timesLooped = 0;
		
		for(int loopCounter = 0; loopCounter <10; loopCounter++)
		{
			loopResult += loopCounter + ", ";
			timesLooped++;
		}
		
		loopResult += "\nThe loop executed " + timesLooped + " times";
		
		return loopResult;
	}
	
	public String loopTestTwo()
	{
		String loopResult = "";
		int timesLooped = 0;
		int outerLoopTimes = 0;
		for(int hours = 0; hours < 24; hours++)
		{		
			for(int outerLoop = 0; outerLoop <60; outerLoop++)
			{
				for (int loopCounter = 0; loopCounter < 60; loopCounter++)
				{
					//loopResult += loopCounter + ", ";
					timesLooped++;
				}
				outerLoopTimes++;
			}
		}
			loopResult += "\nThe loop executed " + timesLooped + " times";
		
			return loopResult;
			
		
	}
	
	public String loopTestThree() //Money
	{
		String loopResult = "";
		int timesLooped = 0;
		int outerLoopTimes = 0;
		for(int dollars = 0; dollars < 73; dollars++)
		{
			for(int quarters = 0; quarters < 4; quarters++)
			{		
				for(int nickel = 0; nickel <5; nickel++)
				{
					for (int penny = 0; penny < 5; penny++)
					{
						//loopResult += loopCounter + ", ";
						timesLooped++;
					}
					outerLoopTimes++;
				}
			}
		}
				loopResult += "\nThe loop executed " + timesLooped + " times";
		
				return loopResult;
	}
}
