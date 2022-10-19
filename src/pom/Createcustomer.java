package pom;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Createcustomer {
public WebDriver driver;
	
	@FindBy(xpath = "(//input[@placeholder='Enter Customer Name'])[2]")
	private WebElement entercustomernameTextfield;
	
	@FindBy(xpath = "//textarea[@placeholder='Enter Customer Description']")
	private WebElement entercustomerdescriptionTextarea;
	
	@FindBy(xpath = "//div[.='Create Customer']")
	private WebElement createcustomerButton;
	
	@FindBy(xpath = "//div[@class='greyButton cancelBtn']")
	private WebElement cancelButton;
	
	public Createcustomer(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void entercustomernameMethod()
	{
		entercustomernameTextfield.sendKeys("ashish");
	}
	
	public void entercustomerdesriptionMethod()
	{
		entercustomerdescriptionTextarea.sendKeys("he is an automation engineer");
	}
	
	public void createcustomerMethod() throws InterruptedException
	{
		createcustomerButton.click();
		Thread.sleep(3000);
	}
	
	public void cancelMethod()
	{
		cancelButton.click();
	}
	
	public void acceptMethod()
	{
		Alert alt=driver.switchTo().alert();
		alt.accept();
	}
	
	public void dismissMethod()
	{
		Alert alt=driver.switchTo().alert();
		alt.dismiss();
	}
}


