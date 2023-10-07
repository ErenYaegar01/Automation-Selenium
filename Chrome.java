package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Chrome {
	public static void main(String[] args) {
		//1. Open Chrome
		//2. Google home page
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\jdk1.8.0_361\\jre\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);
		
		
		
//		driver.get("https://www.google.co.in"); 
//		driver.findElement(By.name("q")).sendKeys("Vegeta"+Keys.ENTER);
		driver.get("https://www.leafground.com/index.html");
		driver.findElement(By.linkText("Practice")).click();
		driver.quit();
}

}
