package com.pageObjects;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import AbstractComponent.AbstractComponent;
public class BillingAddresspage  extends AbstractComponent{
WebDriver driver;
	public BillingAddresspage(WebDriver driver) {
		super(driver);
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
@FindBy(xpath="//section[@class='ta-results list-group ng-star-inserted']//span[text()=' India']")  WebElement Indiaoption;
@FindBy(xpath="//a[text()='Place Order ']")  WebElement placeoderbutton;


public void selectthecountry()
{
	Actions a= new Actions(driver);
	a.sendKeys(driver.findElement(By.xpath("//input[@placeholder='Select Country']")), "India").build().perform(); //billing address page
	WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(10)) ;
	WebElement section   =driver.findElement(By.xpath("//section[@class='ta-results list-group ng-star-inserted']"));  wait.until(ExpectedConditions.visibilityOf(section));
	
	Indiaoption.click();
	}
 public ConfirmationPage placeOrder()
 {
	 placeoderbutton.click();
	 return new ConfirmationPage(driver);
 }
	

}
