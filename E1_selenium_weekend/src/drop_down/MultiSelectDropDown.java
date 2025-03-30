package drop_down;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectDropDown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("C:\\Users\\User\\git\\E1_selenium_Weekend\\E1_selenium_weekend\\src\\html\\multiselect.html");
		
		WebElement carsDD = driver.findElement(By.id("cars"));
		
//		whether my DD is single select or multi select
		Select selCar = new Select(carsDD);
//		boolean status = selCar.isMultiple();
//		System.out.println(status);
		selCar.selectByIndex(0);
		selCar.selectByIndex(1);
		selCar.selectByIndex(3);
		
		Thread.sleep(1000);
//		selCar.deselectByValue("Fer");	
//		selCar.deselectAll();
		
		List<WebElement> selectedCars = selCar.getAllSelectedOptions();
		for (WebElement selectedCar : selectedCars) {
			System.out.println(selectedCar.getText());
		}
		
		String firstSelected = selCar.getFirstSelectedOption().getText();
		System.out.println(firstSelected);
		
		Thread.sleep(3000);
		driver.close();
	}

}
