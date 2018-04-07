package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Screenshot_ex
{
	public static WebDriver w;
	public static void screenshot() throws IOException
	{
	

		//w.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		
		File src =((TakesScreenshot)w).getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(src,new File("C:\\Users\\pratiksha\\workspace\\maventestng\\src" + "\\main\\resources\\screenshots\\screen.png"));
		System.out.println("Screenshot taken sucessfully");
	}
	 
	 
	 
}
