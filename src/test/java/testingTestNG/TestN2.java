package testingTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestN2 {
	
	WebDriver driver;
	
	@BeforeSuite
	public void BS() {
		
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		 driver.get("https://www.facebook.com/login/");
		 driver.manage().window().maximize();
		
	}
	
    @Test
    
    public void T() {
    	
    	driver.getTitle();
    	driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Test");
    	
    	
    }
    
    
    
    @AfterSuite
    public void AS() {
    	
    	driver.close();
    	
    }
}
