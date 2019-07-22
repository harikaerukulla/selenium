package artifactmavelproject.mavelproject;
import java.util.Iterator;		
import java.util.Set;		
import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
		

public class WindowHandle_Demo {				

    public static void main(String[] args) throws InterruptedException
    {	
    	System.setProperty("webdriver.chrome.driver","C:\\libraries\\chromedriver.exe");
    	WebDriver driver = new ChromeDriver();			
        		
        //Launching the site.				
            driver.get("http://qamagnus.jalatechnologies.com");			
        driver.manage().window().maximize();		
                		

        String MainWindow=driver.getWindowHandle();		
        		
        // To handle all new opened window.				
            Set<String> s1=driver.getWindowHandles();		
        Iterator<String> i1=s1.iterator();		
        		
        while(i1.hasNext())			
        {		
            String ChildWindow=i1.next();		
            		
            if(!MainWindow.equalsIgnoreCase(ChildWindow))			
            {    		
                 
                    // Switching to Child window
                    driver.switchTo().window(ChildWindow);	                                                                                                           
                    driver.findElement(By.id("UserName")).sendKeys("harika.erukulla@gmail.com");
                    driver.findElement(By.id("Password")).sendKeys("harika12819");
                    driver.findElement(By.id("btnLogin")).click();					
                                 
			// Closing the Child Window.
                        driver.close();		
            }		
        }		
        // Switching to Parent window i.e Main Window.
            driver.switchTo().window(MainWindow);				
    }
}		