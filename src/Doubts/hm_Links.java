package Doubts;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class hm_Links {
	WebDriver driver;
	String text;
	String URL;
	ArrayList<String> list= new ArrayList<String>();
	
	public void get_Links(WebDriver _driver)
	{	
		List<WebElement> links= _driver.findElements(By.tagName("a"));
		
		System.out.println("The total of links in this page is: " + links.size());
		
		for(int i= 0; i<links.size(); i++) 
		{
			text= links.get(i).getText();
			URL= links.get(i).getAttribute("href");
			text= text.trim();
			text= text.replaceAll("\\s+", " ");
			text= text.replaceAll("\n", " ");
			text= "\n" + (i+1) + " - " + text + " ---> " + URL;
			list.add(text);
		}
		
		Iterator it= list.iterator();
		
		while(it.hasNext()) 
		{
			System.out.println(list);
			break;
		}
	}
}



