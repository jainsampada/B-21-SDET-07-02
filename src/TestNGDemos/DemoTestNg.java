package TestNGDemos;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DemoTestNg {
@BeforeSuite
public void beforesuite()
{
	System.out.println("Before Suite");
}
@AfterSuite
public void aftersuite()
{
	System.out.println("After Suite");
}
@BeforeClass
public void beforeclass()
{
	System.out.println("Before class");
}
@AfterClass
public void afterclass()
{
	System.out.println("After class");
}
@BeforeTest
public void beforetest()
{
	System.out.println("Before Test");
}
@AfterTest
public void aftertest()
{
	System.out.println("After Test");
}
@BeforeMethod
public void beforemethod()
{
	System.out.println("Before method");
}
@AfterMethod
public void aftermethod()
{
	System.out.println("After method");
}
@Test(enabled=false)
public void Login()
{
	System.out.println("login code");
}
@Test
public void driver()
{
	System.out.println("driver code");
}
@Test
public void close_browser()
{
	System.out.println("Close browser");
}
}
