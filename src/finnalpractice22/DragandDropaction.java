package finnalpractice22;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDropaction {

	public static void main (String[] args)
	{
		
		System.setProperty("webdriver.chrome.driver","F:\\Browesrs\\chrome\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().deleteAllCookies();
		d.get("https://jqueryui.com/droppable");
		d.switchTo().frame(0);
		
		Actions action = new Actions(d);
		action.clickAndHold(d.findElement(By.xpath("//div[@id='draggable']")))
		.moveToElement(d.findElement(By.xpath("//div[@id='droppable']")))
		.release()
		.build()
		.perform();
		
	}
	
	
	
	
	
	
	
	
}
