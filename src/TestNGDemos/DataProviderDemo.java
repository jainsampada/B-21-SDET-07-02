package TestNGDemos;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {
	String path;
@DataProvider(name="LoginTest")
public Object[][] Login()
{
	Object[][] arr=new Object[3][2];
	arr[0][0]="admin";
	arr[0][1]="ad";
	
	arr[1][0]="123";
	arr[1][1]="sds";
	
	arr[2][0]="jhds";
	arr[2][1]="xgg";
	
	return arr;
}
@Test(dataProvider="LoginTest")
public void CheckLogin(Object uname,Object pass)
{
//	System.out.println(uname);
//	System.out.println("--------------");
//	System.out.println(pass);
	path=System.getProperty("user.dir")+"//Driver//chromedriver.exe";
	System.setProperty("webdriver.chrome.driver", path);
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://opensource-demo.orangehrmlive.com/");
	driver.findElement(By.id("txtUsername")).sendKeys(uname.toString());
	driver.findElement(By.id("txtPassword")).sendKeys(pass.toString());
	driver.findElement(By.id("btnLogin")).click();
}
}
