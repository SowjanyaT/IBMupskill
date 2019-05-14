package SeleniumWebdriver;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class demo9 {

	public static void main(String[] args) throws AWTException,InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SOWJANYATHATIKONDA\\Documents\\EFMS - A\\Selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://realestate.upskills.in/wp-admin/");
		driver.manage().window().maximize();
		driver.findElement(By.name("log")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("admin@123");
		driver.findElement(By.name("login")).click();
		WebElement link=driver.findElement(By.xpath("//*[contains(text(),'Howdy')]"));
		Actions act=new Actions(driver);
		act.contextClick(link).build().perform();
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(3000);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		robot.keyPress(KeyEvent.VK_CONTROL);
		Thread.sleep(3000);
		robot.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(300);
		System.out.println(driver.getCurrentUrl());
		
		
		
		
		
	
		
		}

}
