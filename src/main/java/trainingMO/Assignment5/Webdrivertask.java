package trainingMO.Assignment5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webdrivertask {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://freelance-learn-automation.vercel.app/login");
		// Capture header and verify text is equal to Sign In
		String text = driver.findElement(By.className("header")).getText();
		System.out.println(text);
		// Capture button text and verify text is equal to Sign In
		String buttontext = driver.findElement(By.className("submit-btn")).getText();
		if (buttontext.equals("Sign in"))

		{
			System.out.println(buttontext);
		}
		// Capture h2 tag and verify text equals to Connect with us

		if (driver.findElement(By.xpath("//div[@class='social']//h2")).getText().equals("Connect with us")) {
			System.out.println(driver.findElement(By.xpath("//div[@class='social']//h2")).getText());
		}
//    Capture link text and verify text contains Signup

		if (driver.findElement(By.xpath("//div[@class='content']//a")).getAttribute("href").contains("signup")) {
			System.out.println(driver.findElement(By.xpath("//div[@class='content']//a")).getAttribute("href"));

		}
		driver.close();
	}

}
