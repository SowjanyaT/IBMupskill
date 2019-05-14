package SeleniumWebdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class caststudy {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SOWJANYATHATIKONDA\\Documents\\EFMS - A\\Selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		
		driver.manage().window().maximize();
		String underconsTitle="Under Construction : Merucry Tours";
		List<WebElement> links= driver.findElements(By.tagName("a"));
		String[] linkText=new String [links.size()];
		int i=0;
		for (WebElement e:links)
		{
			linkText[i]=e.getText();
			i++;
		}
		for (String t:linkText)
		{
			driver.findElement(By.linkText(t)).click();
			if(driver.getTitle().equals(underconsTitle))
			{
				System.out.println("\"" + t  + "\" + is Underconstruction");
				
			}
			else
			{
				System.out.println("\"" + t + "\" + is working");
				
			}
			driver.navigate().back();
		}
		driver.quit();
	}

}
