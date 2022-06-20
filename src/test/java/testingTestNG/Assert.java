package testingTestNG;

import static org.testng.Assert.assertEquals;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assert {
	
	@Test
	public void A() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.getTitle();
		System.out.println("Title of Apllication:"+driver.getTitle());
		WebElement Searchbox=driver.findElement(By.xpath("//input[@type='text']"));
		Searchbox.sendKeys("Mobile");
		Searchbox.getText();
		System.out.println("Search data:"+Searchbox.getText());
		
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		WebElement Choose=driver.findElement(By.xpath("(//img[@class='s-image'])[3]"));
		Choose.click();
		Choose.getText();
		System.out.println("Selected mobile:"+Choose.getText());
		
		String ParentTab=driver.getWindowHandle();
		
		Set <String>TabsID=driver.getWindowHandles();
		System.out.println(TabsID);
		
		Iterator<String> IT=TabsID.iterator();
		
		while(IT.hasNext()) {
			
			String ChildTab=IT.next();
			
		  if(!ParentTab.equalsIgnoreCase(ChildTab)) {
			  
			  driver.switchTo().window(ChildTab);
			  
			  WebElement FinalMobile=driver.findElement(By.xpath("//div[@id='titleSection']"));
			  FinalMobile.getText();
			  WebElement Amount=driver.findElement(By.xpath("//*[@id=\"corePrice_desktop\"]/div/table/tbody/tr[2]/td[2]/span[1]/span[2]"));
			  Amount.getText();
			  System.out.println("Price of Mobile:"+Amount.getText());
			  WebElement AddToCart=driver.findElement(By.xpath("//input[@id='add-to-cart-button']"));
		      AddToCart.click();
		      System.out.println(AddToCart.getText());
		      
		      driver.navigate().refresh();
		      
		      driver.findElement(By.xpath("//div[@id='nav-cart-count-container']")).click();
		      
			  WebElement Delete_Btn=driver.findElement(By.xpath("//input[@value='Delete']"));
			  Delete_Btn.click();
			  System.out.println(Delete_Btn.getText());
			  
			  
			  WebElement Result=driver.findElement(By.xpath("//h1[@class='a-spacing-mini a-spacing-top-base']"));
			  Result.getText();
			  String Actual=Result.getText();
			  String Expected="Your Amazon Cart is empty.";
			  System.out.println("Expected Result:"+Expected);
			  
			  assertEquals(Actual, Expected);
			  System.out.println("Actual Result:"+Actual);
			  
			  driver.close();
			  
		     }
		}
		     driver.close();
	}
}



//  Alert Alt=driver.switchTo().alert();
//  Alt.dismiss();
  
 // WebElement Cart=driver.findElement(By.xpath("//a[@aria-label='Exit this panel and return to the product page.']"));
//  Cart.click();
//  System.out.println(Cart.getText());