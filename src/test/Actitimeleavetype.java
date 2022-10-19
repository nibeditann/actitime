package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pom.Createleavetype;
import pom.Createnewleavetype;
import pom.Homepage;
import pom.Homepageleave;
import pom.Loginpage;

public class Actitimeleavetype {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com");
		
		Loginpage login=new Loginpage(driver);
		login.loginMethod();
		
		Homepageleave leave=new Homepageleave(driver);
		leave.settingsmethod();
		leave.leavetypemethod();
		
		Createleavetype leavetyp=new Createleavetype(driver);
		leavetyp.craeteleavetype();
		
		Createnewleavetype newleave=new Createnewleavetype(driver);
		newleave.createnewleave();
		newleave.createleave();
		
	
		
		leave.logoutmethod();
}

}
		
		
		
		
		



