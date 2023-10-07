package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SortableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.chrome.webdriver", "C:\\\\Program Files\\\\Java\\\\jdk-17\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.globalsqa.com/demoSite/practice/sortable/connect-lists.html");
		
		//Accessing the web Element.
		List<WebElement> sort = driver.findElements(By.xpath("//*[@id=\"sortable2\"]/li"));
		
		
		WebElement from = sort.get(0);
		WebElement to = sort.get(4);
		
		Actions action = new Actions(driver);
		
		action.clickAndHold(from);
		action.moveToElement(to);
		action.release(to);
		action.build().perform();
	}

}
