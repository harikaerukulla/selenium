package artifactmavelproject.mavelproject;

import org.apache.log4j.Logger;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Loggerdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Logger 	logger=Logger.getLogger("log demo");
		PropertyConfigurator.configure("Log4j.properties");
		System.setProperty("webdriver.chrome.driver","C:\\libraries\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		logger.info("chrome opened");
        
        // Alert Message handling
                    		
        driver.get("http://qamagnus.jalatechnologies.com");			
        logger.info("app opened");                   		
     	      	
        driver.findElement(By.id("UserName")).sendKeys("harika.erukulla@gmail.com");
        driver.findElement(By.id("Password")).sendKeys("harika12819");
        driver.findElement(By.id("btnLogin")).click();			
        logger.info("click on login");		
        // Switching to Alert        
        Alert alert = driver.switchTo().alert();		
        		
        // Capturing alert message.    
        String alertMessage= driver.switchTo().alert().getText();		
        logger.info("capture the alert");	
        // Displaying alert message		
        System.out.println(alertMessage);	
       
        		
        // Accepting alert		
        alert.accept();		
        logger.info("accept alert");
    }	

	}

