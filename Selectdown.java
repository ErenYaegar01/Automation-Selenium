package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class Selectdown {
	public static void main(String[] args) {
		//1. To open a browser.
		System.setProperty("webdriver.chrome.driver",
				"C:\\Program Files\\Java\\jdk-17\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		
		WebElement Downdrop = driver.findElement(By.id("course"));
		Select select = new Select(Downdrop);
		select.selectByIndex(1);
		Downdrop.sendKeys("Playwright");
//		select.selectByValue("python");
		
//		List <WebElement> options =select.getOptions();
//		int size = options.size();
//		System.out.println("The number of options present is : " + size);
//		dropUp1.sendKeys("Cypress");
		
		List <WebElement> number = select.getOptions();
		int size =  number.size();
		System.out.println("The number of options available here is: " + size);
		
		// To select multiple options .
		WebElement multiple = driver.findElement(By.id("ide"));
		Select various = new Select(multiple);
		various.selectByIndex(0);
		various.selectByIndex(1);
		various.selectByIndex(2);
		various.selectByIndex(3);
	}

}
