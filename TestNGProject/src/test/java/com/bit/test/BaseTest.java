package com.bit.test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class BaseTest {
  
  @BeforeMethod
  public void beforeMethod() {
	  
	  System.out.println("opened blankBrowser by shahid");
  }

  @AfterMethod
  public void afterMethod(ITestResult R) {
	  System.out.println("am");
	  switch(R.getStatus()) {
	  case ITestResult.SUCCESS:{
		  System.out.println(R.getName()+" is passed");
	  }
	  case ITestResult.FAILURE:{
		  System.out.println(R.getName()+" is failed");
		  //callred screen shot method
	  }
	  case ITestResult.SKIP:{
		  System.out.println(R.getName()+" is skipped");
	  }
	  }
	  
  }


 
  @BeforeClass(groups="smoke",dependsOnMethods="beforeTest")
  public void beforeClass() {
	  System.out.println("read property file");
	  System.out.println("bc");
	  
  }

  @AfterClass(description="this method for certain action")
  public void afterClass() {
	  System.out.println("ac");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("generated log here");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("at");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("report");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("as");
  }

}
