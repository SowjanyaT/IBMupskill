package SeleniumWebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class realestate {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SOWJANYATHATIKONDA\\Documents\\EFMS - A\\Selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://realestate.upskills.in/wp-admin/");
		driver.manage().window().maximize();
		driver.findElement(By.name("log")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("admin@123");
		driver.findElement(By.name("login")).click();
	    driver.findElement(By.xpath("//*[contains(text(),'Posts')]")).click();
		driver.findElement(By.xpath("//a[@class='wp-first-item current']")).click();
	//WebElement target=driver.findElement(By.xpath("//*[@name='post[]' and @type='checkbox']"));
	WebElement target=driver.findElement(By.xpath("//table/tbody/tr/th/label/following-sibling::input[@type='checkbox' and @name='post[]']"));
	
	Thread.sleep(3000);
	target.click();
	Thread.sleep(3000);
	
	
	
	//driver.close();		
	}

}
