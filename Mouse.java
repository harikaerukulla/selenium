package artifactmavelproject.mavelproject;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\libraries\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");
	  Actions action=new Actions(driver);
	driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	driver.switchTo().frame(0);
	WebElement drag=driver.findElement(By.id("draggable"));
	WebElement drop=driver.findElement(By.id("droppable"));
	//action.contextClick(drag);
	//action.doubleClick(drag);

	 //Thread.sleep(4000);
	 //action.dragAndDrop(drag,drop).perform();
	action.clickAndHold(drag).moveToElement(drop).release(drag).build().perform();
	 //Thread.sleep(4000);
	 //action.dragAndDrop(drag,drop).perform();
	 Thread.sleep(4000);
	 driver.quit();
	 
	}

}
