package day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstScript {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\user\\eclipse-workspace\\Selenium4\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.google.com/");

		Thread.sleep(2000);

		driver.close();

		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\user\\eclipse-workspace\\Selenium4\\Drivers\\msedgedriver.exe");

		WebDriver driver1 = new EdgeDriver();

		driver1.manage().window().maximize();
		
		Thread.sleep(2000);

		driver1.get("https://www.google.com/");

		Thread.sleep(2000);

		driver1.close();

		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\user\\eclipse-workspace\\Selenium4\\Drivers\\geckodriver.exe");

		WebDriver driver2 = new FirefoxDriver();

		driver2.manage().window().maximize();

		driver2.get("https://www.google.com/");

		Thread.sleep(2000);

		driver2.close();

	}

}
