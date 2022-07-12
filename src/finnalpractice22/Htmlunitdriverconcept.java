package finnalpractice22;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;


public class Htmlunitdriverconcept {
	
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","F:\\Browesrs\\chrome\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver d = new HtmlUnitDriver();
		d.manage().window().maximize();
		d.manage().deleteAllCookies();
		d.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		d.get("https://ui.cogmento.com");
		System.out.println(d.getTitle());
		
		
	}

}
