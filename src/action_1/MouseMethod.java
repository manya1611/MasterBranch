package action_1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMethod 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Selenium Data\\Browsers files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/hovers");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement hover1=driver.findElement(By.xpath("(//img[@alt='User Avatar'])[1]"));
	
		Actions act=new Actions(driver);
		
		act.moveToElement(hover1).build().perform();
		Thread.sleep(3000);
		
		//WebElement hover2=driver.findElement(By.xpath("(//img[@alt='User Avatar'])[2]"));
		act.moveToElement(driver.findElement(By.xpath("(//img[@alt='User Avatar'])[2]"))).build().perform();
		
		Thread.sleep(3000);
		
		WebElement hover3=driver.findElement(By.xpath("(//img[@alt='User Avatar'])[3]"));
		act.moveToElement(hover3).build().perform();
		
		//driver.close();
		
		
		
	}

}
