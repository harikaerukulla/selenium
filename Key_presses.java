package artifactmavelproject.mavelproject;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class Key_presses {
	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver","C:\\libraries\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://the-internet.herokuapp.com/key_presses");
	  Actions action=new Actions(driver);
		action.sendKeys(Keys.SPACE).build().perform();
        //driver.findElement(By.id("content")).sendKeys(Keys.SPACE).build().perform();
        String text=driver.findElement(By.id("result")).getText();
        System.out.println(text);
        Assert.assertEquals(text,"You entered:SPACE");
        
        
	
	
	}
	
		
}
