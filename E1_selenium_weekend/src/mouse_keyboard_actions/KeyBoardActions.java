package mouse_keyboard_actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardActions {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://www.facebook.com/");

		Actions act = new Actions(driver);
		act.sendKeys("admin").build().perform();

		Thread.sleep(1000);
		act.keyDown(Keys.TAB).build().perform();
		act.keyUp(Keys.TAB).build().perform();
		
		act.sendKeys("password").build().perform();
		Thread.sleep(1000);
		act.keyDown(Keys.ENTER).build().perform();
		act.keyUp(Keys.ENTER).build().perform();
		
		
		
		Thread.sleep(3000);
	}
}
