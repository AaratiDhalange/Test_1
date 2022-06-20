package m1package;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EXCELDATAsingle {

	 public static void main(String[] args) throws IOException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		
	
		
		
	    String filepath="C:\\Users\\HP\\eclipse-workspace\\m1\\TestData\\Data1.xlsx";	
        FileInputStream fis= new  FileInputStream(filepath);                           //class 1 to view the excel file
        XSSFWorkbook wk =new XSSFWorkbook(fis);                                        // class 2 to read data from file
        
        
        WebElement email_id=driver.findElement(By.xpath("//input[@name='email']"));
        String DATA1= wk.getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
        email_id.sendKeys(DATA1);
        System.out.println(DATA1);
        
        WebElement Password=driver.findElement(By.xpath("//input[@type='password']"));
        Double DATA2= wk.getSheet("Sheet1").getRow(0).getCell(3).getNumericCellValue();

        System.out.println("value of DATA2 field="+DATA2);
        
        String DATA3=String.valueOf(DATA2).replace(".", " ").replace("0", " ");
        
        Password.sendKeys(DATA3);
        
        WebElement showvalue=driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div[2]/div[2]/form/div/div[2]/div/div/div/a/div/div"));
        showvalue.click();
    
        
	}

}

  
  