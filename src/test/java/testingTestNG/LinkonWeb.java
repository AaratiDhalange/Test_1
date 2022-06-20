package testingTestNG;

import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LinkonWeb {

	
		
		@Test
		public void m1() {
			
			WebDriverManager.chromedriver().setup();
			
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://www.amazon.in/");
			
		List<WebElement>Links= driver.findElements(By.tagName("a"));
		 
		    Links.size();
		    System.out.println("Number of links of WebPage"+Links.size());
		 
		for(int i=0;i< Links.size();i++) {
			
			Links.get(4).click(); 
			System.out.println(Links.get(i).getAttribute("href"));
			System.out.println(Links.get(i).getText());
			 
		 }
			
		}
}
