package webdriver_methods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class ManageMethods {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.instagram.com/");

		Options opt = driver.manage();
		Window win = opt.window();
		Thread.sleep(1000);
		win.minimize();
		Thread.sleep(1000);
		win.maximize();
		Thread.sleep(1000);
		win.fullscreen();

		Dimension dim1 = win.getSize();
		int w = dim1.getWidth();
		int h = dim1.getHeight();
		System.out.println("width is : " + w);
		System.out.println("height is : " + h);

		Dimension dim2 = new Dimension(700, 250);

		Thread.sleep(1000);
		win.setSize(dim2);

		Point pt1 = win.getPosition();
		int x = pt1.getX();
		int y = pt1.getY();
		System.out.println("x : " + x);
		System.out.println("y : " + y);

		Thread.sleep(1000);
		Point pt2 = new Point(1000, 500);
		win.setPosition(pt2);
	}
}
