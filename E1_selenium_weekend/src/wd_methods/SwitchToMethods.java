package wd_methods;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToMethods {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.instagram.com/");
		
		String parentID = driver.getWindowHandle();
		System.out.println("parent id : " + parentID);
		
		System.out.println();
		
		driver.findElement(By.linkText("Meta")).click();
		Set<String> IDs = driver.getWindowHandles();
		IDs.remove(parentID);
		
		for (String id : IDs) {
			driver.switchTo().window(id);
			
			Thread.sleep(2000);
			driver.close();
		}
		
		driver.switchTo().window(parentID);
		Thread.sleep(2000);
		driver.close();
		
		
	}
}
