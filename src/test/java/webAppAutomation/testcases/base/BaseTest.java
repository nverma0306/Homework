package webAppAutomation.testcases.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import webAppAutomation.util.SmavaConstants;

public class BaseTest {
	
	//class variable(static variable)(shared by all instance of the class)
	public WebDriver driver;
	
	public void init(String browserType){
		
		if(browserType=="Mozilla"){
			
		//Setting the path to geckodriver.exe
		System.setProperty("webdriver.gecko.driver", SmavaConstants.MOZILLA_DRIVER_EXE);
				
		//Initializing the new instance of FirefoxDriver
		driver=new FirefoxDriver();
		
		} else if(browserType=="Chrome"){
			
		//Setting the path to chromedriver.exe
		System.setProperty("webdriver.chrome.driver", SmavaConstants.CHROME_DRIVER_EXE);
			
		//Initializing the new instance of ChromeDriver
		driver=new ChromeDriver();
		}
		
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(4000, TimeUnit.SECONDS);
		
		//Maximizing the window
		driver.manage().window().maximize();
			
		
	}
	
	
}
