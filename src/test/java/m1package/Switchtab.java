package m1package;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.safari.SafariDriver.WindowType;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Switchtab {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
		
		((SafariDriver) driver.switchTo()).newWindow(WindowType.TAB);
		driver.get("https://www.facebook.com/");
		System.out.println(driver.getTitle());
		
	}

}
