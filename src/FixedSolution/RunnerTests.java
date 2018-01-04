package FixedSolution;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RunnerTests {
	private Robot robot;
	
	@Before
	public void InitializeTheRobot() {
		robot = new Robot();
	}
	
	
	@Test
	public void GivenFourDirectionsTurnTheRobotAccurately() {
		String directions = "RLRL";
		directions.chars().filter(Character::isAlphabetic).mapToObj(c -> (char) c).forEach(robot::setDirection);
		String result = robot.getDirection();
		String expected = "north";
		Assert.assertEquals(expected.toLowerCase(), result.toLowerCase());
	}
	
	@Test
	public void GivenRandomLettersValidateInputAndTurnRobot() {
		String directions = "asdas,das,das,d,asd,asdasdasRDRDSSRSDdsr,rLRLRLLLLL";
		directions.chars().filter(Character::isAlphabetic).mapToObj(c -> (char) c).forEach(robot::setDirection);
		String result = robot.getDirection();
		String expected = "north";
		Assert.assertEquals(expected.toLowerCase(), result.toLowerCase());
	}
	
	
}
