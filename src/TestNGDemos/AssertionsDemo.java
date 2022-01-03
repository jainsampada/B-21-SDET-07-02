package TestNGDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;



public class AssertionsDemo {
	String path;
	WebDriver driver;
	String expectedTitle="OrngeHRM",actualTitle;
@Test
public void Launch()
{
	SoftAssert ast=new SoftAssert();
	path = System.getProperty("user.dir") + "//Driver//chromedriver.exe";

	// Giving path of Chrome Driver
	System.setProperty("webdriver.chrome.driver", path);
	driver = new ChromeDriver();
	driver.manage().window().maximize();

	// Open an application in Browser Window
	driver.get("https://opensource-demo.orangehrmlive.com/");
	actualTitle=driver.getTitle();
	
	//Hard Assertion
	//Assert.assertEquals(actualTitle, expectedTitle);
	
	//Soft Assertion
	ast.assertEquals(actualTitle, expectedTitle);
	
	driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	
	driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	
	driver.findElement(By.id("btnLogin")).click();
	ast.assertAll();
}
}
