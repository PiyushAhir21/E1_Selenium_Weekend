package drop_down;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleSelect {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://www.facebook.com/r.php?entry_point=login");

//	step 1 : store dropdown element
		WebElement day = driver.findElement(By.id("day"));
//	ṣtep 2 : create object of select class based on that element
		Select selDay = new Select(day);
//	step 3 : call specific method of select
//		selDay.selectByIndex(3);

		List<WebElement> days = selDay.getOptions();
		for (WebElement i : days) {
			System.out.println(i.getText());
		}

//
//		WebElement month = driver.findElement(By.id("month"));
//		Select selMon = new Select(month);
//		selMon.selectByValue("12");
//
//		WebElement year = driver.findElement(By.id("year"));
//		Select selYea = new Select(year);
//		selYea.selectByVisibleText("1996");
//
//		List<WebElement> days = selDay.getOptions();

	}
}
