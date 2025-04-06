package Screenshots;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TakingScreenshot {
	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://www.facebook.com/");

//		How to take a ss of web element ?
		WebElement loginBtn = driver.findElement(By.name("login"));
		File source = loginBtn.getScreenshotAs(OutputType.FILE);
		File destination = new File("src\\Screenshots\\loginbtn.png");
		FileHandler.copy(source, destination);

//		How to take a ss of web page ?
		driver.findElement(By.linkText("Forgotten password?")).click();
		TakesScreenshot tks = (TakesScreenshot) driver;
		File src = tks.getScreenshotAs(OutputType.FILE);
		File dest = new File("src\\Screenshots\\webpage.png");
		
		FileHandler.copy(src, dest);
		
		Thread.sleep(2000);
		driver.close();
	}
	
	
}
