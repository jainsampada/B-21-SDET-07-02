package TestNGDemos;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class ParallelMethods {
@Test
public void Testcase1()
{
	System.out.println("Test case 1"+Thread.currentThread().getId());
	
}
@Test
public void Testcase2()
{
	System.out.println("Test case 2"+Thread.currentThread().getId());
}
@BeforeSuite
public void beforeSuite()
{
	System.out.println("Before Suite");
}
}
