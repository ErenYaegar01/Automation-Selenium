package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Newradio {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Program Files\\Java\\jdk-17\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/radio.xhtml;jsessionid=node0br6tg2rl0garqwbr1l7m347h2938.node0");
		//1.Select the radio button.
		
		WebElement safari = driver.findElement(By.xpath(""));
	}

}
