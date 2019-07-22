package artifactmavelproject.mavelproject;

import org.testng.annotations.Test;

public class TestMultipleTimes {
	@Test(invocationCount=3)
	public void test() {
		System.out.println("harika");
	}
}
