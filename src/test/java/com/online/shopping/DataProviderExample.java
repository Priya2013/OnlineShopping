package com.online.shopping;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class DataProviderExample {
  @Test(dataProvider = "testData")
  public void testData(Integer number, String name) {
	  System.out.println("Name "+ name +"and ID is "+number);
  }

  @DataProvider(name="testData")
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "pdahal2023@nrnusa.org", "Preisha@2010" },
      
    };
  }
}
