package SeleniumWebdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo3 {

	public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\SOWJANYATHATIKONDA\\Documents\\EFMS - A\\Selenium\\chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			driver.get("https://opensource-demo.orangehrmlive.com/");
			driver.manage().window().maximize();// TODO Auto-generated method stub
			driver.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys("linda.anderson");
			String value=driver.findElement(By.xpath("//*[@id='txtUsername']")).getAttribute("value");
			System.out.println(value);
			driver.findElement(By.id("txtPassword")).sendKeys("linda.anderson");
			driver.findElement(By.id("btnLogin")).click();
			Thread.sleep(2000);
			driver.findElement(By.linkText("Performance")).click();
			//driver.findElement(By.xpath("//*[contains(text(),'Performance']")).click();
			Thread.sleep(2000);
			//driver.findElement(By.partialLinkText("Recru")).click();
			List<WebElement> links= driver.findElements(By.tagName("a"));
			System.out.println(links.size());
			for(WebElement e:links) {
				String linkText=e.getText();
				System.out.println(linkText);
			}
				
			

}
}