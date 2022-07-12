package finnalpractice22;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Finalsceenshot {
	
	public static void main(String[] args) throws IOException, InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "F:\\Browesrs\\chrome\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().deleteAllCookies();
		d.get("https://www.flipkart.com");
		
		String path = "F:\\Browesrs\\Bharat pay\\flipart.png";
		File src = ((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
		File dest = new File (path);
		FileHandler.copy(src, dest);
		Thread.sleep(2000);
	}

}
