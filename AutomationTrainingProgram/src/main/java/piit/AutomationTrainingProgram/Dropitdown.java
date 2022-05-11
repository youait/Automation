package piit.AutomationTrainingProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropitdown {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\15716\\eclipse-workspace\\AutomationTrainingProgram\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement CreatAnAccount=driver.findElement(By.xpath("//*[text()='Create new account']"));//go to Chropath and copy the linktext.
		CreatAnAccount.click();
		Thread.sleep(6000);
		WebElement month=driver.findElement(By.name("birthday_month"));
		Select ob=new Select (month);
		ob.selectByValue("10");
		WebElement day=driver.findElement(By.name("birthday_day"));
		Select ob6=new Select (day);
		ob6.selectByVisibleText("13");
		
		
		
		
	}

}
