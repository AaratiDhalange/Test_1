package m1package;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExcelForLloop {

	public static void main(String[] args) throws IOException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		String filepath="C:\\Users\\HP\\eclipse-workspace\\m1\\TestData\\Data1.xlsx";
		
		FileInputStream file = new FileInputStream(filepath);
		
		XSSFWorkbook wk=new XSSFWorkbook(file);
		
		
		

	}

}
