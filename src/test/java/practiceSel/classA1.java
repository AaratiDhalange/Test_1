package practiceSel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class classA1 {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();

        WebDriver driver=new ChromeDriver();
        
        
      //  driver.get("https://www.facebook.com/");
        
        driver.navigate().to("https://www.facebook.com/");
        
        driver.manage().window().maximize();
        
         driver.navigate().to("https://www.amazon.in/");
         
         driver.navigate().back();
         
         Thread.sleep(3000);
         
         driver.navigate().forward();
         
         Thread.sleep(3000);
         
         driver.findElement(By.xpath("//button[@name='login']")).sendKeys("hello");
         
         
         
        
        
        
      //  System.out.println( driver.getTitle());
        
      //  Thread.sleep(3000);
       
     //   System.out.println( driver.getCurrentUrl());
       
     
        
     //   driver.findElement(By.xpath("//button[@name='login']")).click();
        
        
     //  driver.close();
      //  driver.quit();
       
	}

}
