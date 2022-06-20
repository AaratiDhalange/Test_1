package practiceSel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class class2 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();

        WebDriver driver=new ChromeDriver();
        
        
        driver.get("https://icmt.unionbankofindia.co.in/account/");
        
      //   WebElement email=driver.findElement(By.xpath("//input[@name='email']"));
         
         WebElement union=driver.findElement(By.xpath("//input[@id='rbd_scheme_0']"));
         
       //  link.click();
         
       //  WebElement female=driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
         
       // female.click();
        System.out.println(union.isSelected());
        
        union.click();
         
         
         
         //input[@type='radio'])[1]
         
     //   System.out.println(email.isDisplayed());
        
     //   System.out.println(email.isEnabled());
         
         
        
        
     //   email.sendKeys("test");
        
        
        
     //   if(email.isDisplayed()==true && email.isEnabled() ) {
        	
     //      email.sendKeys("test");
        	
    //    }
        
        
        
      //  driver.findElement(By.xpath("//button[@name='login']")).sendKeys("hello");
        
        

	}

}
