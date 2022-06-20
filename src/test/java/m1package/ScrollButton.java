package m1package;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrollButton {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.snapdeal.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)", " ");
		
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		
		File srcA=ts.getScreenshotAs(OutputType.FILE);
		File destA=new File("C:\\Users\\HP\\eclipse-workspace\\m1\\ScreenShot\\ssa.png");
		
		FileUtils.copyDirectory(srcA, destA);
		
		
	}

}
