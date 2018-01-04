package FixedSolution;

import java.util.Scanner;

public class Runner {
	public static void main(String[] args) {
		System.out.println("Enter the list of directions:");
		Scanner scanner = new Scanner(System.in);
		Robot robot = new Robot();
		scanner.nextLine().chars().filter(Character::isAlphabetic).mapToObj(c -> (char) c).forEach(robot::setDirection);
		System.out.println(robot.getDirection());
		scanner.close();
		
	}
}
