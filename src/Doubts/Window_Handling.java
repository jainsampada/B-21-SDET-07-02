package Doubts;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window_Handling {
public static void main(String[] ar)
{
	String path=System.getProperty("user.dir")+"//Driver//chromedriver.exe";
    System.setProperty("webdriver.chrome.driver", path);
    WebDriver driver = new ChromeDriver();

    driver.get("http://the-internet.herokuapp.com/windows");
    driver.findElement(By.xpath("//a[contains(text(), 'Click Here')]")).click();

    //1.Extracting window handles
     Set<String> ids =driver.getWindowHandles(); // set is declared to store the id's returned as of Set<String>
     //["1st id",2,3]

    System.out.println(ids);

    //2. Defining Iterator for this set of window handles

    Iterator<String> it=ids.iterator();

    String parent_id =it.next();//parent window handle
    String child_id =it.next();


    //3.Switching to the respective window using the window handle
    driver.switchTo().window(child_id);
    System.out.println(driver.getTitle());

    driver.switchTo().window(parent_id);
    System.out.println(driver.getTitle());
    driver.close();
}

}
