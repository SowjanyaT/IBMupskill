package SeleniumWebdriver;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo91 {

	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SOWJANYATHATIKONDA\\Documents\\EFMS - A\\Selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http:www.google.com");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Gmail")).sendKeys(Keys.chord(Keys.CONTROL,Keys.RETURN));
		Thread.sleep(3000);
		ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
		System.out.println("NO of tabs  " + tabs.size());
		Thread.sleep(3000);
		 driver.switchTo().window(tabs.get(1));
	        System.out.println(driver.getTitle());
	        driver.switchTo().window(tabs.get(0));
	        System.out.println(driver.getTitle());
	}

}
