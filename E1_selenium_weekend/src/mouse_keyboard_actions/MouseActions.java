package mouse_keyboard_actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActions {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.instagram.com/");
		
		Actions act = new Actions(driver);
		WebElement loginWFB =  driver.findElement(By.xpath("//div[text()='Log in with Facebook']"));
		Thread.sleep(1000);
//		Hover
//		act.moveToElement(loginWFB).build().perform();
		Thread.sleep(1000);
//		Left click
//		act.click(loginWFB).build().perform();
		
		Thread.sleep(3000);
		driver.close();
	}
}
