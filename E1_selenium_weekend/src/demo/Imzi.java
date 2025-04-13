package demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Imzi {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://amazon.in");

		Actions act = new Actions(driver);

		WebElement search = driver
				.findElement(By.xpath("//div[@class = 'nav-search-field ']//input[@id = 'twotabsearchtextbox']"));
		search.click();
		search.sendKeys("Wrist Watches");
		act.scrollByAmount(0, 350).perform();
		Thread.sleep(3000);

		driver.findElement(By
				.xpath("//div[@class = 'nav-search-submit nav-sprite']//span//input[@id = 'nav-search-submit-button']"))
				.click();
		act.scrollByAmount(0, 350).perform();
		Thread.sleep(5000);

		driver.findElement(By.xpath("//ul[@id = 'filter-p_n_feature_seven_browse-bin']//span[text() ='Analogue']"))
				.click();
		act.scrollByAmount(0, 350).perform();
		Thread.sleep(5000);

		driver.findElement(By.xpath("//ul[@id = 'filter-p_n_material_browse']//span[text() ='Leather']")).click();
		act.scrollByAmount(0, 350).perform();
		Thread.sleep(5000);

		driver.findElement(By.xpath("//ul[@id = 'filter-p_123']//span[text() ='See more']")).click();
		act.scrollByAmount(0, 350).perform();
		Thread.sleep(1000);

		
		
		driver.findElement(By.xpath("//ul[@id = 'filter-p_123']//span[text() ='Titan']")).click();
		act.scrollByAmount(0, 350).perform();
		Thread.sleep(5000);

		driver.findElement(By.xpath("//ul[@id = 'filter-p_n_pct-off-with-tax']//span[text() = '25% Off or more']"))
				.click();
		act.scrollByAmount(0, 350).perform();
		Thread.sleep(5000);

		driver.findElement(By.xpath("//div[@class = 'a-section a-spacing-base']//div[2]//button[@id = 'a-autoid-118-announce']"))
				.click();

		driver.findElement(By.xpath("//a[@id = 'nav-cart']//span[@class  = 'nav-line-2']")).click();
		act.scrollByAmount(0, 0).perform();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//span[@class = 'sc-quantity-stepper']//span[@class ='a-icon a-icon-small-trash']")).click();
		act.scrollByAmount(0, 0).perform();

	}

}