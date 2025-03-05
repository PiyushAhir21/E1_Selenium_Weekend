package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("C:\\Users\\User\\git\\E1_selenium_Weekend\\E1_selenium_weekend\\src\\html\\sample.html");
		
		driver.findElement(By.xpath("//input[@value=`C`]")).sendKeys("abc");
	}
}
