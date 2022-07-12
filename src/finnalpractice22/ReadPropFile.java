package finnalpractice22;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadPropFile {
	
	public static void main(String[] args) throws IOException
	{
		Properties pr = new Properties();
		
		FileInputStream ip = new FileInputStream("F:\\eclipseworkspace\\finnalpractice2\\src\\finnalpractice22\\aniket.properties");
		
		pr.load(ip);
		
		System.out.println(pr.getProperty("name"));
		
		System.out.println(pr.getProperty("age"));
		
		System.out.println(pr.getProperty("URL"));
		
		System.out.println(pr.getProperty("browser"));
		
	}

}
