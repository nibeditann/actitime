package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Createleavetype
{
 @FindBy(xpath = "//span[.='Create Leave Type']")
 private WebElement createleavetype;
 
 public Createleavetype(WebDriver driverr) 
 {
	 PageFactory.initElements(driverr, this);
 }
 
 public void craeteleavetype() {
	 createleavetype.click();
 }

}
