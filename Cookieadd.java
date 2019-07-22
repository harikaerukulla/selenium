package artifactmavelproject.mavelproject;
import java.util.Set;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
public class Cookieadd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\libraries\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		Cookie cookie=new Cookie("customcookie","12345");
		driver.manage().addCookie(cookie);
		Set<Cookie> cookies=driver.manage().getCookies();
		for(Cookie cook:cookies) {
			System.out.println(cook);
			
		}
		
	}

}
