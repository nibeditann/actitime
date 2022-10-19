package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pom.Createcustomer;
import pom.Deletecustomer;
import pom.Homepage;
import pom.Loginpage;
import pom.Taskpage;

public class Deletecreatecustomer {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com");
		
		Loginpage log=new Loginpage(driver);
		log.loginMethod();
		
		Homepage home=new Homepage(driver);
		home.Taskmethod();
		
		Taskpage task=new Taskpage(driver);
		task.addnewMethod();
		task.newcustomerMethod();
		
		Createcustomer customer=new Createcustomer(driver);
		customer.entercustomernameMethod();
		customer.entercustomerdesriptionMethod();
		customer.createcustomerMethod();
		customer.acceptMethod();
		
		Deletecustomer delete=new Deletecustomer(driver);
		delete.editbutton();
		delete.actionbutton();
		delete.delete();
		delete.deletepermanet();
		
		
				
		
		
		
		home.logoutMethod();
		
		
		
		
		
		
				

	}

}
