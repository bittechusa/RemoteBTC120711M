package datadriven;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataRead {

	
	@Test(dataProvider = "login")
	  public void ffdg(Integer n, String s) {
		System.out.println(n);
		System.out.println(s);
	  }
	 @DataProvider(name="login")
	  public Object[][] dp() {
		 Object [][] o=new Object[2][2];
		 o[0][0]=1;
		 o[0][1]="a";
		 o[1][0]=2;
		 o[1][1]="b";
		 return o;
//	    return new Object[][] {
//	      new Object[] { 1, "a" },
//	      new Object[] { 2, "b" },
//	    };
	  }
}
