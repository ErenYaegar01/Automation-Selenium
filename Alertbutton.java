package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Alertbutton {

	public static void main(String[] args) throws InterruptedException  {
		
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\Java\\jdk1.8.0_361\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.leafground.com/alert.xhtml");
		
		//1. Simple Alert.
		Thread.sleep(3000);
		WebElement alert = driver.findElement(By.xpath("//*[@id=\'j_idt88:j_idt91\']/span[2]"));
		alert.click();
		Alert alert0 = driver.switchTo().alert();
		alert0.accept();
		
		Thread.sleep(3000);
		//2. Access COnfirm Dialog box.
		WebElement alert1 = driver.findElement(By.xpath("//*[@id=\'j_idt88:j_idt93\']/span[2]"));
		alert1.click();
		Alert confirm = driver.switchTo().alert();
		confirm.accept();
		Thread.sleep(3000);
		
		//3. Accessing the prompt dialogue  box.
		WebElement alert3 = driver.findElement(By.xpath("//*[@id=\'j_idt88:j_idt104\']/span[2]"));
		alert3.click();
		Alert prompt = driver.switchTo().alert();
		prompt.sendKeys("Hey you You too make a difference!!");
		prompt.accept();
		
	}
}
