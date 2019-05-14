package SeleniumWebdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class case1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SOWJANYATHATIKONDA\\Documents\\EFMS - A\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.get("http://newtours.demoaut.com/");
        driver.manage().window().maximize();
        String underconsTitle = "Under Construction:Mercury Tours";
        List<WebElement> link = driver.findElements(By.tagName("a"));
        String[] linktext = new String[link.size()];
        int i=0;
        //Extract the link Text of each link Elements
        for(WebElement e:link)
        {
            linktext[i]=e.getText();
            i++;
        }
        // Test weather each link is working or not working
        for(String t:linktext)
        {
            driver.findElement(By.linkText(t)).click();
            if(driver.getTitle().equals(underconsTitle))
            {
                System.out.println("\"" + t+ "\"" + "\" + is underconstruction");
            }
            else
            {
                System.out.println("\"" + t+ "\"" + "\" + is working");
            }
            driver.navigate().back();
        }
driver.quit();
    }
}


