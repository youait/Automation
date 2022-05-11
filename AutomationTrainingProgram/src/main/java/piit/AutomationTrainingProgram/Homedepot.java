package piit.AutomationTrainingProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homedepot {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\15716\\eclipse-workspace\\AutomationTrainingProgram\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.navigate().to("https://www.homedepot.com/");
		driver.manage().window().maximize();
		WebElement myaccount=driver.findElement(By.id("headerMyAccount"));
		myaccount.click();
		Thread.sleep(6000);
		WebElement tregister=driver.findElement(By.xpath("//*[text()='Register']"));
		tregister.click();
		Thread.sleep(6000);
		WebElement PersonelAccount=driver.findElement(By.xpath("//*[text()='Select & Continue']"));
		PersonelAccount.click();
		Thread.sleep(6000);
		WebElement Email=driver.findElement(By.id("email"));
		Email.sendKeys("youssef@youssef.com");
		Thread.sleep(6000);
		WebElement Password=driver.findElement(By.id("password-input-field"));
		Password.sendKeys("Life1765@");
		Thread.sleep(6000);
		WebElement zipcode=driver.findElement(By.id("zipCode"));
		zipcode.sendKeys("44457");
		Thread.sleep(6000);
		WebElement phone=driver.findElement(By.id("phone"));
		phone.sendKeys("5716999253");
		Thread.sleep(6000);
		WebElement recaptcha=driver.findElement(By.className("recaptcha-checkbox goog-inline-block recaptcha-checkbox-unchecked rc-anchor-checkbox recaptcha-checkbox-expired"));
		recaptcha.click();
		Thread.sleep(6000);
		WebElement Creatanaccount=driver.findElement(By.xpath("//*[text()='Create an Account']"));
		Creatanaccount.click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		//Saleem@piit.us
		
	}

}
