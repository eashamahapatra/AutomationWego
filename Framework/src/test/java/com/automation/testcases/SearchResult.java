package com.automation.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.automation.pages.SearchResultPage;
import com.automation.utility.BaseClass;

public class SearchResult extends BaseClass{
	
	@Test
	public void validateResult()
	{
		logger = report.createTest("Search Result Validation");
		logger.info("Search Result launch done");
		
		Assert.assertEquals("HYD ↔ JAI, 29 Sep to 01 Oct", driver.getTitle());
		Assert.assertTrue(true, driver.getTitle());
		System.out.println("Search Result Page Validation done -  "+driver.getTitle());
		
		SearchResultPage searchresultpage = PageFactory.initElements(driver, SearchResultPage.class);
		searchresultpage.result();
		searchresultpage.printresult();
		
		logger.info("Travel details of fares less than 12K is printed");
	
		
	}

}
