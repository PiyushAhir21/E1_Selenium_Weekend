package handling_child_windows;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Shoppersstack {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://www.shoppersstack.com/products_page/22");
		Thread.sleep(20000);

		String HomeID = driver.getWindowHandle();
		System.out.println("PID : " + HomeID);

		driver.findElement(By.xpath("//*[local-name()='svg' and @data-testid='InfoOutlinedIcon']")).click();

		Set<String> IDs = driver.getWindowHandles();
		IDs.remove(HomeID);

		for (String id : IDs) {
			driver.switchTo().window(id);
			System.out.println(driver.getCurrentUrl());
			if (driver.getCurrentUrl().equals("https://www.flipkart.com/")) {
				break;
			}
		}

		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("img[alt='Mobiles']")).click();
		Thread.sleep(1000);
		driver.close();

		driver.switchTo().window(HomeID);
		driver.quit();

	}
}
