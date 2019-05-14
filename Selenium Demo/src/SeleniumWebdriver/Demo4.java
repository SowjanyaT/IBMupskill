package SeleniumWebdriver;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo4 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SOWJANYATHATIKONDA\\Documents\\EFMS - A\\Selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		
		driver.manage().window().maximize();
		List<WebElement> links= driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		for(WebElement e:links) {
			String linkText=e.getText();
			System.out.println(linkText);	

		}
		
		ArrayList<String> links1=new ArrayList<String>();
		links1.add("Home");
		links1.add("Flights");
		links1.add("Hotels");
		links1.add("Car Rentals");
		links1.add("Cruises");
		links1.add("Destinations");
		links1.add("Vacations");
		String underConstructionLinks="";
		String SuccessfullyLoadingLinks="";
		for (String linkName : links1) {
		
			driver.findElement(By.linkText(linkName)).click();
			if(driver.getTitle().contains("Under Construction")) {
				underConstructionLinks=underConstructionLinks.concat(linkName+" ");
			}
			else {
				SuccessfullyLoadingLinks=SuccessfullyLoadingLinks.concat(linkName+" ");
			}	
		
		}
		System.out.println("Under Construction linlks are "+ underConstructionLinks);
		System.out.println("Succesfully Loading links are "+ SuccessfullyLoadingLinks);
		}
		
		
	}
