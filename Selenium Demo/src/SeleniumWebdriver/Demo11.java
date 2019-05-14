package SeleniumWebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo11 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SOWJANYATHATIKONDA\\Documents\\EFMS - A\\Selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("file:///C:/Users/SOWJANYATHATIKONDA/Desktop/one.html");
		driver.manage().window().maximize();
		System.out.println(driver.findElement(By.xpath("//table/tbody/tr[2]/td[1]")).getText());
		System.out.println(driver.findElement(By.xpath("//table/tbody/tr[2]/td[1]//following-sibling::td[3]")).getText());
	    System.out.println(driver.findElement(By.xpath("//table/tbody/tr[2]//parent::tr//parent::td/following-sibling::td[2]")).getText());
	}

}
