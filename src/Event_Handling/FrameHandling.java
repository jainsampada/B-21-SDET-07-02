package Event_Handling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FrameHandling {
	String path;
	WebDriver driver;
	@Test
public void launch()
{
	path = System.getProperty("user.dir") + "//Driver//chromedriver.exe";

	// Giving path of Chrome Driver
	System.setProperty("webdriver.chrome.driver", path);
	driver = new ChromeDriver();
	driver.manage().window().maximize();

	// Open an application in Browser Window
	driver.get("http://182.76.176.205/hrm/login.php");
	
	//Login to HRM application with valid credentials
	driver.findElement(By.name("txtUserName")).sendKeys("admin");
	driver.findElement(By.name("txtPassword")).sendKeys("admin");
	driver.findElement(By.name("Submit")).submit();
	
	driver.switchTo().frame("rightMenu");
	driver.findElement(By.xpath("//*[@id=\"standardView\"]/table/tbody/tr[1]/td[1]/input")).click();
}
}
