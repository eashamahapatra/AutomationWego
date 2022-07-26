package com.automation.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.automation.utility.BaseClass;

public class HomePage extends BaseClass{
	
	@FindBy(xpath="//span[text()='Flights']") WebElement flights;
	
	@FindBy(xpath="//input[text()='From']") WebElement source;
	
	@FindBy(xpath="//input[text()='to']") WebElement destination;
	
	@FindBy(xpath="//input[text()='Depart']") WebElement departdate;
	
	@FindBy(className="chevron") WebElement montharrow1;
	
	@FindBy(xpath="//i[text()='1664389800000']") WebElement ddate;
	
	@FindBy(className="chevron") WebElement montharrow2;
	
	@FindBy(xpath="//i[text()='1664562600000']") WebElement rdate;
	
	@FindBy(id="passengers") WebElement passenger;
	
	@FindBy(xpath="//div[id='a2' and class='stepper inc']") WebElement adult;
	
	@FindBy(xpath="//div[id='c2' and class='stepper inc']") WebElement child;

	@FindBy(xpath="//div[id='btn' and class='btn']") WebElement payment;
	
	@FindBy(xpath="//span[text()='show-more']") WebElement showmore;
	
	@FindBy(xpath="//span[text()='Net Banking']") WebElement netbanking;
	
	@FindBy(className="search") WebElement search;		
	
	public void details(String sourceApplication, String destinationApplication)
	{
		flights.click();
		source.sendKeys(sourceApplication);
		source.sendKeys(Keys.ENTER);		
		destination.sendKeys(destinationApplication);
		destination.sendKeys(Keys.ENTER);
		departdate.click();
		montharrow1.click();
		ddate.click();
		montharrow2.click();
		rdate.click();
		passenger.click();
		adult.click();
		adult.click();
		child.click();
		payment.click();
		showmore.click();
		netbanking.click();
		search.click();
	}
}
