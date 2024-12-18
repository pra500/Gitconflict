package pac1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class AutoSuggestionTest {
	
		WebDriver driver;
		
		
	@Test
	public void pickdateTest()
	{	
				
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);		
		driver.get("https://practicetestautomation.com/practice-test-login/");		
		driver.findElement(By.xpath("//a[normalize-space()='Practice']")).click();		
		System.out.println(driver.getTitle());	
		
		
		
		System.out.println(driver.getTitle());	
		
		
		
		driver.close();		
	}
	
	
	
	
	
		
	 
	  
	  
  

}
