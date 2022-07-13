package day1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Screenshot {

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\user\\eclipse-workspace\\MiniProject\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.google.com/");

		TakesScreenshot as = (TakesScreenshot) driver;

		File source = as.getScreenshotAs(OutputType.FILE);
		
		File des = new  File("C:\\Users\\user\\eclipse-workspace\\Selenium4\\Screenshot\\Dineshgoogle.png");
		
		FileUtils.copyFile(source, des);
		
		driver.close();

	}

	

}
