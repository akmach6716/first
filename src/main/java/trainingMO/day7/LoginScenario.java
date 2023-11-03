package trainingMO.day7;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class LoginScenario {
	WebDriver driver;
	
	@BeforeMethod
	public void setup()
	{
		Reporter.log("Before Method getting exeucted ",true);
		driver= new ChromeDriver();
		driver.get("https://freelance-learn-automation.vercel.app/login");
	}
	@Test
	public void verifyTitle()
	{
		System.out.println(driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains("Automation"),"Title Matched");
	}
	@AfterMethod
	public void teardown()
	{
		Reporter.log("after method is executed ",true);
		driver.quit();
	}
	

}
