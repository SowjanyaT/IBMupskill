package SeleniumWebdriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Demo1 {

	public static void main(String[] args) throws InterruptedException{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\SOWJANYATHATIKONDA\\Documents\\EFMS - A\\Selenium\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/");
	driver.manage().window().maximize();
	//driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
	driver.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys("Admin");
	driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	
	//driver.quit(); //close all the instance of browsers
	driver.findElement(By.cssSelector("input#btnLogin")).click();
	String ActualTitle=driver.getTitle();
	if("OrangeHRM".equals(ActualTitle))
	{
		System.out.println("If the title is same go and LOGOUT");
		Thread.sleep(3000);
		driver.findElement(By.id("welcome")).click();
		Thread.sleep(3000);
		//driver.findElement(By.linkText("Logout")).click();
		driver.findElement(By.xpath("//*[@id='welcome-menu']/ul/li[2]/a]")).click();
		driver.close();
	}
	else
	{
		System.out.println("This is not same");
		driver.close();
	}
	
	
	
	driver.close();//close the current instance of the browser
	}

}
