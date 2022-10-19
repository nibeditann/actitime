package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepageleave
{
    @FindBy(id="logoutLink")
    private WebElement logoutlink;
    
    @FindBy(xpath = " (//div[@class='menu_icon'])[2]")
    private WebElement settings;
    
    @FindBy(xpath = "//a[.='Leave Types']")
    private WebElement leavetype;
    
    public Homepageleave(WebDriver driver) 
    {
    	PageFactory.initElements(driver, this);
    }
    
    public void logoutmethod() 
    {
    	logoutlink.click();
    }
    
    public void settingsmethod() 
    {
    	settings.click();
    }
    
    public void leavetypemethod() 
    {
    	leavetype.click();
    }
}
