package m1package;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class selctdropwithoutmethod {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		 WebElement dropdown=driver.findElement(By.xpath("//select[@data-nav-selected='0']"));
		
		Select drp=new Select(dropdown);
		
		List<WebElement>options=drp.getOptions();
		
		 String oppi=options.get(11).getText();
		 String oppi2=options.get(2).getText();
		
		 if(oppi.equals("Car & Motorbike") ) {
			 
			 options.get(11).click();
			 
			 Thread.sleep(5000);
			 
			 if(oppi2.equals("Amazon Devices")){
				 
				    options.get(2).click(); 
			   } 
		 }
         
		 else{
		 
	         System.out.println("Compariable test not matching with index value=action cant perform");
	      }
    }
}