package Doubts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String path=System.getProperty("user.dir")+"//Driver//chromedriver.exe";
	    System.setProperty("webdriver.chrome.driver", path);
	    WebDriver driver = new ChromeDriver();

	    driver.get("http://the-internet.herokuapp.com/frames");
	    driver.findElement(By.linkText("Nested Frames")).click();
	    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	    driver.switchTo().frame("frame-top");
	    Thread.sleep(5000);
	   String str= driver.findElement(By.id("/html/body")).getText();
	    System.out.println(str);
	    
	}

}
