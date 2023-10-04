package com.pageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import AbstractComponent.AbstractComponent;
public class LandingPage  extends  AbstractComponent{
WebDriver driver;
public LandingPage(WebDriver driver)
{	super(driver);
	this.driver= driver;
	PageFactory.initElements(driver, this);		}
@FindBy(id="userEmail") WebElement userid; @FindBy(id="userPassword") WebElement password; @FindBy(id="login") WebElement submitbutton;
@FindBy(xpath="//div[@aria-label='Incorrect email or password.']") WebElement errormsg;
public Products loginApplication(String user,String pass)
{	userid.sendKeys(user);  	password.sendKeys(pass); submitbutton.click(); 
return  new Products(driver);
}
public  void goTo() {driver.get("https://rahulshettyacademy.com/client"); }
public String getErrormsg() { waitforWeblementtoAppear(errormsg);  
return errormsg.getText();	}

}
