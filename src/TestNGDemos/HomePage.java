package TestNGDemos;


import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class HomePage extends LaunchDriver {
	WebElement title;
	@BeforeClass
	public void beforeclass()
	{
		System.out.println("Before Class Home Page");
	}
	@Test(groups= {"Smoke"})
	public void Check_HomePage() {
		
		title = driver.findElement(By.xpath("//*[@id=\"menu_admin_viewAdminModule\"]/b"));
		if (title.isDisplayed()) {
			System.out.println("Home page is displayed");
		} else {
			System.out.println("Home Page is not displayed");
		}
	}
	@AfterClass
	public void AfterClass()
	{
		System.out.println("After Class Home Page");
	}
}
