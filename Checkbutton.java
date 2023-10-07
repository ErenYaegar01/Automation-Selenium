package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbutton {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Program Files\\Java\\jdk-17\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/checkbox.xhtml;jsessionid=node010nx464jtc8vzxsmrg4fp0yu9138.node0");
		
		//1.Simple Check Box.
		WebElement basic = driver.findElement(By.xpath("//*[@id=\'j_idt87:j_idt89\']/div[2]"));
		basic.click();
		
		WebElement Notify = driver.findElement(By.xpath("//*[@id=\'j_idt87:j_idt91\']/div[2]"));
		Notify.click();
		
		
		
	}

}
