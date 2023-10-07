package selenium;

import org.openqa.selenium.Point;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


public class Buttonedit {
	public static void main(String[] args) {
		//1. Open web browser
		//System.setProperty("webdriver.chrome.driver",
				//"C:\\Program Files\\Java\\jdk-17\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
				System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\Java\\jdk1.8.0_361\\geckodriver.exe");
				WebDriver driver = new FirefoxDriver();
		        driver.get("https://www.leafground.com/button.xhtml");
		
		//2. Get the position of the webElement.
		WebElement getPosition = driver.findElement(By.id("j_idt88:j_idt94"));
	    Point xypoint = getPosition.getLocation();
	    //getLocation - gives the X and Y coordinates of the web element present in the web page.
		double Xvalue = xypoint.getX();
		double Yvalue = xypoint.getY();
		System.out.println("X value is: " + Xvalue + ""
				+ " and Y value is: " + Yvalue);
		
		//3.Find the color of the button.
		WebElement colorButton = driver.findElement(By.id("j_idt88:j_idt100"));
		String value = colorButton.getCssValue("background-color");
		System.out.println("Button color is : " + value);
		
		//4.Find the size if it denotes height and width.
		WebElement size = driver.findElement(By.xpath("//*[@id=\'j_idt88:j_idt98\']/span[2]"));
		int height = size.getSize().getHeight();
		//Gives the size i.e.,  height and width of the web element.
		int width = size.getSize().getWidth();
		System.out.println("The height and width is: " + height + width);
		
		//5.Go to next homePage
		driver.findElement(By.xpath("//*[@id=\'j_idt88:j_idt90\']/span")).click();
		
	}

}
