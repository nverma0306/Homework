package webAppAutomation.testcases;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;

import webAppAutomation.pages.LandingPage;
import webAppAutomation.pages.LaunchPage;
import webAppAutomation.pages.ResultPage;
import webAppAutomation.testcases.base.BaseTest;
import webAppAutomation.util.SmavaConstants;


public class LoanSelectionTest extends BaseTest{
	
	@Before
	//Method to open the browser
	public void OpenBrowser(){
		
		System.out.println("Opening the browser");
		//Opening the browser
		init("Mozilla");
	}
	
	@Test
	//Method to find loan offer on basis of criterion and verify that result page is completely loaded when clicking on Weiter(next)
	public void loanSelection(){
		
	System.out.println("**Test started to find loan offer on the basis of provided criteion and verify that result page is completely loaded**");
	
	//Using the PageFactory design pattern
	//This line returns the object of LaunchPage as launchpage
	LaunchPage launchpage=PageFactory.initElements(driver, LaunchPage.class);
	
	//Creating the object of LandingPage
	//Calling the method to open Smava Website
	LandingPage landingpage=launchpage.gotoLandingPage();
	
	//Creating the object of ResultPage
	//Calling the method to perform loan selection
	ResultPage resultpage=landingpage.doLoanSelection(SmavaConstants.CHOSEN_AMOUNT, SmavaConstants.CHOSEN_DURATION,SmavaConstants.CHOSEN_PURPOSE);
	
	//Verifying that correct result page is loaded
	resultpage.VerifyResultPage();
	
	//Verifying that result page is completely loaded
	resultpage.verifyPageIsCompletelyLoaded();
	
	
	}
	
	@After
	public void CloseBrowser(){
		//Quit the browser
		System.out.println("Quitting the browser");
		driver.quit();
	}
	
}