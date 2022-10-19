package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pom.Createnewtypework;
import pom.Createtypework;
import pom.Homepagetype;
import pom.Loginpage;

public class Actitimetypeofwork {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com");
		
		Loginpage login=new Loginpage(driver);
		login.loginMethod();
		
		Homepagetype hometype=new Homepagetype(driver);
		hometype.settingsmethod();
		hometype.typeworkmethod();
		
		Createtypework createtype=new Createtypework(driver);
		createtype.createtypemethod();
		
		Createnewtypework newwork=new Createnewtypework(driver);
		newwork.textfeildmethod();
		newwork.createworkmethod();
		
		
		hometype.logoutmethod();

	}

}
