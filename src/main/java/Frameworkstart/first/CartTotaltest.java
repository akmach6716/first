package Frameworkstart.first;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.internal.BaseTestMethod;
public class CartTotaltest  {
	public static void main(String[] args) throws InterruptedException {
		int sum=0;
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://rahulshettyacademy.com/client");
		driver.findElement(By.id("userEmail")).sendKeys("aditya.kumar@gmail.com");
		driver.findElement(By.id("userPassword")).sendKeys("Password@123");
		driver.findElement(By.id("login")).click();		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[text()='adidas original']//following::button[@class='btn w-10 rounded']")).click();		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[text()='zara coat 3']//following::button[@class='btn w-10 rounded']")).click();		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[text()='iphone 13 pro']//following::button[@class='btn w-10 rounded']")).click();			Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@routerlink='/dashboard/cart']")).click();
	List<WebElement> costs= driver.findElements(By.xpath("//div[@class='prodTotal cartSection']"));
	for(WebElement price:costs)
	{
  String cost= price.getText();  
 int singleprice=  Integer.parseInt(cost.substring(2));
 sum=sum+singleprice;
 }
	System.out.println("Sum of integers is  :"+sum);
	String total =driver.findElement(By.xpath("//li[@class='totalRow'][2]//span[@class='value']")).getText();
	System.out.println("Total displayed in the page : "+total.substring(1));
	}
	}
