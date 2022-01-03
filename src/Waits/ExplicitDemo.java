package Waits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitDemo {
public void launch()
{
	System.setProperty("webdriver.chrome.driver", "D:\\Sampada\\Selenium_Softwares\\chromedriver_win32(1)\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	WebDriverWait wait=new WebDriverWait(driver, 5);
	driver.manage().window().maximize();
	driver.get("https://opensource-demo.orangehrmlive.com/");
	//Locators - use to find the elements from web page
	//Locate element by Id
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("txtUsername"))).sendKeys("Admin");;
	//driver.findElement().sendKeys("Admin");
	
	driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	
	driver.findElement(By.id("btnLogin")).click();
	driver.close();

}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
