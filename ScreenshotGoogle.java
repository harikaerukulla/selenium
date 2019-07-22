package artifactmavelproject.mavelproject;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
 
public class ScreenshotGoogle {
 
@Test
public void TestJavaS1(){
	System.setProperty("webdriver.chrome.driver","C:\\libraries\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
// call method
                        ScreenshotGoogle.captureScreenShot(driver);
 
// Maximize the window
                        driver.manage().window().maximize();
                        ScreenshotGoogle.captureScreenShot(driver);
 
// Pass the url
                        driver.get("http://www.google.com");
                  ScreenshotGoogle.captureScreenShot(driver);
 
  }
 
public static void captureScreenShot(WebDriver ldriver){
// Take screenshot and store as a file format             
 File src=((TakesScreenshot)ldriver).getScreenshotAs(OutputType.FILE);           
try {
// now copy the  screenshot to desired location using copyFile method
 
FileUtils.copyFile(src, new File("C:/selenium/"+System.currentTimeMillis()+".png"));                              } catch (IOException e)
 
{
  System.out.println(e.getMessage()) ;
 }
  }
 
}