package Waits;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Implicitwaitdemo {
	@Test
public void launch()
{
	System.setProperty("webdriver.chrome.driver", "D:\\Sampada\\Selenium_Softwares\\chromedriver_win32(1)\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	//Implicit Wait
	driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://opensource-demo.orangehrmlive.com/");
	//Locators - use to find the elements from web page
	//Locate element by Id
	driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	
	driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	
	driver.findElement(By.id("btnLogin")).click();
	driver.close();

}
}
