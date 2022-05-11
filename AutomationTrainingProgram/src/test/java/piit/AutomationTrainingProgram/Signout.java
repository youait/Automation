package piit.AutomationTrainingProgram;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import M.common.Utility;
import PageObjectModel.ForgotPasswordPage;
import PageObjectModel.Home;

public class Signout extends Utility {
	WebDriver driver;
	
	 @Test(priority=1)
	  public void f() throws InterruptedException, IOException {
		  Home ob=new Home (driver);
		  ob.Email();
		  pictures();
		  ob.PsswordFieldsEnters();
		  ob.FogotLinkClick();
		  Thread.sleep(6000);
		  ForgotPasswordPage id=new ForgotPasswordPage (driver);
		  id.IdsSendKeys();
		  id.SearchButton();
		  Thread.sleep(6000); 
pictures();		  
	  }
	 
	@Test(priority=2,dependsOnMethods ="f")
	  public void Text() throws InterruptedException {
		  driver.navigate().back();
		  Thread.sleep(6000);
		  ForgotPasswordPage id=new ForgotPasswordPage(driver);
		  String Questions=id.QuestioofText();
		  SoftAssert softi=new SoftAssert();
		  AssertJUnit.assertEquals("Please enter your email or mobile number to search for your account.", Questions);
		  System.out.println("This is after assertion");
		  softi.assertAll();
	 }
		  
	  @BeforeClass
	  public void beforeClass() throws InterruptedException {
		  
		  
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\15716\\eclipse-workspace\\AutomationTrainingProgram\\Drivers\\chromedriver.exe");
		 //System.setProperty("webdriver.edge.driver", "C:\\Users\\15716\\eclipse-workspace\\AutomationTrainingProgram\\Drivers\\msedgedriver.exe");
		//  System.setProperty("webdriver.gecko.driver", "C:\\Users\\15716\\eclipse-workspace\\AutomationTrainingProgram\\Drivers\\geckodriver.exe");
		//  driver = new FirefoxDriver();
		driver = new ChromeDriver();
		 // driver=new EdgeDriver();
			driver.navigate().to("https://www.facebook.com/");
			driver.manage().window().maximize();
			Thread.sleep(3000);
	  }

	 
	  
	  public void pictures() throws IOException {
		  Date dt=new Date();
		  System.out.println(dt);
		  File  screenshots = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		  FileHandler.copy(screenshots, new File("C:\\Users\\15716\\eclipse-workspace\\AutomationTrainingProgram\\Pictures\\ShotOfPage.jpg"));
	  }
	
}
