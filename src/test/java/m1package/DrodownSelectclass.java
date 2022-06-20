package m1package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DrodownSelectclass {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		WebElement DropDown=driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		
		Select drp=new Select(DropDown);
		
		drp.selectByIndex(3);
		
		Thread.sleep(5000);
		
		drp.selectByValue("search-alias=nowstore");
		
		Thread.sleep(5000);
		
		drp.selectByVisibleText("Amazon Pharmacy");		
	}
}
