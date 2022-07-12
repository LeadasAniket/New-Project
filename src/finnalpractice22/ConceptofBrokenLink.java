package finnalpractice22;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConceptofBrokenLink {
	
	public static void main (String[] args) throws MalformedURLException, IOException
	{
		System.setProperty("webdriver.chrome.driver","F:\\Browesrs\\chrome\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().deleteAllCookies();
		d.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		d.get("https://www.facebook.com");
		
		// 1.get the list of all the images and links
		
		List<WebElement>linkList = d.findElements(By.tagName("a"));
		linkList.addAll(d.findElements(By.tagName("img")));
		
		List<WebElement>activeLinks = new ArrayList<WebElement>();
		
		//2.Iterate linklist: exclude all the links/images-doesn't have any href attribute
		
		for(int i = 0;i<linkList.size();i++)
		{
			if(linkList.get(i).getAttribute("href") !=null && (!linkList.get(i).getAttribute("href").contains("javascript"))) {
				
				activeLinks.add(linkList.get(i));
				
			}
				
		}
		//3. get the size of active links list
		System.out.println("size of active liks and images-------->"+activeLinks.size());
		
		for(int j=0;j<activeLinks.size();j++) {
			
			HttpURLConnection connection = (HttpURLConnection)new URL(activeLinks.get(j).getAttribute("href")).openConnection();
			connection.connect();
			String response = connection.getResponseMessage();
			connection.disconnect();
			System.out.println(activeLinks.get(j).getAttribute("href") + "--------->"+response);
		}
		
		
		
		
	}

}
