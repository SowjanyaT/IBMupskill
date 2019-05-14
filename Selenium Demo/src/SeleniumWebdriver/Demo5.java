package SeleniumWebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Demo5 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SOWJANYATHATIKONDA\\Documents\\EFMS - A\\Selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
		WebElement link=driver.findElement(By.linkText("Car Rentals"));
		Actions MH=new Actions(driver);
		//MH.moveToElement(link).click().build().perform();
		//driver.navigate().back();
		Action mouseover=MH.moveToElement(link).build();
		mouseover.perform();
		Thread.sleep(4000);
		MH.sendKeys(link,(Keys.ENTER)).perform();
		Thread.sleep(4000);
		driver.navigate().back();
	}

}
