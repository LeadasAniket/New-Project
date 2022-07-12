package finnalpractice22;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Handledropdown {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","F:\\Browesrs\\chrome\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://ui.freecrm.com/");
		Thread.sleep(3000);
		
		WebElement username = driver.findElement(By.xpath("//input[@name='email']"));
		username.sendKeys("handeaniket376@gmail.com");
		Thread.sleep(3000);

		username.findElement(By.xpath("//input[@name='password']")).sendKeys("Aniket@123");
		Thread.sleep(3000);
		
		username.findElement(By.xpath("//div[text()='Login']")).click();
		Thread.sleep(3000);
		
		//driver.switchTo().frame("downloadFrame");
		username.findElement(By.xpath("//a[@aria-current='page']")).click();
		
		
		username.findElement(By.xpath("//a[text()='Aniket Hande']//parent::td//preceding-sibling::td//div[@class='ui fitted read-only checkbox']")).click();
		Thread.sleep(3000);
	}

}
