package SeleniumWebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class casestudy2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SOWJANYATHATIKONDA\\Documents\\EFMS - A\\Selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		WebElement link=driver.findElement(By.linkText("Performance"));
		link.click();
		Actions MH=new Actions(driver);
		MH.moveToElement(link).click().build().perform();
		driver.findElement(By.linkText("Configure")).click();
		WebElement link1=driver.findElement(By.linkText("KPIs"));
		Action mouseover=MH.moveToElement(link1).click().build();
		mouseover.perform();
		
	}

}
