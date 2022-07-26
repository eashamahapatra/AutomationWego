package com.automation.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.automation.utility.BaseClass;

public class LaunchTestWego extends BaseClass{
	
	@Test
	public void validatePage()
	{
		
		logger = report.createTest("Launching and validating Wego");
		logger.info("staring application");
		
		Assert.assertEquals("Cheap Hotels, Hotel Deals & Hotel Booking | Wego.co.in", driver.getTitle());
		Assert.assertTrue(true, driver.getTitle());
		
		logger.pass("Launch Success");
		logger.pass("**Page Title Validation done**");
	}

}
