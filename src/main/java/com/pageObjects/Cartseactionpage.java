package com.pageObjects;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import AbstractComponent.AbstractComponent;
public class Cartseactionpage extends AbstractComponent{
	WebDriver driver;
	public Cartseactionpage(WebDriver driver) 
	{	super(driver);
		this.driver= driver;
		PageFactory.initElements(driver, this);	
	}
	@FindBy (xpath="//div[@class='cartSection']//h3")  WebElement productname; 
	@FindBy(xpath="//button[text()='Checkout']") WebElement checkout; 	
	@FindBy(xpath="//div[@class='prodTotal cartSection']") List<WebElement> carttotals;
	@FindBy(xpath="//li[@class='totalRow'][2]//span[@class='value']") WebElement totalvalue;
	public String gettextcapture()
	{		return productname.getText();
	}	
	public BillingAddresspage checkoutclick()
	{		checkout.click();
		return new BillingAddresspage(driver);
	}	
	public int sumtheTotal()
	{int sum=0;
		for(WebElement price:carttotals)
		{	  String cost= price.getText();  
	 int singleprice=  Integer.parseInt(cost.substring(2));
	 sum=sum+singleprice;	
	 }		return sum;		
	}
	public int gettheTotalinInt()
	{
	return 	Integer.parseInt(totalvalue.getText().substring(2));
	}
}
