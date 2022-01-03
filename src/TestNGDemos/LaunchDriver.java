package TestNGDemos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeSuite;

public class LaunchDriver {
	public static WebDriver driver;
	public static String path;
	@BeforeGroups(groups= {"Smoke"})
	public void acc()
	{
		System.out.println("Before Groups");
	}
	@AfterGroups(groups= {"Sanity"})
	public void acca()
	{
		System.out.println("After Groups");
	}
	@BeforeSuite(groups= {"Smoke","Sanity"})
	public void launch() {
		path = System.getProperty("user.dir") + "//Driver//chromedriver.exe";

		// Giving path of Chrome Driver
		System.setProperty("webdriver.chrome.driver", path);
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		// Open an application in Browser Window
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}
	@AfterSuite(groups= {"Smoke","Sanity"})
	public void close_Browser()
	{
		driver.close();
	}
}
