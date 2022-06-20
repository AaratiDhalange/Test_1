package m1package;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectClassMethod {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		WebElement Dropdown=driver.findElement(By.xpath("//select[@data-nav-digest='YaNDxYMsix1vZjM7upEvnpX/VWU=']"));
		
		Select drp=new Select(Dropdown);
		
		drp.getOptions();
		
		List<WebElement>options=drp.getOptions();
	
		System.out.println(options.size());
        System.out.println(options.get(4).getText());
			
	}

}
