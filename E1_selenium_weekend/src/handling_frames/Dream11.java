package handling_frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dream11 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
				
		driver.get("https://www.dream11.com/");

		
//		frame by index
//		driver.switchTo().frame(0);
		
//		frame by id or name
//		driver.switchTo().frame("send-sms-iframe");
		
//		frame by frameElement
		WebElement frameElement = driver.findElement(By.cssSelector("iframe[title='Iframe Example']"));
		driver.switchTo().frame(frameElement);
		
		WebElement phone = driver.findElement(By.id("regEmail"));
		phone.sendKeys("8447225458");
		
//		To come out of the frame
		driver.switchTo().parentFrame();
		
//		To go to sidha upar
		driver.switchTo().defaultContent();
		
		driver.findElement(By.linkText("About Us")).click();
		
	}
}
