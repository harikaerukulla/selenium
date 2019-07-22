package artifactmavelproject.mavelproject;
//import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class Mousehover {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\libraries\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en.wikipedia.org/wiki/Main_Page");
	  Actions action=new Actions(driver);
	  WebElement main=driver.findElement(By.linkText("Geography"));
	  action.moveToElement(main);
	  try {
		  Thread.sleep(6000);
		  action.click().build().perform();
		  
	  }catch(Exception e){
		  System.out.println(e);
		  
	  }
	}

}
