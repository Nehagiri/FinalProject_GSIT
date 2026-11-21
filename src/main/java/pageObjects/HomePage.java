package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	
	WebDriver driver;
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By logo=By.xpath("//a/img[@title='The Hindu Logo']");	
	By sportMenu=By.xpath("(//div[@class='menu-nav']/a[contains(text(),'Sport')])[1]");
	By sportSection=By.xpath("//h1[contains(text(),'Sport')]");

	public WebElement getLogo() {
		return driver.findElement(this.logo);
	}
	
	public WebElement getSportMenu() {
		return driver.findElement(this.sportMenu);
	}
	
	public WebElement getSportSection() {
		return driver.findElement(this.sportSection);
	}
	

}
