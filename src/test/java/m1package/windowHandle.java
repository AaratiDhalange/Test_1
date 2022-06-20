package m1package;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class windowHandle {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/login/");
		//System.out.println(driver.getWindowHandle());
		
		driver.findElement(By.xpath("//a[@class='_97w4']")).click();
		
		Set<String>wi1=driver.getWindowHandles();
		
		System.out.println(wi1);
		
		System.out.println(wi1.size());
		
	}

}
