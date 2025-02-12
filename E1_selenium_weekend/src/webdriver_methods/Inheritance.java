package webdriver_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Inheritance {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
//		 				driver = new FirefoxDriver();
//		 				driver = new EdgeDriver();

		/*
		 * webdriver is type, driver is r.v. , new is a keyword which will create random
		 * memory space in heap area, where constructor call will register, load and
		 * re-initialise the non-static members of the class
		 */

//		SafariDriver driver4 = new SafariDriver();

		driver.get("https://www.instagram.com/");

		String title = driver.getTitle();
		System.out.println(title);

		String url = driver.getCurrentUrl();
		System.out.println(url);

//		String pageSource = driver.getPageSource();
//		System.out.println(pageSource);
		
		driver.findElement(By.linkText("Meta")).click();
		
		
		driver.quit();
		
		driver.close();
	}
}
