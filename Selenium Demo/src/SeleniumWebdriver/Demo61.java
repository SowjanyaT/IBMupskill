package SeleniumWebdriver;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo61 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SOWJANYATHATIKONDA\\Documents\\EFMS - A\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.get("http://newtours.demoaut.com/");
        driver.manage().window().maximize();
        Actions act=new Actions(driver);
        act.sendKeys(Keys.ENTER).perform();
        Thread.sleep(4000);
        //act.sendKeys(Keys.TAB,Keys.TAB,Keys.TAB,Keys.ENTER)act.perform();
	}

}
