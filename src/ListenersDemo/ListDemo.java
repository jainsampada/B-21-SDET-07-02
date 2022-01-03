package ListenersDemo;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class ListDemo {
@Test
public void Test1()
{
	System.out.println("This is Test Case 1");
	Assert.assertEquals("A", "A");
}
@Test
public void Test2()
{
	System.out.println("This is Test case 2");
	Assert.assertEquals("A", "B");
}
@Test
public void Test3()
{
	System.out.println("This is Test case3");
	throw new SkipException("this is skip exceptoion");
}

}
