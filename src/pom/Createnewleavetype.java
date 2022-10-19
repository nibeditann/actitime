package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Createnewleavetype
{
 @FindBy(xpath="(//input[@type='text'])[5]")
 private WebElement createnewleave;
 
 @FindBy(xpath = "//span[@class='buttonTitle']")
 private WebElement createleave;
 
 @FindBy(xpath = "(//div[.='Cancel'])[2]")
 private WebElement cancel;
 
 public Createnewleavetype(WebDriver driver) 
 {
	PageFactory.initElements(driver, this); 
 }
 
 public void createnewleave()
 {
	 createnewleave.sendKeys("nibedita");
	 
 }
 
 public void createleave()
 {
	 createleave.click();
 }
 
 public void cancel() 
 {
	 cancel.click();
 }
 
 
 }
 
 
 
 
 
 

