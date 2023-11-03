package trainingMO.day7;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.manager.SeleniumManager;

public class SeleniumManagerdemo {

	public static void main(String[] args) {
		ChromeOptions opt= new ChromeOptions();
		//opt.setBinary(null)
		WebDriver driver= new ChromeDriver(opt);
		String driverpath=SeleniumManager.getInstance().getDriverPath(opt, true).getDriverPath();
		System.out.println(driverpath);
	

	}

}
