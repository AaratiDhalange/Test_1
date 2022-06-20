package m1package;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selectnumberofdropdown {
    static WebDriver driver;
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
	    driver=new ChromeDriver();
		
		driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
		
		WebElement product=(WebElement) driver.findElements(By.xpath("//select[@class='col-lg-3'][1]"));
		WebElement animals=(WebElement) driver.findElements(By.xpath("//select[@class='col-lg-3'][2]"));
		
		select(product,"Microsoft");
		select(animals,"babycat");
		
	}
  
	public static void select(WebElement ele,String value) {
		
		    Select drp=new Select(ele);
		
	    	List<WebElement>options=drp.getOptions();
	    	
	    	for(WebElement opii:options) {
	    	
	    	
	    		if(opii.getText().equals(value)) {
	    			
	    			opii.click();
	    			break;
	    	}
	     }
	}
}
