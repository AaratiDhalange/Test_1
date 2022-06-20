package m1package;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetWindowHandle {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.guru99.com/popup.php");
		
		driver.findElement(By.xpath("//a[@target='_blank']")).click();
		
		String parentTab=driver.getWindowHandle();
		
		Set<String>tabs=driver.getWindowHandles();
		
		System.out.println(tabs);
		
	    Iterator <String> IT=tabs.iterator();
	    
	    while(IT.hasNext()) {
	    	
	        String CHILDTAB=IT.next();
	           
	    if(!parentTab.equalsIgnoreCase(CHILDTAB)) {
	    		
	    	driver.switchTo().window(CHILDTAB);
	    		
	    	driver.findElement(By.xpath("//input[@name='emailid']")).sendKeys("sanaiya145@gmail.com");
	    	Thread.sleep(3000);
	    	driver.close();
	    			}
	      }

	    driver.switchTo().window(parentTab);
	    driver.close();
	}
}
