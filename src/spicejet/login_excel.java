package spicejet;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;


@Test
public class login_excel {
	System.setProperty("webdriver.chrome.driver", ".//driver//chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.spicejet.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	WebElement Loginlink= driver.findElement(By.id("ctl00_HyperLinkLogin"));
	WebElement Spice= driver.findElement(By.xpath("//a[text()='SpiceClub Members']"));
	Thread.sleep(1000);
	   WebElement Member= driver.findElement(By.xpath("//li[@class='hide-mobile']//ul//li//a[text()='Member Login']"));
	Actions ac=new Actions(driver);
	ac.moveToElement(Loginlink).build().perform();
	Thread.sleep(2000);
	ac.moveToElement(Spice).build().perform();
	Thread.sleep(2000);
	ac.moveToElement(Member).click().build().perform();
	WebElement mobile= driver.findElement(By.xpath("//div[@class='intl-tel-input allow-dropdown separate-dial-code']//input[@id='ControlGroupLoginView_MemberLoginView2LoginView_TextBoxUserID']"));
	WebElement pass= driver.findElement(By.xpath("//div[@class='sc-credential-login']//input[@id='ControlGroupLoginView_MemberLoginView2LoginView_PasswordFieldPassword']"));
	WebElement Login= driver.findElement(By.xpath("//input[@id='ControlGroupLoginView_MemberLoginView2LoginView_ButtonLogIn']"));
	mobile.sendKeys(phonenumber);
	pass.sendKeys(password);
	Login.click();
}
}


public void readExcel()
{
	
	
	
	
}