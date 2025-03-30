package we_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerificationMethods {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("file:///C:/Users/User/git/E1_selenium_Weekend/E1_selenium_weekend/src/html/Login.html");

		WebElement checkBox = driver.findElement(By.xpath("//label[text()='Male']/../..//input"));
		checkBox.click();
		
		Thread.sleep(5000);
		
		Boolean status = checkBox.isDisplayed();
		System.out.println(status);
	}
}
