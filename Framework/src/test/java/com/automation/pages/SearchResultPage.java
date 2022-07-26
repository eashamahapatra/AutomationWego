package com.automation.pages;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.automation.utility.BaseClass;

public class SearchResultPage extends BaseClass{
	
	@FindBy(xpath="//div[text()='Filters']") WebElement filters;
	
	@FindBy(xpath="//span[text()='Stops']") WebElement stops;
	
	@FindBy(xpath="//span[text()='Airlines/Alliances']") WebElement airlines;
	
	@FindBy(xpath="//span[text()='Origin/Destination']") WebElement departure;
	
	@FindBy(xpath="//*[text()='Direct ']") WebElement direct;
	
	@FindBy(xpath="//*[text()='close-small']") WebElement close;

	
	public void result()
	{
		filters.click();
		Assert.assertTrue(stops.isDisplayed());
		Assert.assertTrue(airlines.isDisplayed());
		Assert.assertTrue(departure.isDisplayed());
		direct.click();	
		close.click();		
	}
	
	public void printresult()
	{
		List <WebElement> list = driver.findElements(By.xpath("//*[id='price']/div/span[class='amount']"));
		Iterator<WebElement> it = list.iterator();
		while(it.hasNext())
		{
			String pricevalue = it.next().getText();
			int pvalue = Integer.parseInt(pricevalue);
			if (pvalue<12000)
			{
				System.out.println("Flight Fare : "+pvalue);
			}
		}
	}
}
