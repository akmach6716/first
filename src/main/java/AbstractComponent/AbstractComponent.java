package AbstractComponent;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.pageObjects.Cartseactionpage;
import com.pageObjects.OrderHistorypage;
public class AbstractComponent {
WebDriver driver;
	public AbstractComponent(WebDriver driver) { 	this.driver= driver; PageFactory.initElements(driver, this); 	}	
	@FindBy(xpath="//button[@routerlink='/dashboard/myorders']")  WebElement myOrdersheadder;
	@FindBy(xpath="//button[@routerlink='/dashboard/cart']")  WebElement cartHeader;
	
	public void waitforElementToAppear(By messagelocator)
	{			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	wait.until(ExpectedConditions.invisibilityOfElementLocated(messagelocator));
	}
	
	public void waitforWeblementtoAppear(WebElement ele)
	{
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(ele));	}
	
	public void waitforWeblementtobeclickable(WebElement ele)
	{
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(ele));
	}
	
 public OrderHistorypage orderhistoryclick()
 {  myOrdersheadder.click();
   return new OrderHistorypage(driver);
	 
 }

 public Cartseactionpage cartheaderclick()
 {
	 cartHeader.click();
	 return new Cartseactionpage(driver);
 }
}
