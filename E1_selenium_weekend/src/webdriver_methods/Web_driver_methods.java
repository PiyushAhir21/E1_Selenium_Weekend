package webdriver_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_driver_methods {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

//		driver.get("https://www.instagram.com/");
		driver.get("https://en-gb.facebook.com/");

		String title = driver.getTitle();
		System.out.println(title);

		String url = driver.getCurrentUrl();
		System.out.println(url);

//		String pagesource =driver.getPageSource();
//		System.out.println(pagesource);

//		driver.findElement(By.linkText("Meta Pay")).click();

		Window win = driver.manage().window();
		win.maximize();
		Thread.sleep(1000);
//		win.minimize();
//		Thread.sleep(1000);
//		win.fullscreen();
//		Thread.sleep(2000);

		Dimension dim = driver.manage().window().getSize();
//		System.out.println(dim);
//		System.out.println(dim.getWidth());
//		System.out.println(dim.getHeight());

//		Dimension dim2 = new Dimension(1000, 500);
//		win.setSize(new Dimension(1000, 500));

//		Thread.sleep(2000);
//
//		win.setSize(dim);

//		Point pt = win.getPosition();
//		System.out.println(pt);

		Point pt2 = win.getPosition();
		System.out.println(pt2);

		Thread.sleep(3000);
		
		win.setPosition(new Point(100, 100));
		Point pt3 = win.getPosition();
		System.out.println(pt3);

		Thread.sleep(3000);
		driver.close();
//		driver.quit();

	}

}
