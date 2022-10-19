package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Deletecustomer
{
@FindBy(xpath = "(//div[@class='editButton'])[2]")
private WebElement editbutton;

@FindBy(xpath = "(//div[.='ACTIONS'])[1]")
private WebElement actionbutton;

@FindBy(xpath = "(//div[.='Delete'])[2]")
private WebElement delete;

@FindBy(xpath = "//span[.='Delete permanently']")
private WebElement deletepermanet;

@FindBy(xpath = "(//div[.='Cancel'])[2]")
private WebElement cancel;


public Deletecustomer(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}


public void editbutton()
{
	editbutton.click();
}

public void actionbutton() 
{
	actionbutton.click();
}

public void delete() {
	delete.click();
}

public void deletepermanet()
{
	deletepermanet.click();
}

public void cancel()
{
	cancel.click();
}
}
