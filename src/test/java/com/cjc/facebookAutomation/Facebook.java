package com.cjc.facebookAutomation;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Facebook<Webdriver> {
	public WebDriver driver;
	
	@Test
	public void enter_valid_Details() {
	WebElement name=driver.findElement(By.cssSelector("input[name=firstname]"));
	name.sendKeys("Priya");
	WebElement surname=driver.findElement(By.cssSelector("input#u_0_l"));
	surname.sendKeys("Meshram");
	WebElement mobileno=driver.findElement(By.cssSelector("input[name=reg_email__]"));
	mobileno.sendKeys("7249425944");
	WebElement password=driver.findElement(By.cssSelector("input[name=reg_passwd__]"));
	password.sendKeys("priya@123");
	WebElement date=driver.findElement(By.xpath("//select[@name='birthday_day']"))	;
	Select s=new Select(date);
	s.selectByIndex(18);
	WebElement month=driver.findElement(By.cssSelector("select[id^='month']"));
	Select s1=new Select(month);
	s1.selectByValue("10");
	WebElement year=driver.findElement(By.cssSelector("select[id^='year']"));
	Select s2=new Select(year);
	s2.selectByValue("1993");
	driver.findElement(By.xpath("//input[@name='sex']")).click();
		
	}
	
	
	
	@BeforeClass
	public void delete_all_cookies() {
		
		driver.manage().deleteAllCookies();
	}
	
	
	
	
	@BeforeTest
	public void enter_appliaction_url() {
		
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
	}
	
	
	
	
	
	@BeforeSuite
	public void Open_Browser() {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\PARESHAN\\Desktop\\Selenium\\chromedriver_win32(1)\\chromedriver.exe");
driver=new ChromeDriver();
		
	}
	
	

}
