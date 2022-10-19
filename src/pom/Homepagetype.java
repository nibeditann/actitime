package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepagetype 
{
	@FindBy(id="logoutLink")
	private WebElement logoutLink;
	 
	 @FindBy(xpath = " (//div[@class='menu_icon'])[2]")
	  private WebElement settings;
	 
	 @FindBy(xpath = "//a[.='Types of Work']")
	 private WebElement typework;
	 
	 public Homepagetype(WebDriver driver)
	 {
		 PageFactory.initElements(driver, this);
	 }
	 
	 public void logoutmethod()
	 {
		 logoutLink.click();
	 }
	 
	 public void settingsmethod()
	 {
		 settings.click();
	 }
	 
	 public void typeworkmethod()
	 {
		 typework.click();
	 }
}
