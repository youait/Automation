package piit.AutomationTrainingProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\15716\\eclipse-workspace\\AutomationTrainingProgram\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.navigate().to("https://www.amazon.com");
		driver.manage().window().maximize();
		WebElement Searchfieldtxt= driver.findElement(By.name("field-keywords"));
		Searchfieldtxt.sendKeys("computer");
		WebElement searchicon= driver.findElement(By.id("nav-search-submit-button"));
		searchicon.click();
		WebElement linktx= driver.findElement(By.linkText("Registry"));
		linktx.click();
		
		
		
		
  }

 }
