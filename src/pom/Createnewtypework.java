package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Createnewtypework
{
  @FindBy(xpath = "(//input[@type='text'])[4]")
  private WebElement textfeild;
  
  @FindBy(xpath = "//select[@name='active']")
  private WebElement status;
  
  @FindBy(xpath = "//input[@type='submit']")
  private WebElement creatework;
  
  @FindBy(xpath = "(//input[@type='button'])[1]")
  private WebElement cancelbutton;
  
  
  public Createnewtypework(WebDriver driver)
  
  {
	  PageFactory.initElements(driver, this);
  }
  
  public void textfeildmethod()
  {
	  textfeild.sendKeys("nibedita");
  }
  
  public void statusmethod()
  {
	  status.click();
  }
  
  public void createworkmethod()
  {
	  creatework.click();
  }
  
  public void cancelbuttonmethod()
  {
	  cancelbutton.click();
  }
  
}
