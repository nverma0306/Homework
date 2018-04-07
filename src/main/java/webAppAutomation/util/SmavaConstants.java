package webAppAutomation.util;

public class SmavaConstants {

	//path to mozilla driver
	public static final String MOZILLA_DRIVER_EXE=System.getProperty("user.dir")+"\\geckoDriver\\geckodriver.exe";
			
	//path to chrome driver
	public static final String CHROME_DRIVER_EXE = System.getProperty("user.dir")+"\\chromeDriver\\chromedriver.exe";

	//locators: Fields for invalid login test
	public static final String LOGIN="//*[@class='item login-popup uppercase']";
	public static final String LOGIN_USERNAME= "//*[@id='signonForm.email']";
	public static final String LOGIN_PASSWORD= "//*[@id='signonForm.password']";
	
	//Locators: Buttons for invalid login test
	public static final String SUBMIT= "//*[@type='submit']";
	
	//Data for invalid login test
	public static final String email="InvalidEmail@gmail.com";
	public static final String password="Invalidpassword123!";

	//URL of Smava and invalid login
	public static String HOMEPAGE_URL="http://www.smava.de";
	public static final String EXPECTED_URL="2+Sicheres-Einloggen-mit-Zugangsdaten.html";
	
	//Text for invalid login verification
	public static final String EXPECTED_TITLE="Sicheres Einloggen mit Zugangsdaten - smava.de";
	public static final String EXPECTED_ERROR="Ihre Angaben zum Einloggen sind ungültig.";
	public static final String ERROR_TEXT = "//*[@class='box-inner']/ul/li";

	//Xpath for Loan Selection criterion
	public static final String AMOUNT= "//*[@id='myselect']";
	public static final String DURATION= "//*[@id='myselect2']";
	public static final String PURPOSE= "//*[@id='myselect3']";
	public static final String NEXT="//*[@id='loanSelectionForward']";

	//Chosen value for Loan Selection
	public static final String CHOSEN_AMOUNT = "//*[@data-value='2750']";
	public static final String CHOSEN_DURATION = "//*[@data-value='24']";
	public static final String CHOSEN_PURPOSE = "//*[@data-value='886']";
	
	//Result Page verification
	public static final String EXPECTED_TITLE_RESULTPAGE="smava Kreditantrag";
	public static final String EXPECTED_URL_RESULTPAGE="https://www.smava.de/kreditanfrage/kreditantrag.html";
			
			
	

}
	