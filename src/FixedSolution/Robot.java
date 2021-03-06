package FixedSolution;

public class Robot {
	private int direction;
	
	public String getDirection() {
		while (direction > 360 || direction < 0) {
			direction = direction > 360 ? direction - 360 : direction + 360;
		}
		switch (direction) {
			case 0:
				return "north";
			case 90:
				return "east";
			case 180:
				return "south";
			case 270:
				return "west";
			case 360:
				return "north";
			default:
				return null;
			
		}
	}
	
	public void setDirection(Character directionChar) {
		directionChar = Character.toLowerCase(directionChar);
		if (directionChar.equals('r')) {
			this.direction += 90;
		} else if (directionChar.equals('l')) {
			this.direction -= 90;
		}
	}
}
