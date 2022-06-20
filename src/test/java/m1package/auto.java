package m1package;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class auto {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
	    WebElement Searchbox=driver.findElement(By.xpath("//input[@name='q']"));
	    Searchbox.sendKeys("maven");
	    Thread.sleep(3000);
	    
	    List<WebElement>Autolist=driver.findElements(By.xpath("//ul[@class='G43f7e']//li"));
	   
	    if(Autolist.get(2).getText().equals("maven dependency")) {
	  		
  	           Autolist.get(4).click();
            }  
	    
  	    else {
  	    	
  		System.out.println("condition is false");
  	
           }
       }   
} 
      





   //   String list2=Autolist.get(2).getText();
   //   System.out.println(list2);
   //   Autolist.get(2).click();
   




  //System.out.println( Autolist.size());

  //  System.out.println(Autolist.get(6).getText());

	    
      //  for(int i=0; i<Autolist.size();i++) {
	    	
	 //	  String list=Autolist.get(i).getText();
	 	
	  //     System.out.println(list);
     //   }
	    	
	  
