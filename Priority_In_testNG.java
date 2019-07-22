package artifactmavelproject.mavelproject;
import org.openqa.selenium.By;			
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;			
import org.testng.annotations.Test;			

public class Priority_In_testNG {		
    WebDriver driver;					
    @Test (priority=1)		
    public void openBrowser() {	
    	System.setProperty("webdriver.chrome.driver","C:\\libraries\\chromedriver.exe");
    	 driver = new ChromeDriver();
        				
    }				
    @Test (priority=2)		
    public void launchGoogle() {				
        driver.get("http://www.google.co.in");						
    }	
    @Test (priority=3)		
    public void peformSeachAndClick1stLink() {				
        driver.findElement(By.xpath(".//*[@title='Search']")).sendKeys("facebook");								
    }					
    @Test (priority=4)		
    public void FaceBookPageTitleVerification() throws Exception {				
        driver.findElement(By.xpath(".//*[@value='Search']")).click();						
        Thread.sleep(3000);		
        Assert.assertEquals(driver.getTitle().contains("facebook - Google Search"), true);				
    }		
}	