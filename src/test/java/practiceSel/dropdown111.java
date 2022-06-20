package practiceSel;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dropdown111 {
	

	    // @SuppressWarnings("unlikely-arg-type")
	
	    public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		
        
        WebDriver driver=new ChromeDriver();
        
        
       driver.get("https://icmt.unionbankofindia.co.in/account/");
       
       driver.manage().window().maximize();
       
       WebElement dropdown=driver.findElement(By.xpath("//select[@name='ddlTitle']"));
       
       Select drp=new Select(dropdown);
       
     // Listdrop=drp.getOptions();
       
    //  drp.selectByIndex(1);
       
    //   Thread.sleep(3000);
       
    //   drp.selectByValue("MS");
       
    //   Thread.sleep(3000);
      
    //   drp.selectByVisibleText("Miss");
       
     List<WebElement> drrop=drp.getOptions();
     
  //   drrop.get(2).click();
    
      String tuti= drrop.get(2).getText();
     
   //  System.out.print(drrop.get(2).getText());
     
     if(tuti.equals("Ms. / Mrs.")) {
    	 
        drrop.get(2).click();
        
     }
     
     else {
    	 System.out.println("Condition is false");
     }
     
  //   System.out.println("List of Dro Down:"+drrop.size());
     
    
  //   for(int i=0;i<drrop.size();i++) {
    	 
    	 
   // 	String opii= drrop.get(i).getText();
   	
   //.out.println("List of Drop Down:"+opii);
    	 
    	 
  //   }
     
      
	}

}
