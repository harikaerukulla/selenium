package artifactmavelproject.mavelproject;

import org.testng.annotations.Test;

public class TestBelongsToSingleGroup {
	@Test(groups = {"sanity-group"})
    public void testOne()
    {
        System.out.println("This test belongs to Sanity group");
    }
     
    @Test
    public void testTwo()
    {
        System.out.println("This test NOT belongs to any group");
    }
     
    @Test(groups = {"sanity-group"})
    public void testThree()
    {
        System.out.println("This test belongs to Sanity group");
    }
}

