package handlng_popup;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Handling_Noti_popup {
	public static void main(String[] args) throws InterruptedException {

		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
		opt.addArguments("--start-maximized");
		opt.addArguments("--incognito");

		WebDriver driver = new ChromeDriver(opt);
//		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://www.easemytrip.com/");

		Thread.sleep(5000);
		driver.close();
	}
}
