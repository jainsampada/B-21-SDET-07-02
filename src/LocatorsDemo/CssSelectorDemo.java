package LocatorsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorDemo {
	public void Launch() {
		String path=System.getProperty("user.dir")+"//Driver//chromedriver.exe";
		
		//Giving path of Chrome Driver
		System.setProperty("webdriver.chrome.driver", path);
		
		//Initialize WebDriver Interface
		WebDriver driver=new ChromeDriver();
		
		//Maximize Browser Window size
		driver.manage().window().maximize();
		
		//Open an application in Browser Window
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		String text=driver.findElement(By.cssSelector("span.form-hint")).getText();
		System.out.println("Text is:"+text);
		
		driver.findElement(By.cssSelector("input#txtUsername")).sendKeys("Admin");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CssSelectorDemo oo=new CssSelectorDemo();
		oo.Launch();
	}

}
