package handlng_popup;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_FileUpload_popup {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");

		driver.findElement(By.xpath("//h2[text()=\"I'm experienced\"]")).click();

		WebElement fileUp = driver.findElement(By.id("resumeUpload"));
		fileUp.sendKeys("C:\\Users\\User\\Desktop\\Aanchal_Gumber_-_Automation_Engineer (4).pdf");
	}
}
