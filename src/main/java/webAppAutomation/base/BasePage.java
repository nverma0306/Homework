package webAppAutomation.base;

import org.openqa.selenium.WebDriver;

public class BasePage {

	public WebDriver driver;

	public BasePage(){
		
	}
	
	public BasePage(WebDriver driver){
		this.driver=driver;
		
	}
}
