package locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DirectLocators {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
//		id
		WebElement username =  driver.findElement(By.className("inputtext"));
		username.sendKeys("student@gmail.com");
		
//		name
		WebElement password = driver.findElement(By.name("pass"));
		password.sendKeys("12345678@xyz");
		
		Thread.sleep(2000);
//		WebElement forgot_pass = driver.findElement(By.linkText("Forgotten password?"));
//		forgot_pass.click();
		
//		WebElement forgot_pass = driver.findElement(By.partialLinkText("Forgotten"));
//		forgot_pass.click();
		
//		WebElement createNewBtn = driver.findElement(By.className("_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy"));
//		createNewBtn.click();
		
		List<WebElement> links = driver.findElements(By.className("pageFooterLinkList"));
//		System.out.println(links);
		for (WebElement link : links) {
			System.out.println(link.getText());
		}
		
		driver.close();
	}
}
