package m1package;

import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class keyboradaction {

	public static void main(String[] args) {
	
		 WebDriverManager.chromedriver().setup();
		 WebDriver driver=new ChromeDriver();
		 
		 driver.get("https://www.facebook.com/login/");
	     
		 WebElement email=driver.findElement(By.xpath("//input[@name='email']"));
		 
		
		 
		// Actions act=new Actions(driver);
		 
	//	 act.keyDown(email, Keys.SHIFT).sendKeys("aarati").keyUp(Keys.SHIFT).build().perform();
		 
		// act.keyDown(email, Keys.CONTROL).sendKeys("a").keyDown(Keys.CONTROL).build().perform();
		 
		// act.keyDown(email, Keys.CONTROL).sendKeys("c").keyDown(Keys.CONTROL).build().perform();
		
		// WebElement password=driver.findElement(By.xpath("//input[@name='pass']"));
	//	 act.keyDown(password, Keys.CONTROL).sendKeys("v").keyDown(Keys.CONTROL).build().perform();
		 
	//	 password.sendKeys(Keys.ENTER);
		 

         
	}

}
