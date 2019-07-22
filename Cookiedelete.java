package artifactmavelproject.mavelproject;
import java.util.Set;
import java.util.concurrent.TimeUnit;

//import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
public class Cookiedelete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\libraries\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		Set<Cookie> cookies=driver.manage().getCookies();
		
			System.out.println("count of cookies"+cookies.size());
			for(Cookie cook:cookies) {
				System.out.println("name"+cook.getName());
				System.out.println("domain"+cook.getDomain());
				System.out.println("path"+cook.getPath());
				System.out.println("value"+cook.getValue());
			}
			driver.manage().deleteAllCookies();
			Set<Cookie> cookies1=driver.manage().getCookies();
			System.out.println("count of cookies1"  +cookies1.size());
	}

}
