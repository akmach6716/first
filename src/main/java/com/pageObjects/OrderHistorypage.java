package com.pageObjects;
import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import AbstractComponent.AbstractComponent;
public class OrderHistorypage extends AbstractComponent {
WebDriver driver;
	public OrderHistorypage(WebDriver driver) {
		super(driver);
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}	
	@FindBy(xpath="//table[@class='table table-bordered table-hover ng-star-inserted']//tr[1]//td[2]") WebElement productname;

	public String getprodcutname()
	{
	  return productname.getText();
	}
}
