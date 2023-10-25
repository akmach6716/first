package AbstractComponent;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Utility { /*
  * Static methods- So that we can use by class name
  * Non static method -By creating object of the class
  */
	public static void WaitForSecond(int Seconds)
	{ System.out.println("LOG:Info -Waiting started");
		try {
			Thread.sleep(1000*Seconds);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}		System.out.println("LOG:Info -Waiting Ended");	}	
	public static WebDriver startBrowser(String BrowserName, String url)
	{
		WebDriver driver=null;
		if(BrowserName.equals("Chrome"))
		{
			driver= new ChromeDriver();
		}else if(BrowserName.equals("Firefox"))
		{
			driver= new FirefoxDriver();
		}else if(BrowserName.equals("Edge"))
				{
			driver= new EdgeDriver();
				}else {System.out.println("Check the browser name"); }
		driver.manage().window().maximize();
		driver.get(url);
		
		
		return driver;
	}

	public static void swithToWindowwithTitle()
	{
		By.user;
	}
}
