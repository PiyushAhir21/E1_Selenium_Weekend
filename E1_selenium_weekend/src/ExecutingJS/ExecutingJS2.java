package ExecutingJS;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExecutingJS2 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://www.facebook.com/");

		JavascriptExecutor jse = (JavascriptExecutor) driver;
//		WebElement unField = driver.findElement(By.id("email"));
//		String un = "admin";
//		jse.executeScript("arguments[0].value=arguments[1]", unField,un);
		jse.executeScript("document.querySelector(\"input[type='text']\").value='admin123';");

	}
}
