package piit.AutomationTrainingProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pizzahut {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\15716\\eclipse-workspace\\AutomationTrainingProgram\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.navigate().to("https://www.pizzahut.com/");
		driver.manage().window().maximize();
		WebElement Menu=driver.findElement(By.id("menu"));
		Menu.click();
		Thread.sleep(3000);
		WebElement Pizza= driver.findElement(By.className("jss10"));
		Pizza.click();
		Thread.sleep(6000);
		WebElement PopularPizzas=driver.findElement(By.linkText("Popular Pizzas"));
		PopularPizzas.click();
		Thread.sleep(3000);
		WebElement Ordernow=driver.findElement(By.xpath("//*[@class='btn btn-primary btnModal']"));
		Ordernow.click();
		Thread.sleep(3000);
		WebElement delivery=driver.findElement(By.xpath("//*[@class='center-block icon-delivery-default']"));
		delivery.click();
		Thread.sleep(3000);
		WebElement address=driver.findElement(By.id("syo-address1"));
		address.sendKeys("4567 culombia pike");
		Thread.sleep(3000);
		WebElement aptsuit=driver.findElement(By.id("address2"));
		aptsuit.sendKeys("apt23");
		Thread.sleep(3000);
		WebElement city=driver.findElement(By.id("city"));
		city.sendKeys("alexandria");
		Thread.sleep(3000);
		WebElement states=driver.findElement(By.id("state"));
		states.sendKeys("virginia");
		Thread.sleep(3000);
		WebElement zip=driver.findElement(By.id("zip-input"));
		zip.sendKeys("22203");
		Thread.sleep(3000);
		WebElement findastore=driver.findElement(By.id("ph-find-store"));
		findastore.click();
		
	}

}
