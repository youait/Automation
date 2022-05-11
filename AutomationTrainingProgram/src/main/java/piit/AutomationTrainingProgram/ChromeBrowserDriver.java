package piit.AutomationTrainingProgram;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowserDriver {
	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\15716\\eclipse-workspace\\AutomationTrainingProgram\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.navigate().to("https://www.amazon.com");
		driver.manage().window().maximize();//this command is to maximize the secreen. 
		driver.navigate().back();
		Thread.sleep(6000);//to stay 6 second and go forward
		driver.navigate().forward();
		driver.navigate().refresh();
		String ur= driver.getCurrentUrl();
		System.out.println(ur);
	    String windowhandle=driver.getWindowHandle();
	    System.out.println(windowhandle);
	    driver.close();
	
		
		
		
		
		
	}

}
