package day1;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
	
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\user\\eclipse-workspace\\Selenium4\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("http://www.leafground.com/pages/drop.html");

		Thread.sleep(2000);
		
		WebElement from = driver.findElement(By.id("draggable"));
		WebElement to = driver.findElement(By.id("droppable"));
		WebElement to1 = driver.findElement(By.xpath("//*[@id='mydiv']"));
		
		Actions a = new Actions(driver);
		
		a.clickAndHold(from).moveToElement(to).release(to).build().perform();
		
		a.dragAndDrop(from, to1).build().perform();
		
		
		
		
	}


}
