package M.common;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class Utility{
	public WebDriver driver;
  
  @BeforeClass
  public void beforeClass() throws InterruptedException {
	  Browsers("chrome");
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }
  public void Browsers(String window) throws InterruptedException {
	  
	  if (window.equalsIgnoreCase("chrome")){
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\15716\\eclipse-workspace\\AutomationTrainingProgram\\Drivers\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.navigate().to("https://www.facebook.com/");
		  driver.manage().window().maximize();
			Thread.sleep(3000);
		  
	  }else if(window.equalsIgnoreCase("edge")) {
		  System.setProperty("webdriver.edge.driver", "C:\\Users\\15716\\eclipse-workspace\\AutomationTrainingProgram\\Drivers\\msedgedriver.exe");
		  driver=new ChromeDriver();
		  driver.navigate().to("https://www.facebook.com/");
		  driver.manage().window().maximize();
			Thread.sleep(3000);
		  
	  }else if(window.equalsIgnoreCase("Firefox")) {
		  System.setProperty("webdriver.gecko.driver", "C:\\Users\\15716\\eclipse-workspace\\AutomationTrainingProgram\\Drivers\\geckodriver.exe");
		  driver=new ChromeDriver();
		  driver.navigate().to("https://www.facebook.com/");
		  driver.manage().window().maximize();
			Thread.sleep(3000);
		  
	  }
	  
  }

}
