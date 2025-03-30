package we_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetterMethods {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.instagram.com/");

		WebElement loginBtn = driver.findElement(By.xpath("//button[@type='submit']"));

		String textOFLoginBtn = loginBtn.getText();
		System.out.println(textOFLoginBtn);

		String attOfLoginBtn = loginBtn.getAttribute("class");
		System.out.println(attOfLoginBtn);

		String cssValueOfLoginBtn = loginBtn.getCssValue("box-sizing");
		System.out.println(cssValueOfLoginBtn);

		String tagOfLoginBtn = loginBtn.getTagName();
		System.out.println(tagOfLoginBtn);
		
		driver.close();
	}
}
