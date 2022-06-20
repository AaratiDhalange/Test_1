package m1package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MaP1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	    
	    WebElement username=driver.findElement(By.name("email"));
	    username.sendKeys("9604452145");
	   
	    WebElement password=driver.findElement(By.name("pass"));
	    password.sendKeys("vaishali123");
	    
	    WebElement login=driver.findElement(By.name("login"));
	    login.click();
	    
	    Thread.sleep(10000);
	    
        driver.navigate().to("https://www.amazon.in/");
		
        driver.findElement(By.id("nav-hamburger-menu")).click();
	    

        

        
	}

}
