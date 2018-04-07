package testscripts;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;
import org.testng.annotations.Test;

import utility.Screenshot_ex;

public class Rediff_login extends Screenshot_ex
{
	Properties prop=new Properties();
	
	public static WebDriver w;
	@Test
	public void login() throws IOException
	{
		
	    FileInputStream fis1 = new FileInputStream("C:\\Users\\pratiksha\\workspace\\maventestng\\src\\main\\resources\\DataMap\\data.property");
	    
	    FileInputStream fis2 = new FileInputStream("C:\\Users\\pratiksha\\workspace\\maventestng\\src\\main\\resources\\ObjectRepository\\ui.property");
	    
		System.setProperty("webdriver.chrome.driver","C:\\Users\\pratiksha\\Desktop\\Jar Files\\chromedriver_win32\\chromedriver.exe");
		w = new ChromeDriver();
		
		prop.load(fis1);
		prop.load(fis2);
		
		w.get(prop.getProperty("url"));
		
		Screenshot_ex.screenshot();
		
	    //w.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		
		//w.findElement(By.xpath("//*[@id='login1']")).sendKeys("abz@");
		w.findElement(By.cssSelector(prop.getProperty("user_css"))).sendKeys("abc");
		w.findElement(By.xpath(prop.getProperty("pwd_Xpath"))).sendKeys("Prati");
		
		//w.findElement(By.
		//w.findElement(By.name("proceed")).click();
		
		//customized css
		
		w.findElement(By.cssSelector("[name='proceed']")).click();
		
		
		
		//w.navigate().back();
		
		//w.findElement(By.partialLinkText("Forgot")).click();
		
		
		
		
	}

}
