package testclasses;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


/*
 * This program demonstrate the difference between BeforeMethod and BeforeTest in TestNG.
 */

public class YongTest {

    @BeforeTest
    public void beforeTest() {
       System.out.println("@BeforeTest - Set up global Test data for all tests...");
     }
    
    
    @BeforeMethod
    public void beforemethod(){
           System.out.println("@BeforeMethod - Set up data for each test, like open DB connection...");
    }
    
    public void helper() {
      System.out.println("Flow");
    }
    
    @AfterMethod
    public void afterMethod() {
    	System.out.println("@afterMethod. Do clean up for each method. like closing DB connection...");
    }
    
    @AfterTest
    public void afterTest( ) {
    	System.out.println("@afterTest. Do cleaning up resources globally for all the tests.");
    }

    @Test
    public void toBeforeMethod() {
      helper();
      System.out.println("Test method - BeforeMethod");
    }

    @Test
    public void toBeforeTest() {
      helper();
      System.out.println("Test Method - BeforeTest");
    }
  
}