package webAppAutomation.testcases;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;

import webAppAutomation.pages.LandingPage;
import webAppAutomation.pages.LaunchPage;
import webAppAutomation.testcases.base.BaseTest;
import webAppAutomation.util.SmavaConstants;

public class FailedLoginTest extends BaseTest {
	
	@Before
	//Method to open the browser
	public void OpenBrowser(){
		
		System.out.println("Opening the browser");
		//Opening the browser
		init("Mozilla");
		
	}
	
	
	@Test
	//Method to login to website
	public void doLogin() throws InterruptedException{
	
	System.out.println("**Test started to verify user is not able to login because the data is not correct**");
		
	//Using the PageFactory design pattern
	//This line returns the object of LaunchPage as launchpage
	LaunchPage launchpage=PageFactory.initElements(driver, LaunchPage.class);
	
	//Creating the object of LandingPage
	//Calling the method to open Smava Website
	LandingPage landingpage=launchpage.gotoLandingPage();
	
	//Method to pass in email and password of user
	landingpage.gotoFailedLoginPage(SmavaConstants.email, SmavaConstants.password); 
	
	}
	
	@After
	public void CloseBrowser(){
		
		//Quit the browser
		System.out.println("Quitting the browser");
		driver.quit();
	}
	
}
