package piit.AutomationTrainingProgram;

import org.testng.annotations.Test;

import M.common.Utility;

import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;

public class Browsersd extends Utility {
	
  @Test
  public void f() throws InterruptedException {
	  WebElement id=driver.findElement(By.name("email"));
	  id.sendKeys("selim@piit.com");
	  Thread.sleep(3000);
	  WebElement password=driver.findElement(By.name("pass"));
	  password.sendKeys("Youssef1987@");
	  Thread.sleep(3000);
	  WebElement Loginbutton=driver.findElement(By.name("login"));
	  Loginbutton.click();
  }
  
}
