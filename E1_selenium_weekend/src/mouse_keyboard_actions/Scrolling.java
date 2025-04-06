package mouse_keyboard_actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scrolling {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://www.zomato.com/");

		WebElement appsForYou = driver.findElement(By.linkText("Apps For You"));
		WebElement zomato = driver.findElement(By.xpath("(//a[text()='Zomato'])[2]"));
		
		Actions act = new Actions(driver);
		act.scrollByAmount(0, 2000).perform();
		act.scrollToElement(zomato).perform();
	}
}
