package TestNGDemos;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginDemo extends LaunchDriver {
	
	WebElement text;
	
	
	@BeforeClass
	public void beforeclass()
	{
		System.out.println("Before Class");
	}
	@Test(groups= {"Smoke"})//(priority=1)
	public void login() throws InterruptedException
	{
		
		//Locators - use to find the elements from web page
		//Locate element by Id
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(5000);
	//	driver.close();
		
	}
	@Test(groups= {"Sanity"})//(priority=0)
	public void Forget_pass() throws InterruptedException
	{
		driver.findElement(By.linkText("Forgot your password?")).click();
		text=driver.findElement(By.xpath("//h1[contains(text(),'Forgot Your Password?')]"));
		if(text.isDisplayed()) {
			System.out.println("Forget Password page is available");
		}
		else
		{
			System.out.println("Forget Password page is not available");
		}
		Thread.sleep(5000);
		driver.navigate().back();
	}
	@Test(groups= {"Smoke"})//dependsOnMethods="login",)(priority=2)
	public void Logout() throws InterruptedException
	{
		driver.findElement(By.partialLinkText("Welcome")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@href='/index.php/auth/logout']")).click();

	}
	@AfterClass
	public void AfterClass()
	{
		System.out.println("After Class");
	}
}
