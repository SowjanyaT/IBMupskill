package SeleniumWebdriver;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SOWJANYATHATIKONDA\\Documents\\EFMS - A\\Selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		
		driver.manage().window().maximize();
		//driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		//WebElement username=driver.findElement(By.name("userName"));
		//if()
			
			
		driver.findElement(By.name("userName")).sendKeys("sunil");
		driver.findElement(By.name("password")).sendKeys("sunil");
		driver.findElement(By.name("login")).click();
		//driver.findElement(By.xpath("//*[@name='login and @value='login']")).click();
		//if(driver.findElement(By.name("userNamse")).isdispalyed(){
			//driver.findelement(By.xpath("//*[@name='password']")).sendkeys("sunil");
		if(driver.findElement(By.xpath("//*[@name='tripType' and @value='roundtrip']")).isSelected())
        {
            driver.findElement(By.xpath("//*[@name='tripType' and @value='oneway']")).click();
				WebElement D = driver.findElement(By.name("passCount"));
				Select se1 = new Select(D);
				List<WebElement> data = se1.getOptions();
				System.out.println(data.size());
				for (int i=0; i<data.size(); i++)
				{	
				System.out.println(data.get(i).getText());
				}
				se1.selectByValue("2");
				WebElement  from = driver.findElement(By.name("fromPort"));
				Select se2 = new Select(from);
				List<WebElement> data2 = se2.getOptions();
				System.out.println(data2.size());
				for (int i=0; i<data2.size(); i++)
				{	
				System.out.println(data2.get(i).getText());
				}
				se2.selectByIndex(2);
				driver.findElement(By.xpath("//*[@name='servClass' and @value='Business']")).click();
				driver.findElement(By.name("findFlights")).click();
				driver.findElement(By.name("reserveFlights")).click();
				driver.findElement(By.name("passFirst0")).sendKeys("sunil");
				driver.findElement(By.name("passLast0")).sendKeys("Kumar");
				driver.findElement(By.name("passFirst1")).sendKeys("Vinay");
				driver.findElement(By.name("passLast1")).sendKeys("Kumar");
				driver.findElement(By.name("creditnumber")).sendKeys("123 234 345");
				List<WebElement> checkbox=driver.findElements(By.name("ticketLess"));
				for (WebElement e:checkbox)
				{
					e.click();
				}
				
			
		}
		
	}
	
}
