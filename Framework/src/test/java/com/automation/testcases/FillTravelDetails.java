package com.automation.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.automation.pages.HomePage;
import com.automation.utility.BaseClass;
import com.automation.utility.Helper;

public class FillTravelDetails extends BaseClass{
	
	@Test
	public void FillDetails()
	{
		logger = report.createTest("Filling Details of Travel");
		logger.info("Filling Details of Travel");
		
		HomePage homepage = PageFactory.initElements(driver, HomePage.class);
		
		homepage.details(excel.getStringData("Details", 0, 0), excel.getStringData("Details", 0, 1));
		
		logger.pass("travel details are filled");
		
	}

}
