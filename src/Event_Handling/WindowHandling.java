package Event_Handling;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WindowHandling {
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
	driver.get("https://the-internet.herokuapp.com/windows");
	//Click on Click here link
	driver.findElement(By.linkText("Click Here")).click();
	
	//1. Extract window handles
	Set<String> id=driver.getWindowHandles();
	//System.out.println(id);
	
	//Defining Iterator for this set of Window handles
	Iterator<String> it=id.iterator();
	String parent_id=it.next();//Parent window handle
	
	String child_win=it.next();
	System.out.println("Parent Window Id is:"+parent_id);
	System.out.println("Child window id is:"+child_win);
	
	//Switching to the respective window using window handle
	driver.switchTo().window(child_win);
	System.out.println(driver.getTitle());
	
	driver.switchTo().window(parent_id);
	System.out.println(driver.getTitle());
	
	driver.close();
	

}
}
