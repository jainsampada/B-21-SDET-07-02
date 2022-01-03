package LocatorsDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathDemo {
	String text;
public void Launch() throws InterruptedException
{
	//Setting path of chrome Driver exe
	String path=System.getProperty("user.dir")+"//Driver//chromedriver.exe";
	
	//Giving path of Chrome Driver
	System.setProperty("webdriver.chrome.driver", path);
	
	//Initialize WebDriver Interface
	WebDriver driver=new ChromeDriver();
	
	//Maximize Browser Window size
	driver.manage().window().maximize();
	
	//Open an application in Browser Window
	//driver.get("https://opensource-demo.orangehrmlive.com/");
	driver.get("https://money.rediff.com/gainers/bse/daily/groupa");
	//Provide Xptah of Username text field
	//driver.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys("Admin");
	
	//Provide Xptah of Password text field
	//driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin123");
	
	
	//Provide Xpath by using contains method
	//driver.findElement(By.xpath("//input[contains(@type,'pass')]")).sendKeys("admin123");
	
	//Provide Xptah of Login Button
	//driver.findElement(By.xpath("//input[@id='btnLogin']")).submit();
	
	//Provide Xpath by using text method
	//String text=driver.findElement(By.xpath("//span[contains(text(),'Password')]")).getText();
//	System.out.println(text);
	
	//Provide Xpath by using AND operator
	//String text= driver.findElement(By.xpath("//*[contains(text(),'Password') and @class='form-hint']")).getText();
	//System.out.println(text);
	
	//Provide Xpath by using or operator
		//String text= driver.findElement(By.xpath("//*[contains(text(),'Password') or @class='frm-hint']")).getText();
		//System.out.println(text);
	
	//Using starts-with method in xpath
	//driver.findElement(By.xpath("//input[starts-with(@id,'txtUs')]")).sendKeys("Admin");
	//Thread.sleep(5000);
	//=//label[starts-with(@id,'message')]
	//<span>Welcome</span>
	//span[contains(text(),'Welcome')]
	
	//Advance Xpaths
	//Self
	 text=driver.findElement(By.xpath("//a[contains(text(),'Bharat Petroleum')]/self::a")).getText();
	System.out.println(text);
	//a[contains(text(),'Spicejet Ltd.')]/self::a
	
	//Parent
	String str=driver.findElement(By.xpath("//a[contains(text(),'Bharat Petroleum')]/parent::td")).getText();
	System.out.println(str);
	
	//Child
	List<WebElement> li=driver.findElements(By.xpath("//a[contains(text(),'Bharat Petroleum')]/ancestor::tr/child::td"));
	System.out.println(li.size());
	//Lambda Expression
	li.forEach(name -> {
	    System.out.println(name.getText());
	});
	
	//Ancestor
	text=driver.findElement(By.xpath("//a[contains(text(),'Bharat Petroleum')]/ancestor::tr")).getText();
	System.out.println("Ancestor nodes---"+text);
	
	//Descendent
	List<WebElement>linew=driver.findElements(By.xpath("//a[contains(text(),'Bharat Petroleum')]/ancestor::tr/descendant::td"));
	System.out.println(linew.size());
	//Lambda Expression
	linew.forEach(name -> {
	    System.out.println("Descendent nodes are:"+name.getText());
	});
	
	//following
	List<WebElement> lifollowing=driver.findElements(By.xpath("//a[contains(text(),'Bharat Petroleum')]/ancestor::tr/following::tr"));
	System.out.println("Following nodes size is:"+lifollowing.size());
	lifollowing.forEach(name -> {
	    System.out.println("Following nodes are:"+name.getText());
	});
	
	//following-sibling
	List<WebElement> lifolsib=driver.findElements(By.xpath("//a[contains(text(),'Bharat Petroleum')]/ancestor::tr/following-sibling::tr"));
	System.out.println("Following Sibling Size is:"+lifolsib.size());
	lifolsib.forEach(name -> {
	    System.out.println("Following sibling nodes are:"+name.getText());
	});
	
	//preceding
	List<WebElement> lipre=driver.findElements(By.xpath("//a[contains(text(),'Bharat Petroleum')]/ancestor::tr/preceding::tr"));
	System.out.println(lipre.size());
	lipre.forEach(name -> {
	    System.out.println("Preceding nodes are:"+name.getText());
	});
	
	//preceding-sibling
	List<WebElement> lipresib=driver.findElements(By.xpath("//a[contains(text(),'Bharat Petroleum')]/ancestor::tr/preceding-sibling::tr"));
	System.out.println("Preceding Sibling:"+lipresib.size());
	lipresib.forEach(name -> {
	    System.out.println("Preceding siblings nodes are:"+name.getText());
	});
	
	driver.close();
	
}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		XPathDemo oo=new XPathDemo();
		oo.Launch();
	}

}
//1. Find the sign up button in facebook application(child)
//2. Locate Firstname field from Signup button in facebook(parent)
//3. Identify the Password field from Mobile no field(following)
//4. Locate Mobile no from new password field in facebook(preceding)
//5. Locate Surname from female radio button(Ancestor)
//6. Identify the search text box grom google search button present on google search home page.
//7. Design your own drop down list on HTML Page and display its data in ascending order.
//8. Capture all the news headlines from bbc.com and display in console
//9. What is the priority order of choosing the Locators
//Ludhiana
//Chandigarh
//Amritsar
//Delhi
//Pune
//Kolkata
//
//
//Amritsar
//Chandigarh
//Delhi
//Kolkata
//Ludhiana
//Pune


//Locators:
//1.id
//2.name
//3.linktext
//4.partiallinktext
//5.tagName
//6.xpath
//7.CssSelector