package com.mohs10.scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.mohs10.ActionDriver.Screenshot;
import com.mohs10.ActionDriver.XLUtils;
import com.mohs10.base.StartBrowser;
import com.mohs10.reuse.CommonFuns;
import com.mohs10.reuse.Tcfuns;

	public class HomeTest extends StartBrowser{
		String Excelfile="C:\\Users\\DELL\\eclipse-workspace\\Mohs10_TAF\\TestData\\Taf_data.xlsx";
		String Sheet= "Sheet1";
		
		/*String excelfile = "C:\\Users\\DELL\\eclipse-workspace\\Mohs10_TAF\\TestData\\Data.xlsx";
	    String excelsheet = "authorregs"; // Assuming the Excel sheet name is "Registration"
	    String URL ="URL";*/
	
	//***********************Footer TestCases********************
	@Test(priority = 0)
	public void Validate_title() throws Exception {
	
	    String URL= XLUtils.getStringCellData(Excelfile, Sheet, 2, 0);
	    CommonFuns cat = new CommonFuns();
	    cat.Title_validate(URL);
	    
	    Screenshot.SSReusablemethod(driver, "Validate_title");
		Thread.sleep(9000);
		
	}  
		
	
	//******************* Validate Mohs10Logo and ThankyouEmail**************** 
	@Test(priority = 1)
	   public void Validate_Logo() throws Exception {
		 			
		String URL= XLUtils.getStringCellData(Excelfile, Sheet, 2, 0);
		
		CommonFuns cat = new CommonFuns();
	    boolean logo=cat.Validate_Logo(URL);
	    Assert.assertEquals(logo,true);
	    
	    Screenshot.SSReusablemethod(driver, "Validate_Logo");
		Thread.sleep(9000);    
		} 
	   @Test(priority = 2)
	   public void Validate_Email() throws Exception {
		 			
		String URL= XLUtils.getStringCellData(Excelfile, Sheet, 2, 0);
		String Email= XLUtils.getStringCellData(Excelfile, Sheet, 1, 3);
		
		CommonFuns cat = new CommonFuns();
	    String text=cat.Validate_Email(Email, URL);
	    Assert.assertEquals(text, "Thank you for contacting us. We will get in touch with you shortly.");
	    
	    Screenshot.SSReusablemethod(driver, "Validate_Email");
		Thread.sleep(9000);    
		}  
	
		
	//*****************Search functionality******************8
	   @Test(priority = 3)
		public void Validate_Keyword() throws Exception {
			CommonFuns cat = new CommonFuns();
			
			String URL= XLUtils.getStringCellData(Excelfile, Sheet, 2, 0);
			String Keyword= XLUtils.getStringCellData(Excelfile, Sheet, 1, 2);
		    
			String heading=cat.Validate_keyword(Keyword, URL);
		    Assert.assertEquals(heading, "Search Results For: Performance");
		    System.out.println(heading);
		    
		    Screenshot.SSReusablemethod(driver, "Validate_Keyword");
			Thread.sleep(9000);  
	
 }   
	   @Test(priority = 4)
		public void Validate_readlink() throws Exception {
			CommonFuns cat = new CommonFuns();
			
			String URL= XLUtils.getStringCellData(Excelfile, Sheet, 2, 0);
		    
		    cat.Validate_Readlink(URL);
//		    Assert.assertEquals(text, "Conclusion ");
//		    System.out.println(text);
		    
		    Screenshot.SSReusablemethod(driver, "Validate_readlink");
			Thread.sleep(9000);  
	
 }   
	
		
	//******************ShowCase series page*******************
	   @Test(priority = 5)
		public void Showcase_seriesPage() throws Exception {
			
			String URL= XLUtils.getStringCellData(Excelfile, Sheet, 2, 0);
			CommonFuns cat = new CommonFuns();
		    cat.Showcase_page(URL);
		    
		    Screenshot.SSReusablemethod(driver, "Showcase_seriesPage");
			Thread.sleep(9000);  
		
	}
	
	//******************YouTube Video click and pause**************
	
	   @Test(priority = 6)
	  public void Showcase_series() throws Exception {
		  
		  String URL= XLUtils.getStringCellData(Excelfile, Sheet, 2, 0);
		  String SC_URL= XLUtils.getStringCellData(Excelfile, Sheet, 1, 0);
		  CommonFuns cat = new CommonFuns();
	      cat.ShowCaseSeries_Youtube(URL,SC_URL);
	      Screenshot.SSReusablemethod(driver, "Showcase_series");
	      Thread.sleep(2000);
	  }
	   
	   
//	   @Test(priority=7)
//	    public void Authorreg() throws Exception {
//		   CommonFuns hm2 = new CommonFuns();
//	        String url = XLUtils.getStringCellData(excelfile, URL,  1, 0);
//	        String firstName = XLUtils.getStringCellData(excelfile, excelsheet, 1, 0);
//	        String email = XLUtils.getStringCellData(excelfile, excelsheet, 1, 1);
//	        String title = XLUtils.getStringCellData(excelfile, excelsheet, 1, 2);
//	        String points = XLUtils.getStringCellData(excelfile, excelsheet, 1, 3);
//
//	        // Perform registration using retrieved data
//	        hm2.Author(firstName, email, title, points,url);
//
//	        // Add any additional steps or assertions here
//	        String expectedText ="Thank you for your message. We will get in touch with you shortly";
//	        Assert.assertEquals("Thank you for your message. We will get in touch with you shortly",expectedText);
//	        System.out.println("prompting proper message"+expectedText);
//	        // Capture screenshot
//	        Screenshot.SSReusablemethod(driver, "Author");
//	        Thread.sleep(5000);
//	    }
//	    
//	//*********************************************************************//
//	    
//	    @Test(priority=8)
//	    public void Authorval() throws Exception {
//	    	CommonFuns hm2 = new CommonFuns();
//	        String url = XLUtils.getStringCellData(excelfile, URL,  1, 0);
//	        String firstName = XLUtils.getStringCellData(excelfile, excelsheet, 1, 0);
//	        String title = XLUtils.getStringCellData(excelfile, excelsheet, 1, 2);
//	        String points = XLUtils.getStringCellData(excelfile, excelsheet, 1, 3);
//
//	        // Perform registration using retrieved data
//	        hm2.Authorvalidation(firstName, title, points, url);
//
//	        // Add any additional steps or assertions here
//	        String expectedText ="This field is required";
//	        Assert.assertEquals("This field is required",expectedText);
//	        System.out.println("prompting proper message"+expectedText);
//	        // Capture screenshot
//	        Screenshot.SSReusablemethod(driver, "Author validation");
//	        Thread.sleep(5000);
//	}
//	//************************************************************************//
//	    	@Test(priority=9)
//	    	public void Articles() throws Exception{
//	    		String url = XLUtils.getStringCellData(excelfile, URL,  1, 0);
//	    		CommonFuns hm2= new CommonFuns();
//	    		hm2.NavigatetoArticles(url);
//	    		Thread.sleep(5000);
//	    		
//	    	}
	
}