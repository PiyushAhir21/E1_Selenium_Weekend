package ExecutingJS;

import java.lang.reflect.Array;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowMethods {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

//		driver.get("https://www.zomato.com/");

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.location='https://www.zomato.com/';");
		jse.executeScript("window.scrollBy(0,document.body.scrollHeight);");
		Thread.sleep(1000);
		jse.executeScript("window.scrollBy(0,-document.body.scrollHeight);");

		WebElement blinkit = driver.findElement(By.xpath("//div[text()='blinkit']"));

		jse.executeScript("arguments[0].scrollIntoView(false)", blinkit);
		
		WebElement privacy = driver.findElement(By.linkText("Privacy"));
//		privacy.click();
		
		jse.executeScript("arguments[0].click()", privacy);
		
		
		
		Thread.sleep(2000);
		driver.quit();
	}
}
