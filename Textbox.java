package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Textbox {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\jdk-17\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/input.xhtml");
		
		WebElement NameBox = driver.findElement(By.id("j_idt88:name"));
		NameBox.sendKeys("Vegeta");
		
		WebElement Appendbox = driver.findElement(By.id("j_idt88:j_idt91"));
		Appendbox.sendKeys("I am Prince Vegeta");
		
		WebElement disabled = driver.findElement(By.xpath("//*[@id=\"j_idt88\"]/div[3]/div"));
		boolean enabled = disabled.isEnabled();
		System.out.println(enabled);
		
		WebElement Clearbox = driver.findElement(By.id("j_idt88:j_idt95"));
		Clearbox.clear();
		
		WebElement getText = driver.findElement(By.id("j_idt88:j_idt97"));
		String value = getText.getAttribute("value");
		System.out.println(value);
		
		
	}

}
