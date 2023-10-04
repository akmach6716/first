package com.TestComponents;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Properties;
import java.util.logging.FileHandler;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.pageObjects.LandingPage;
public class BaseTest {
	public WebDriver driver ;
	public LandingPage lp;
	public WebDriver initializedriver() throws IOException
	{Properties prop= new Properties();
	  
	    FileInputStream fis= new FileInputStream("C:\\Users\\akmac\\eclipse-workspace\\first\\src\\main\\java\\com\\resources\\globaldata.properties");
	    prop.load(fis);
	  String BrowserName=  prop.getProperty("browser");
		if (BrowserName.equalsIgnoreCase("chrome"))
		{  driver = new ChromeDriver();}
		if (BrowserName.equalsIgnoreCase("headless"))
		{
			ChromeOptions options= new ChromeOptions();
			options.addArguments("headless");
			driver= new ChromeDriver(options);
		}
		driver.get("https://rahulshettyacademy.com/client");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	
		driver.manage().window().maximize();
		return driver;
	}
	public List<HashMap<String, String>> getJsonData() throws IOException
	{
		String jsonContent=FileUtils.readFileToString( new File("C:\\Users\\akmac\\eclipse-workspace\\first\\src\\test\\java\\com\\data\\Errorvalidation.json"),
				StandardCharsets.UTF_8);
		
		   ObjectMapper mapper= new ObjectMapper();
		 List<HashMap<String, String>>  data =mapper.readValue(jsonContent, new TypeReference<List<HashMap<String, String>>>(){ });
		 return data;
		}
		   
	
	public void getScreenshot() throws IOException
	{
		TakesScreenshot ts =(TakesScreenshot)  driver;
	File src	=ts.getScreenshotAs(OutputType.FILE);
	 File destination= new File("C:\\Users\\akmac\\eclipse-workspace\\first\\Reports\\Screenshots\\screenshot1.png");
	 org.openqa.selenium.io.FileHandler.copy(src, destination);
	}
	
	public String getCurrentTime()
	{
		Date date= new Date();
		SimpleDateFormat formatter= new SimpleDateFormat("HH:mm:ss_dd_MM_yyyy");
		 return formatter.format(date);
	}
	@BeforeMethod(alwaysRun = true)
	public LandingPage launchApplication() throws IOException
	{
			driver=initializedriver();
		 lp= new LandingPage(driver); lp.goTo();
			return lp;
	}
	@AfterMethod(alwaysRun = true)
	public void teardown() throws IOException
	{  getScreenshot();
		driver.close();
	}
}
