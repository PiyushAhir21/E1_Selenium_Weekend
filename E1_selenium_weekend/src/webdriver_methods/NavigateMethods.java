package webdriver_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethods {

	public static void main(String[] args) throws InterruptedException {	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
//		driver.get("https://www.instagram.com/");
		driver.navigate().to("https://www.instagram.com/");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[text()='Log in with Facebook']")).click();
		
		Thread.sleep(2000);
		Navigation nav = driver.navigate();
		nav.back();
		
		Thread.sleep(2000);
		nav.forward();
		
		Thread.sleep(2000);
		nav.refresh();
		
		Thread.sleep(3000);
		driver.close();
	}

}
