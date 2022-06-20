package m1package;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AlretHandlling {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		
		// Alert handling for OK button
		driver.findElement(By.xpath("//button[@onclick='alertbox()']")).click();
		Thread.sleep(3000);
		Alert alt=driver.switchTo().alert();
		System.out.println(alt.getText());
		alt.accept();
		Thread.sleep(3000);
		
		// Alert handling for OK and cancel button
		driver.findElement(By.xpath("//a[@href='#CancelTab']")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		Thread.sleep(3000);
		Alert cancle=driver.switchTo().alert();
		System.out.println(cancle.getText());
		cancle.dismiss();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[@href='#CancelTab']")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		Thread.sleep(3000);
        Alert okk=driver.switchTo().alert();
        System.out.println(okk.getText());
		okk.accept();
		Thread.sleep(3000);
		
		// Alert with text box
		driver.findElement(By.xpath("(//a[@data-toggle='tab'])[3]")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
		Thread.sleep(3000);
		Alert text_1=driver.switchTo().alert();
		text_1.sendKeys("Aarati");
		System.out.println(text_1.getText());
	    text_1.accept();
	    Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
		Thread.sleep(3000);
		Alert text_2=driver.switchTo().alert();
		System.out.println(text_2.getText());
	    text_2.dismiss();
	   
	    driver.close();	
		
	}

}
