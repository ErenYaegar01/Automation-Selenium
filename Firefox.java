package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox {
	public static void main(String[] args ) {
		//1. open Mozilla FireFox
		System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\Java\\jdk1.8.0_361\\geckodriver.exe");
		//2. Creating Firefox object.
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.co.in");
		//quit command closes all the browser and drivers also while close command closes only the current browser.
		//driver.findElement(By.id("input")).sendKeys("Vegeta"+Keys.ENTER);
		
	}
}





