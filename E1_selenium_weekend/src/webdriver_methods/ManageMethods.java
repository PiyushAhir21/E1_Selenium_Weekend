package webdriver_methods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class ManageMethods {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		
		Options opt = driver.manage();
		Window win = opt.window();
		win.minimize();
		win.maximize();
		win.fullscreen();

		Dimension dim1 = win.getSize();
		int w = dim1.getWidth();
		int h = dim1.getHeight();
		System.out.println("width is : " + w);
		System.out.println("height is : " + h);
		
		Dimension dim2 = new Dimension(700, 250);
		
		win.setSize(dim2);
		
		Point pt1 = win.getPosition();
		int x = pt1.getX();
		int y = pt1.getY();
		System.out.println("x : " + x);
		System.out.println("y : " + y);
		
		Point pt2 = new Point(100, 100);
		
	}
}
