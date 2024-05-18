package VariousConcepts;


import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnLogin {
	
	WebDriver driver;
	int a;
	private By USER_NAME_FIELD;
	private Object USER_NAME_ELEMENT;
	
	@Before
	public void init() {
		a = 5;
		System.setProperty("webdriver.chrome.driver","driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://codefios.com/ebilling/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		
		
	}
 @Test
	public void testLogin() throws InterruptedException{
	   //type name =  value
	   //Element list-WebElement
	 WebElement USER_NAME_ELEMENT = driver.findElement(By.xpath("//*[@id=\"user_name\"]"));
	 WebElement PASSWORD_ELEMENT = driver.findElement(By.xpath("//*[@id=\"user_name\"]"));
     WebElement SIGNIN_BUTTON_ELEMENT = driver.findElement(By.xpath("//*[@id=\"user_name\"]"));
     WebElement DASHBOARD_HEADER_ELEMENT = driver.findElement(By.xpath("//strong[text()='Dashboard']"));
     //Element list-by type
     By USER_NAME_FIELD = By.xpath("//*[@id=\"user_name\"]");
     By PASSWORD_FIELD = By.xpath("//*[@id=\"password\"]");
     By SIGNIN_BUTTON_FIELD = By.xpath("//*[@id=\"login_submit\"]");


	 driver.findElement(By.xpath("//*[@id=\"user_name\"]")).sendKeys("demo@codefios.com");
	 driver.findElement(USER_NAME_FIELD).sendKeys("demo@codefios.com");
	 USER_NAME_ELEMENT.sendKeys("ghjkiuyn");
	 Thread.sleep(2000);
	 USER_NAME_ELEMENT.sendKeys("demo@codefios.com");
	 PASSWORD_ELEMENT.sendKeys("abc123");
	 SIGNIN_BUTTON_ELEMENT.click();
	 WebElement DASHBOARD_HEADER_ELEMENT1= driver.findElement(By.xpath("//strong[text()='Dashboard']"));
	 Assert.assertTrue("Dashboard page not found!!",DASHBOARD_HEADER_ELEMENT.isDisplayed());
	}
	

	}


