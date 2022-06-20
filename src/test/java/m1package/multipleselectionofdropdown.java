package m1package;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class multipleselectionofdropdown {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://semantic-ui.com/modules/dropdown.html");
		driver.manage().window().maximize();
		
		WebElement dropdown=driver.findElement(By.xpath("//div[@class='ui fluid dropdown selection multiple upward']"));
		
		Select drp=new Select(dropdown);
		
	    List<WebElement>options=drp.getOptions();
	    
	    String choice=options.get(0).getText();
		
	  if(choice.equals("angular")) { 
		  drp.selectByIndex(0);
	   
	  }
		
	}

}
