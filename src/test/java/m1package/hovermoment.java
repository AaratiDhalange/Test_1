package m1package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class hovermoment {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.browserstack.com/guide/tag/selenium");
		
		driver.manage().window().maximize();
		
		WebElement product=driver.findElement(By.xpath("//button[@id='product-menu-toggle']"));
	
		
		Actions choose=new Actions(driver);	
		
		choose.moveToElement(product).build().perform();
		
		WebElement mobi=driver.findElement(By.xpath("//a[@title='Mobiles']"));
		mobi.click();
		
	}

}
