package piit.AutomationTrainingProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\15716\\eclipse-workspace\\AutomationTrainingProgram\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.navigate().to("https://jqueryui.com/");
		driver.manage().window().maximize();
		WebElement dragable=driver.findElement(By.linkText("Droppable"));
		dragable.click();
		driver.switchTo().frame(0);//for selenuim we should use this method and count the Iframe as 0
		WebElement ElementToDrag=driver.findElement(By.id("draggable"));
		WebElement dropToHere=driver.findElement(By.id("droppable"));
		Actions ob=new Actions (driver);
		ob.dragAndDrop(ElementToDrag, dropToHere).build().perform();
		driver.switchTo().parentFrame();
		WebElement sorting=driver.findElement(By.linkText("Sortable"));
		sorting.click();
	
		
	}

}
