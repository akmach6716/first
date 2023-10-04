package com.pageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import AbstractComponent.AbstractComponent;
public class ConfirmationPage extends AbstractComponent {
WebDriver driver;
	public ConfirmationPage(WebDriver driver) {
		super(driver);
		this.driver= driver;
	}
@FindBy (xpath="//h1[normalize-space()='Thankyou for the order.']")   WebElement heading;

 public  String getheadingText()
{   return heading.getText();
	}

}
