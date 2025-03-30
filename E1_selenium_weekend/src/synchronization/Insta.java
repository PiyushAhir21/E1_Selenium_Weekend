package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Insta {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
//		Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://www.shoppersstack.com/products_page/27");

		Thread.sleep(15000);
		WebElement pin = driver.findElement(By.id("Check Delivery"));
		pin.sendKeys("201301");
//		driver.findElement(By.id("Check")).click();
		
//		Explicit wait => Smart wait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

		WebElement button = wait.until(ExpectedConditions.elementToBeClickable(By.id("Check")));
		button.click();

//		fluent wait => custom wait
		FluentWait fwait = new FluentWait(driver);
		fwait.withTimeout(Duration.ofSeconds(15));
		
		fwait.until(ExpectedConditions.visibilityOf(button));
		
		fwait.pollingEvery(Duration.ofSeconds(5));
		
		
	}
}
