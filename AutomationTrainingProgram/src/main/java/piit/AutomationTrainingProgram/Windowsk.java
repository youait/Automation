package piit.AutomationTrainingProgram;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Windowsk {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\15716\\eclipse-workspace\\AutomationTrainingProgram\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.navigate().to("https://www.amazon.com");
		driver.manage().window().maximize();
		Actions ob=new Actions(driver);
		WebElement newreleaseslinks=driver.findElement(By.linkText("New Releases"));
		ob.keyDown(Keys.SHIFT).build().perform();
		newreleaseslinks.click();
		ob.keyUp(Keys.SHIFT).build().perform();
		driver.getWindowHandle();
		Set<String> windowhandles= driver.getWindowHandles();
		Iterator<String> iterators=windowhandles.iterator();
		String parent= iterators.next();
		String secondwindow= iterators.next();
		System.out.println("This is parent window ="+parent);
		System.out.println("This is second window ="+secondwindow);
		driver.switchTo().window(secondwindow);
		WebElement products=driver.findElement(By.linkText("Camera & Photo Products"));
		Thread.sleep(3000);
		products.click();
		
		
		
		
		
		
		
		
	}

}
