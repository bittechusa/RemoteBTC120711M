package com.bit.test;

import org.testng.annotations.Test;

import datadriven.DataRead;

public class DataDrivenTest {

	@Test(dataProvider = "login",dataProviderClass=DataRead.class)
	  public void f(Integer n, String s) {
		System.out.println(n);
		System.out.println(s);
	  }
}
