package piit.AutomationTrainingProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flights {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\15716\\eclipse-workspace\\AutomationTrainingProgram\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.navigate().to("https://www.expedia.com/");
		driver.manage().window().maximize();
		WebElement departure=driver.findElement(By.id("d1-btn"));
		departure.click();
		Thread.sleep(6000);
		WebElement departureToDate=driver.findElement(By.xpath("//*[@aria-label='May 16, 2022']"));
		departureToDate.click();
		Thread.sleep(6000);
		WebElement returnToDate=driver.findElement(By.xpath("//*[@aria-label='Jun 24, 2022']"));
		returnToDate.click();
		WebElement done=driver.findElement(By.tagName("button"));
		done.click();
		
		
		
		
		
		
		
		
		
	}

}
