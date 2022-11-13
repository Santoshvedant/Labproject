package swagTestClass;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;


public class TestBaseClass
{

	WebDriver driver;
	Logger log=Logger.getLogger("swagLabsDemoProject");
	
	@Parameters("BrowserName")
	
	@BeforeMethod
	
	public void setupmethod(String BrowserName)
	{
		if(BrowserName.equals("chrome"))
		{
	System.setProperty("webdriver.chrome.driver","C:\\chrome driver\\chromedriver.exe" );
		
	driver=new ChromeDriver();
	//driver.get("https://www.saucedemo.com/");
	
		}
		else
		{
			System.setProperty ("webdriver.gecko.driver","C:\\Downloads\\geckodriver-v0.31.0-win64\\geckodriver.exe");
			
			
		 driver =  new FirefoxDriver();
		// driver.get("https://www.saucedemo.com/");
		}
		PropertyConfigurator.configure("Log4j.properties");
	driver.get("https://www.saucedemo.com/");
	driver.manage().window().maximize();
	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
	WebElement user=driver.findElement(By.xpath("//input[@id='user-name']"));
	user.sendKeys("standard_user");
	log.info("username enter");
	WebElement pass=driver.findElement(By.xpath("//input[@id='password']"));
	pass.sendKeys("secret_sauce");
	log.info("password");
	WebElement login =driver.findElement(By.xpath("//input[@id='login-button']"));
		login.click();
		log.info("click");
	
	}
	@AfterMethod
	public void teardown()
	{

		
		driver.close();
		log.info("browser close");
	}
		
	
	
	
}
