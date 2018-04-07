package webAppAutomation.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;





import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import webAppAutomation.base.BasePage;
import webAppAutomation.util.SmavaConstants;

public class LandingPage extends BasePage {
		
		@FindBy(xpath=SmavaConstants.LOGIN)
		public WebElement loginbutton;
	
		@FindBy(xpath=SmavaConstants.LOGIN_USERNAME)
		public WebElement email;
	
		@FindBy(xpath=SmavaConstants.LOGIN_PASSWORD)
		public WebElement password;
	
		@FindBy(xpath=SmavaConstants.SUBMIT)
		public WebElement submitbutton;
		
		@FindBy(xpath=SmavaConstants.ERROR_TEXT)
 		public WebElement errortext;
		
		@FindBy(xpath=SmavaConstants.AMOUNT)
		public WebElement amount;
		
		@FindBy(xpath=SmavaConstants.DURATION)
		public WebElement duration;

		@FindBy(xpath=SmavaConstants.PURPOSE)
		public WebElement purpose;
	
		@FindBy(xpath=SmavaConstants.NEXT)
		public WebElement next;
		
		//Constructor 
		public LandingPage(WebDriver driver){
			
			super(driver);
			
		}

		//Method to verify the unsuccessful login of user with invalid credentials
		public void gotoFailedLoginPage(String email, String password) throws InterruptedException{
			
			System.out.println("Clicking on Anmelden");
			//code to click on Anmelden
			loginbutton.click();
			
			System.out.println("Typing in the invalid email");
			//code to type in E-mail
			this.email.sendKeys(email);
			
			System.out.println("Typing in the invalid password");
			//code to type in Passwort
			this.password.sendKeys(password);
			
			System.out.println("Clicking on Anmelden button to login");
			//code to click on Anmelden
			submitbutton.click();
			
			//Implicit Wait
			driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
			
			//Hamcrest Matchers
			System.out.println("Assertion using Hamcrest matchers");
			
			//Verifying that current url contains the expected url of the webpage
			assertThat(driver.getCurrentUrl(),containsString(SmavaConstants.EXPECTED_URL));
			System.out.println("Verified that webpage url contains the expected url of the webpage");
			
			//Verifying that the error text on page contains the expected errot on webpage
			assertThat(getErrorText(),containsString(SmavaConstants.EXPECTED_ERROR));
			System.out.println("Verified that the error text on page contains the expected errot on webpage");
			
			//Verifying that the webpage title is equal to expected title of webpage
	        assertThat(driver.getTitle(), equalTo(SmavaConstants.EXPECTED_TITLE));
	        System.out.println("Verified that the webpage title is equal to expected title of webpage");
			
	        System.out.println("Verified that user is not able to login because data is not correct");
		}	
		
		
			//Method to get the error Message Text on invalid Login page
			public String getErrorText(){
				String errorMessageText=errortext.getText();
				return errorMessageText;
			}
		
			
			//Method to do Loan Selection 
			public ResultPage doLoanSelection(String selectedAmount, String selectedDuration, String selectedPurpose){
			
			System.out.println("--Test to find the loan offer on provided criterion");
						
			//Clicking on amount field as loan criterion
			System.out.println("Clicking on amount field as loan criterion");
			amount.click();
			
			//Setting the amount as provided
			System.out.println("Setting the amount as provided");
		    driver.findElement(By.xpath(selectedAmount)).click();
		    
		    //Clicking on duration field as loan criterion
			System.out.println("Clicking on duration field as loan criterion");
			duration.click();
			
			//Setting the duration as provided
			System.out.println("Setting the duration as provided");
			driver.findElement(By.xpath(selectedDuration)).click();
			
			//Clicking on purpose field as loan criterion
			System.out.println("Clicking on purpose field as loan criterion");
			purpose.click();
			
			//Setting the purpose as provided
			System.out.println("Setting the purpose as provided");
			driver.findElement(By.xpath(selectedPurpose)).click();
			
			//Clicking on Weiter(next)
			System.out.println("Clicking on Weiter(next) page corresponding to cheapest loan offer");
			next.click();
			
			System.out.println("Loans are displayed on the basis of provided criterion. The cheapest loan offer is selected"
					+ " and the corresponding Result page is opened");
			
			//Using the PageFactory design pattern
			return PageFactory.initElements(driver, ResultPage.class);
			
			
			
	}
			
			
}
			
			


