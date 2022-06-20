package m1package;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExceldataGenericMethod {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/login/");
		
		WebElement email_id=driver.findElement(By.xpath("//input[@name='email']"));
		WebElement pass_word=driver.findElement(By.xpath("//input[@name='pass']"));
		WebElement login=driver.findElement(By.xpath("//button[@id='loginbutton']"));
		
		String d1=Werksheet( "sheet1",  0, 0);
		String d2=Werksheet( "sheet1",  0, 1);
		
		System.out.println(d1);
		System.out.println(d2);
		
		email_id.sendKeys(d1);
		pass_word.sendKeys(d2);
		login.click();
		Thread.sleep(5000);
		
		//driver.get("https://www.facebook.com/login/");
		
	//	WebElement email_id1=driver.findElement(By.xpath("//input[@name='email']"));
	//	WebElement pass_word1=driver.findElement(By.xpath("//input[@name='pass']"));
	//	WebElement login1=driver.findElement(By.xpath("//button[@id='loginbutton']"));
		
	//	String d11=Werksheet( "sheet1",  0, 0);
	//	String d22=Werksheet( "sheet1",  0, 1);
		
	//	System.out.println(d11);
	//	System.out.println(d22);
		
	//	email_id1.sendKeys(d11);
	//	pass_word1.sendKeys(d22);
	//	login1.click();
		
	}
		public static String Werksheet(String sheetname,  int row,  int cell) throws IOException {
			
			String filepath="C:\\Users\\HP\\eclipse-workspace\\m1\\TestData\\Data1.xlsx";
			
			FileInputStream file=new FileInputStream(filepath);
			XSSFWorkbook wk=new XSSFWorkbook(file);
			
			return wk.getSheet(sheetname).getRow(row).getCell(cell).getStringCellValue();	
		}
	}


