package artifactmavelproject.mavelproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertionsselenium {
	@Test
	public void testCaseVerifyHomePage() {
		System.setProperty("webdriver.chrome.driver","C:\\libraries\\chromedriver.exe");
		WebDriver k=new ChromeDriver();
		k.navigate().to("http://google.com");
		Assert.assertEquals("Google", k.getTitle());
		Assert.assertEquals("Gooogle",k.getTitle(), "Strings are not matching");
		//Write a code to login and write a method called isUserLoggedInSuccessfully and isUserLoggedOut which returns boolean.
		
		}
	}
