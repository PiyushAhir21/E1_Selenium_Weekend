package handlng_popup;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_FileUpload_popup2 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("C:\\Users\\User\\git\\E1_selenium_Weekend\\E1_selenium_weekend\\src\\html\\Demo.html");

		Thread.sleep(3000);
		WebElement fileUp = driver.findElement(By.xpath("//input[@type='file']"));
		fileUp.sendKeys("C:\\Users\\User\\Desktop\\Aanchal_Gumber_-_Automation_Engineer (4).pdf");
	}
}
