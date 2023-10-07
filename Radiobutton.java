package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radiobutton {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Program Files\\Java\\jdk-17\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/radio.xhtml;jsessionid=node0br6tg2rl0garqwbr1l7m347h2938.node0");
		//1.Select the radio button.
		WebElement safari = driver.findElement(By.xpath("//*[@id=\'j_idt87:console1\']/tbody/tr/td[3]/div/div[2]/span"));
		safari.click();
		
		//2. Finding out the default radio button.
		WebElement First  = driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/form/div/div[2]/div[1]/div/div/table/tbody/tr/td[3]/div/div[2]"));
		//WebElement Second = driver.findElement(By.xpath("//*[@id=\'j_idt87:console2\']/tbody/tr/td[4]/div/div[2]"));
		WebElement Third  = driver.findElement(By.xpath("//*[@id=\'j_idt87:console2\']/tbody/tr/td[1]/div"));
		//WebElement Fourth = driver.findElement(By.xpath("//*[@id=\"j_idt87:console2\"]/tbody/tr/td[4]/div/div[2]"));
		
		boolean stats1 =  First.isSelected();
		//boolean stats2 = Second.isSelected();
		boolean stats3 = Third.isSelected();
		//boolean stats4 = Fourth.isSelected();

		System.out.println(stats1);
		//System.out.println(stats2);
		System.out.println(stats3);
		//System.out.println(stats4);

		if (stats3) {
			System.out.println("You have done it correctly its the dedfault one");
		}
		else {
			System.out.println("Wrong selection");
		}
		
		
	}

}
