package TestNGDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Mutithreading {
	String path;
@Test(threadPoolSize=8,invocationCount=6,timeOut=1000)
public void TestCase1()
{
	//System.out.println("Test case 1--"+Thread.currentThread().getId());
	path=System.getProperty("user.dir")+"//Driver//chromedriver.exe";
	System.setProperty("webdriver.chrome.driver", path);
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://opensource-demo.orangehrmlive.com/");
	driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	driver.findElement(By.id("btnLogin")).click();
}
}
