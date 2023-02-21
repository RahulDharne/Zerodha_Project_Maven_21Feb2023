package TestingCrssbrwse;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test; 

import io.github.bonigarcia.wdm.WebDriverManager;

 public class browsertesting {

	   	WebDriver driver;
	   	@BeforeMethod
	   	public void initbrowser() {
	   		WebDriverManager.chromedriver().setup();
	   		driver =  new ChromeDriver();
	   		  
	   	}
	   	@Test
	   	public void verifytitle() {
	   		  driver.get("https://www.google.com/");
	   		         String expectedtitled = "Google";
	   		          String Actualtitle = driver.getTitle();
	   		        Assert.assertEquals(Actualtitle, expectedtitled);
	   	}
	   	@AfterMethod
	   	public void logout() {
	   		  driver.quit();
	   	}
}