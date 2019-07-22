package artifactmavelproject.mavelproject;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionsInTestNG {
	@Test
	public void test()
	{
		Assert.assertTrue(true);
		
	}
	@Test
	public void test1()
	{
		Assert.assertTrue(true);
	}
	@Test
	public void test2()
	{
		Assert.assertEquals("Test","Test1");
	}
	@Test
	public void test3()
	{
		Assert.assertEquals("Test","Test2");
	}
	@Test
	public void test4()
	{
		Assert.assertTrue(false,"not matching the expected condition");
	}
	@Test
	public void test5()
	{
		Assert.assertFalse(false,"this is expected condition");
	}
	@Test
	public void test6()
	{
		Assert.assertNotEquals("Test","Test1");
	}
	
}
