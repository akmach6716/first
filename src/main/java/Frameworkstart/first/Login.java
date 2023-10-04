package Frameworkstart.first;
import java.time.Duration;
import java.util.List;

import javax.security.auth.callback.ConfirmationCallback;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.pageObjects.BillingAddresspage;
import com.pageObjects.Cartseactionpage;
import com.pageObjects.ConfirmationPage;
import com.pageObjects.LandingPage;
import com.pageObjects.Products;
public class Login {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));		driver.manage().window().maximize();
//driver.get("https://rahulshettyacademy.com/client");driver.findElement(By.id("userEmail")).sendKeys("aditya.kumar@gmail.com");		driver.findElement(By.id("userPassword")).sendKeys("Password@123");  driver.findElement(By.id("login")).click();//landingpage
		LandingPage lp= new LandingPage(driver); lp.goTo();  lp.loginApplication("aditya.kumar@gmail.com", "Password@123");
		String productname="ADIDAS ORIGINAL"; Products pr=new Products(driver); pr.addTocart(); pr.gettextformessage();   pr.carticonclick();
//driver.findElement(By.xpath("//*[text()='adidas original']//following::button[@class='btn w-10 rounded']")).click();//products page
		/*
		 * WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
		 * WebElement ele= driver.findElement(By.
		 * xpath("//div[@class='ng-tns-c4-2 toast-message ng-star-inserted']"));
		 * wait.until(ExpectedConditions.visibilityOf(ele));System.out.println(ele.
		 * getText()); 
		 * driver.findElement(By.xpath("//button[@routerlink='/dashboard/cart']")).click();
		 * String actualproductname=driver.findElement(By.xpath("//div[@class='cartSection']//h3")).getText();
		 */
		Cartseactionpage csp= new Cartseactionpage(driver);  String actualproductname= csp.gettextcapture(); 
			
		//cartsection page
Assert.assertEquals(actualproductname, productname, "its a match"); csp.checkoutclick(); //checkout page
Actions a= new Actions(driver);a.sendKeys(driver.findElement(By.xpath("//input[@placeholder='Select Country']")), "India").build().perform(); //billing address page
WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(10)) ;
WebElement section   =driver.findElement(By.xpath("//section[@class='ta-results list-group ng-star-inserted']"));  wait.until(ExpectedConditions.visibilityOf(section));  
//driver.findElement(By.xpath("//section[@class='ta-results list-group ng-star-inserted']//span[text()=' India']")).click();
BillingAddresspage bapage= new BillingAddresspage(driver); bapage.selectthecountry();  bapage.placeOrder();
//driver.findElement(By.xpath("//a[text()='Place Order ']")).click();
String expectedmessage="THANKYOU FOR THE ORDER.";
ConfirmationPage cfp= new ConfirmationPage(driver);
String actualmessage =  driver.findElement(By.xpath("//h1")).getText();
//String actualmessage =  
Assert.assertEquals(actualmessage, expectedmessage);
System.out.println(actualmessage);




	}

}
