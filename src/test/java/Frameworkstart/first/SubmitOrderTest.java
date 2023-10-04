package Frameworkstart.first;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.TestComponents.BaseTest;
import com.pageObjects.BillingAddresspage;
import com.pageObjects.Cartseactionpage;
import com.pageObjects.ConfirmationPage;
import com.pageObjects.LandingPage;
import com.pageObjects.OrderHistorypage;
import com.pageObjects.Products;
public class SubmitOrderTest  extends BaseTest{	
	//public WebDriver driver;
	String productname="adidas original";	
	@Test
	public void submitorder() throws IOException {
		Products pr=  lp.loginApplication("aditya.kumar@gmail.com", "Password@123");
		
			pr.addTocart(); 
			pr.gettextformessage();   
			Cartseactionpage csp=pr.carticonclick();			
	  String actualproductname= csp.gettextcapture(); 			
	//Assert.assertEquals(actualproductname, productname);
	BillingAddresspage bapage=csp.checkoutclick(); 
	 bapage.selectthecountry();  
	 ConfirmationPage cfp=bapage.placeOrder();	
	String expectedmessage="THANKYOU FOR THE ORDER.";
	//String actualmessage =  cfp.getheadingText();
	//String actualmessage =  
	//Assert.assertEquals(actualmessage, expectedmessage);
	//System.out.println(actualmessage);

}

/*
 * @Test(dependsOnMethods = {"submitorder"} ) public void orderHistorytest() {
 * lp.loginApplication("aditya.kumar@gmail.com", "Password@123");
 * OrderHistorypage ohp=lp.orderhistoryclick(); String actualname=
 * ohp.getprodcutname(); Assert.assertEquals(actualname, productname);
 * 
 * }
 */
	@Test(dependsOnMethods = {"submitorder"} )
	public void carttotalcheck()
	{
		//lp.loginApplication("aditya.kumar@gmail.com", "Password@123");
		Cartseactionpage csp=lp.cartheaderclick();
		System.out.println(csp.sumtheTotal());
		System.out.println(csp.gettheTotalinInt());
		
	Assert.assertEquals(csp.sumtheTotal(), csp.gettheTotalinInt());
		
		
	}
	
	
}
