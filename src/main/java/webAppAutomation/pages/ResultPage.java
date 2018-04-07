package webAppAutomation.pages;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.equalTo;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import webAppAutomation.base.BasePage;
import webAppAutomation.util.SmavaConstants;

public class ResultPage extends BasePage {
	
	public ResultPage(WebDriver driver){
		
		super(driver);
	
	}
	
	//Method to Verify correct result page is opened
	public void VerifyResultPage(){
		
		System.out.println("--Test to verify that correct result page is loaded");
		
		//Storing the title of the webpage
		String currentTitle=driver.getTitle();
		
		//Printing the title of webpage
		System.out.println("Current webpage Title: "+currentTitle);
		
		//Verifying that the webpage title is equal to expected title of webpage
        assertThat(currentTitle,equalTo(SmavaConstants.EXPECTED_TITLE_RESULTPAGE));
        System.out.println("Verified that the webpage title is equal to expected title of webpage for Result Page");
		
		//Storing the currentURL of the webpage
		String currentURL=driver.getCurrentUrl();
		
		//Printing the title of webpage
		System.out.println("Current webpage ur is: "+currentURL);
		
		//Verifying that the webpage URL is equal to expected URL of webpage for Result Page
		assertThat(currentURL,containsString(SmavaConstants.EXPECTED_URL_RESULTPAGE));
        System.out.println("Verified that the current webpage URL is equal to expected URL of webpage for Result Page");

              
	}
	
	 //Method to verify that webpage is completely loaded
	 public void verifyPageIsCompletelyLoaded() {
		  
		 System.out.println("--Test to verify that result page is completely loaded");
		 
		  JavascriptExecutor js = (JavascriptExecutor)driver;	  
		  
		  //Initially below given if condition will check ready state of page.
		  if (js.executeScript("return document.readyState").toString().equals("complete")){ 
		   System.out.println("Page Is completely loaded before any wait time.");
		   return; 
		  } 
		  
		  //This loop will rotate for 2 times to check If page Is ready after every 5 second.
		  //You can replace your value with any number, If you wants to Increase or decrease wait time.
		  for (int i=0; i<2; i++){ 
		   try {
		    Thread.sleep(5000);
		    }catch (InterruptedException e) {} 
		   
		   //To check page ready state.
		   if (js.executeScript("return document.readyState").toString().equals("complete")){ 
			   System.out.println("Page Is completely loaded after wait time");
		    break; 
		   }   
		  }
		 }
	 
}
	
