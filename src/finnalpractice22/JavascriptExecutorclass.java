package finnalpractice22;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class JavascriptExecutorclass {
	
	public static void main(String[] args) throws IOException
	{
		System.setProperty("webdriver.chrome.driver","F:\\Browesrs\\chrome\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().deleteAllCookies();
		d.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		d.get("https://www.facebook.com");	
		WebElement btn = d.findElement(By.name("login"));
		
		//flash(btn,d);
		drawBorder(btn,d);
		
		String path = "F:\\Browesrs\\Bharat pay\\facebook.png";
		File src = ((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
		File dest = new File (path);
		FileHandler.copy(src, dest);
		
		boolean g = d.findElement(By.name("login")).isDisplayed();
		System.out.println(g);
		
		boolean g1 = d.findElement(By.name("login")).isEnabled();
		System.out.println(g1);
		
		boolean g2 = d.findElement(By.name("login")).isSelected();
		System.out.println(g2);
		
	}
	
	public static void flash(WebElement element,WebDriver d) {
		
		JavascriptExecutor js =  ((JavascriptExecutor)d);
		String bgcolor = element.getCssValue("backgroundColor");
		for(int i=0;i<100;i++)
		{
			changeColor("rgb(0,200,0)",element,d);
			changeColor(bgcolor,element,d);
		}
	}

	public static void changeColor(String color, WebElement element, WebDriver d) {
		
		JavascriptExecutor js =  ((JavascriptExecutor)d);
		js.executeScript("arguments[0].style.backgrouncolor='"+color+"'",element);
		try {
			Thread.sleep(200);
		}catch(InterruptedException e){
			
		}
	}
public static void drawBorder( WebElement element, WebDriver d) {
		
		JavascriptExecutor js =  ((JavascriptExecutor)d);
		js.executeScript("arguments[0].style.border= '3px solid red'", element);

}

}