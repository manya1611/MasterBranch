package action_1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class InsertWord
{
	public static void main(String[] args) 
	{
	  System.setProperty("webdriver.chrome.driver","C:\\Selenium Data\\Browsers files\\chromedriver_win32\\chromedriver.exe");	
	  WebDriver driver=new ChromeDriver();
	  
	  driver.get("https://www.amazon.in/");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	  
	  WebElement text = driver.findElement(By.cssSelector("input#twotabsearchtextbox"));
	  
	  Actions act = new Actions (driver);
	  
	  act.moveToElement(text).click().keyDown(Keys.SHIFT).sendKeys("iphone").doubleClick();
	  act.build().perform();
	  
	  act.moveToElement(driver.findElement(By.cssSelector("input#nav-search-submit-button"))).click().build().perform();
	  
	JavascriptExecutor js =(JavascriptExecutor)driver;
    
	js.executeScript("window.scrollBy(0,500)");
	WebElement device=driver.findElement(By.xpath("(//span[@class='a-label a-checkbox-label'])[14]"));
	device.click();
    
	//Set<String> s1=driver.getWindowHandles();
	//System.out.println(s1);  
	
	List<String> windows= new ArrayList(driver.getWindowHandles());
	System.out.println(windows);
	}
}
