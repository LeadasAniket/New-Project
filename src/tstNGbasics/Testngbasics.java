package tstNGbasics;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Testngbasics {
	
	WebDriver d ;
	
	@BeforeMethod
	public void setup(){
		
		System.setProperty("webdriver.chrome.driver","F:\\Browesrs\\chrome\\chromedriver_win32 (2)\\chromedriver.exe");
		d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().deleteAllCookies();
		d.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		d.get("https://www.facebook.com/aniket.hande.52");
	}
	
	@Test
	public void Facebooktest() {
		
		String w  = d.getTitle();
		System.out.println("Facebook page title is ="+w);
	}
	
	@Test
	public void Isselected() {
		
		boolean c = d.findElement(By.linkText("Forgotten account")).isDisplayed();
		System.out.println("Is Forgotten account is Displayed ? = "+ c );	
	}
	@Test
	public void Islogoisdisplayed() {
		
		boolean f = d.findElement(By.xpath("//a[@aria-label='Facebook']")).isDisplayed();
		System.out.println("Is facebooklogo is displayed? ="+ f );
	}
	@AfterMethod
	public void quitfrombrowser(){
		
		d.close();
		System.out.println("Browser is get closed");
		d.quit();	
	}

}