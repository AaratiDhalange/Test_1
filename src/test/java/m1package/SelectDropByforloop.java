package m1package;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectDropByforloop {

	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		 WebElement dropdown=driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		 
		 Select drp=new Select(dropdown);
		 
		 List<WebElement>options=drp.getOptions();
		 
         options.size();
		
		 for(int i=0;i<options.size();i++) {
			
		  String select=options.get(i).getText();
		  System.out.println(select); 
		}	
	}
}
