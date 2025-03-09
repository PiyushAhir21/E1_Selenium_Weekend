package webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActionsMethods {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

//		driver.get("https://www.flipkart.com/");
//		
//		WebElement searchField = driver.findElement(By.name("q"));
//		searchField.sendKeys("shoes");
//		
//		Thread.sleep(3000);
//		searchField.clear();
//		
//		searchField.sendKeys("Mobile");
//		

		driver.get("https://www.instagram.com/");

//		passing username
		driver.findElement(By.name("username")).sendKeys("12345678");
//		passing password
		driver.findElement(By.name("password")).sendKeys("123456789");

//		Thread.sleep(5000);
//		clicking on login button

		WebElement loginBtn = driver.findElement(By.xpath("//button[@type='submit']"));
		Boolean status = loginBtn.isEnabled();

		if (status) {
//			loginBtn.click();
			loginBtn.submit();

			System.out.println("clicked on loginbtn successfully !!!");
		} else {
			System.out.println("Not clicked on loginbtn !!!");
		}

		
	}
}
