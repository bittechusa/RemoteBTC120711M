package com.bit.test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SmokeTest {

	@Parameters({"browser","url"})
	@Test
	public void test1(String b,String u) {
		System.out.println(b);
		if(b.equals("chrome"))
		{
			System.out.println(b +" browser opened");
		}else if(b.equals("firefox"))
		{
			System.out.println(b +" browser opened");
		}
		System.out.println("nevigate to "+u);
	}
	
	@Parameters({"browser","url"})
	@Test
	public void test12(String b,String u) {
		System.out.println(b);
		if(b.equals("chrome"))
		{
			System.out.println(b +" browser opened");
		}else if(b.equals("firefox"))
		{
			System.out.println(b +" browser opened");
		}
		System.out.println("nevigate to "+u);
	}
}
