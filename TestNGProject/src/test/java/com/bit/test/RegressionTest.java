package com.bit.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.IReporter;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class RegressionTest{

WebDriver dr;
	@Test(groups="smoke")
	public void buyAShirt() {
		System.out.println("test2");
		Reporter.log("test2");
		dr=new ChromeDriver();
		dr.get("http://www.facebook.com");
		
	}

	@Test(groups= {"reg","smoke"})
	public void BuyAPants() {
		System.out.println("test3");
		dr=new ChromeDriver();
		dr.get("http://www.google.com");
	}
}
