package Data_Driven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginDemo {
	String path,uname,pass,message,driverpath;
	WebDriver driver;
	public void Login() throws IOException {
		driverpath=System.getProperty("user.dir")+"//Driver//chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverpath);
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		//Step 1 Path of excel sheet
		path=System.getProperty("user.dir")+"\\TestData\\LoginDemo.xlsx";
		FileInputStream fis=new FileInputStream(path);
		
		//Step 2 Move to workbook
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		
		//Step 3 Open the specific sheet
		XSSFSheet sheet=wb.getSheet("Login");
		
		//Step 4 read rows from excel sheet
		System.out.println(sheet.getLastRowNum());
		
		//read cell data
		//uname=sheet.getRow(1).getCell(0).getStringCellValue();
		//System.out.println("username is:"+uname);
		
		for(int i=1;i<=sheet.getLastRowNum();i++)
		{
			uname=sheet.getRow(i).getCell(0).getStringCellValue();
			System.out.println(uname);
			driver.findElement(By.id("txtUsername")).sendKeys(uname);
			pass=sheet.getRow(i).getCell(1).getStringCellValue();
			System.out.println(pass);
			driver.findElement(By.id("txtPassword")).sendKeys(pass);
			//Write data in Excel sheet
			FileOutputStream os=new FileOutputStream(path);
			message="Data imported succefully";
			
			sheet.getRow(i).createCell(2).setCellValue(message);
			wb.write(os);
			os.close();
			driver.findElement(By.id("btnLogin")).click();
		}
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		LoginDemo oo=new LoginDemo();
		oo.Login();
	}

}



