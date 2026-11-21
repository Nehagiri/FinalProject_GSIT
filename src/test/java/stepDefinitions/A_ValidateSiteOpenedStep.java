package stepDefinitions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import base.Base;
import io.cucumber.java.en.*;
import pageObjects.HomePage;
import stepDefinitions.A_ValidateSiteOpenedStep;
import org.testng.Assert;

public class A_ValidateSiteOpenedStep extends Base{
	
	HomePage homepage;
	
	private static final Logger log =
			LogManager.getLogger(A_ValidateSiteOpenedStep.class);
	
	@Given("user is on home page")
	public void user_is_on_home_page() 
	{
		try
		{
		//Thread.sleep(3000);
		//log.debug("URL is "+this.getData("url"));
		getDriver().get(this.getData("url"));
		//log.debug("URL launced");
		getDriver().manage().window().maximize();
		//log.debug("Browser got maximised");
		//Thread.sleep(2000);
		}
		catch(Exception ex)
		{
			log.error("Exception generated "+ ex.getMessage());
		}
	}

	@Then("user verifies the site is opened")
	public void user_verifies_the_site_is_opened() {
		
		try 
		{
			boolean logoPresent= homepage.getLogo().isDisplayed();
			Assert.assertTrue(logoPresent, "The Hindu site is not opened");
			
		}
		catch(Exception ex)
		{
			log.error("Exception generated "+ ex.getMessage());
		}
		
		
	}

	@Then("User navigates to Sport section")
	public void user_navigates_to_sport_section() {
		
		try {
			
			homepage.getSportMenu().click();
		}
		catch(Exception ex)
		{
			log.error("Exception generated "+ ex.getMessage());
		}
	}

	@Then("user verifies if Sport section is opened")
	public void user_verifies_if_sport_section_is_opened() {
		
		try 
		{
			boolean sportSec= homepage.getSportSection().isDisplayed();
			Assert.assertTrue(sportSec, "Sports Sections is not opened");
			
		}
		catch(Exception ex)
		{
			log.error("Exception generated "+ ex.getMessage());
		}
	}
	
	

}
