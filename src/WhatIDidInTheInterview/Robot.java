package WhatIDidInTheInterview;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Robot {
	public static void main(String[] args) {
		String robotDirection = "North";
		List<String> directionsList = new ArrayList<>();
		String directions = "R";
		directionsList.add(directions);
		robotDirection = Robot.loopThroughList(directionsList, robotDirection);
		System.out.println("The direction is: " + robotDirection);
	}
	
	public static String loopThroughList(List<String> list, String robotDirection) {
		Iterator<String> iterator = list.iterator();
		while (iterator.hasNext()) {
			String tempDirection = iterator.next();
			if (tempDirection == "R") {
				robotDirection = TurnRight(robotDirection);
			} else if
					(tempDirection == "L") {
				robotDirection = TurnLeft(robotDirection);
			}
		}
		return robotDirection;
	}
	
	public static String TurnRight(String robotDirection) {
		
		switch (robotDirection) {
			case "North":
				robotDirection = "East";
				break;
			case "East":
				robotDirection = "South";
				break;
			case "South":
				robotDirection = "West";
				break;
			case "West":
				robotDirection = "North";
				break;
			
		}
		
		return robotDirection;
	}
	
	public static String TurnLeft(String robotDirection) {
		switch (robotDirection) {
			case "North":
				robotDirection = "West";
				break;
			case "West":
				robotDirection = "South";
				break;
			case "South":
				robotDirection = "East";
				break;
			case "East":
				robotDirection = "North";
				break;
			
		}
		return robotDirection;
	}
}
