package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Createtypework 
{
  @FindBy(xpath = "//span[@unselectable='on']")
  private WebElement createtype;
  
  @FindBy(xpath = "//input[@value='Show Types of Work']")
  private WebElement showtypework;
  
  public Createtypework(WebDriver driver)
  {
	  PageFactory.initElements(driver, this);
  }
  
  public void createtypemethod()
  {
	  createtype.click();
  }
  
  public void showtypeworkmethod()
  
  {
	  showtypework.click();
  }
}
