package m1package;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenShot {

	public static void main(String[] args) throws IOException, InterruptedException {
		
	WebDriverManager.chromedriver().setup();
		
	WebDriver driver=new ChromeDriver();
		
	driver.get("https://www.snapdeal.com/");
	driver.manage().window().maximize();
	
	//Full Screen ScreenShot
		
	 TakesScreenshot ts= (TakesScreenshot)driver;
		
	 File Scr=ts.getScreenshotAs(OutputType.FILE);
     File dest=new File("C:\\Users\\HP\\eclipse-workspace\\m1\\ScreenShot\\SS1.png");
     FileUtils.copyFile(Scr, dest);
    
     Thread.sleep(5000);
		 
     //Specific section ScreenShot	 
	 WebElement TrendingSectionSS=driver.findElement(By.xpath("//section[@class='trendingNowWidget posRelative dp-widget dp-fired']"));
	
     File Scr1=TrendingSectionSS.getScreenshotAs(OutputType.FILE);
	 File dest1=new File("C:\\Users\\HP\\eclipse-workspace\\m1\\ScreenShot\\SS2.png");
	 FileUtils.copyFile(Scr1, dest1);
	 
	 
	}

}