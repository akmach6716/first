package com.pageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import AbstractComponent.AbstractComponent;
public class Products  extends  AbstractComponent{
	WebDriver driver;
	public Products(WebDriver driver) {	super(driver);	this.driver= driver; 		PageFactory.initElements(driver,this); 	}
	@FindBy(xpath="//*[text()='adidas original']//following::button[@class='btn w-10 rounded']") WebElement addtocart;
   @FindBy(xpath="//div[@class='ng-tns-c4-2 toast-message ng-star-inserted']") WebElement addtocartmessage;
	By messagelocator= By.xpath("//div[@class='ng-tns-c4-2 toast-message ng-star-inserted']");
	@FindBy (xpath="//button[@routerlink='/dashboard/cart']") WebElement carticon;
	public void addTocart() 
	{
		addtocart.click();
		
	}
	
	public void gettextformessage()
	{
		waitforElementToAppear(messagelocator);
		//System.out.println(addtocartmessage.getText());
		
	}
	public Cartseactionpage carticonclick()
	{  waitforWeblementtobeclickable(carticon);
		carticon.click();
		return new Cartseactionpage(driver);
	}
	
}
