package mouse_keyboard_actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("http://dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");

		WebElement one = driver.findElement(By.id("box1"));
		WebElement oneHome = driver.findElement(By.id("box101"));

		WebElement two = driver.findElement(By.id("box2"));
		WebElement twoHome = driver.findElement(By.id("box102"));

		WebElement three = driver.findElement(By.id("box3"));
		WebElement threeHome = driver.findElement(By.id("box103"));

		WebElement four = driver.findElement(By.id("box4"));
		WebElement fourHome = driver.findElement(By.id("box104"));

		WebElement five = driver.findElement(By.id("box5"));
		WebElement fiveHome = driver.findElement(By.id("box105"));

		Actions act = new Actions(driver);
		act.dragAndDrop(one, oneHome).build().perform();
		Thread.sleep(500);
		act.dragAndDrop(two, twoHome).build().perform();
		Thread.sleep(500);
		act.dragAndDrop(three, threeHome).build().perform();
		Thread.sleep(500);
		act.dragAndDrop(four, fourHome).build().perform();
		Thread.sleep(500);
		act.dragAndDrop(five, fiveHome).build().perform();
		act.dragAndDropBy(five, 50, 0).build().perform();
		Thread.sleep(2000);
		driver.close();
	}
}
