package webAppAutomation.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import webAppAutomation.base.BasePage;
import webAppAutomation.util.SmavaConstants;

public class LaunchPage extends BasePage {

	
	//Constructor LaunchPage
	public LaunchPage(WebDriver driver){
		
		super(driver);
		

	}
	
		//Method to Open the Smava website
		public LandingPage gotoLandingPage(){
			
			System.out.println("Opening the Smava website");
			
			//Opening the Smava.de website in the browser
			driver.get(SmavaConstants.HOMEPAGE_URL);
			
			//Maximizing the window
			driver.manage().window().maximize();
			
			//Implicit Wait
			driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
			
			//Using the PageFactory design pattern
			return PageFactory.initElements(driver, LandingPage.class);
			
		}
		
}
