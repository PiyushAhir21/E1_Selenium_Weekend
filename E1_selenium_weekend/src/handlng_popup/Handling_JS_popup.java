package handlng_popup;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_JS_popup {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

//		driver.get("https://demowebshop.tricentis.com/");
//
//		driver.findElement(By.cssSelector("input[type='submit']")).click();
//
//		Alert ale = driver.switchTo().alert();
//		
//		Thread.sleep(2000);
////		ale.accept();
//		System.out.println(ale.getText());
//		ale.dismiss();

//		Confirmation Alert
//		driver.get("https://demo.guru99.com/test/delete_customer.php");
//		driver.findElement(By.name("submit")).click();
//
//		Alert ale = driver.switchTo().alert();
//		Thread.sleep(1000);
////		ale.accept();
//		ale.dismiss();

		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");

		Thread.sleep(3000);
		driver.switchTo().frame("iframeResult");

		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Try it']")).click();

		Alert ale = driver.switchTo().alert();
		ale.sendKeys("Kallu kaliya...");
		ale.sendKeys("Chhutki...");
		ale.accept();

//		Thread.sleep(1000);
//		ale.accept();

		Thread.sleep(3000);
		driver.close();
	}
}
