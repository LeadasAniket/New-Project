package finnalpractice22;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popuphandling {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\Browesrs\\chrome\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().deleteAllCookies();
		d.get("https://demoqa.com/alerts");
		//Thread.sleep(2000);	
		
		//d.findElement(By.xpath("//button[@id='alertButton']")).click();
		//Thread.sleep(2000);
		
	//	Alert a = d.switchTo().alert();
		//a.accept();
		
		//d.findElement(By.xpath("//button[@id='confirmButton']")).click();
		//Thread.sleep(2000);
		//a.dismiss();
		
		d.findElement(By.xpath("//button[@id='confirmButton']")).click();
		Thread.sleep(2000);
		Alert a = d.switchTo().alert();
		String text = a.getText();
		System.out.println("Printed text is "+"="+ text);
		a.dismiss();
		
		d.quit();
		
		
		
		
		
		
		
		
	}
	}
		
