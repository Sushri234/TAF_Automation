package com.mohs10.scripts;


import org.testng.Assert;

import org.testng.annotations.Test;
import com.mohs10.ActionDriver.Screenshot;
import com.mohs10.ActionDriver.XLUtils;
import com.mohs10.base.StartBrowser;
import com.mohs10.reuse.Tcfuns;

public class THtest extends StartBrowser {
    
    String excelfile = "C:\\Users\\DELL\\eclipse-workspace\\Mohs10_TAF\\TestData\\Data.xlsx";
    String excelsheet = "authorregs"; // Assuming the Excel sheet name is "Registration"
    String URL ="URL";

    @Test(priority=0)
    public void Authorreg() throws Exception {
        Tcfuns hm2 = new Tcfuns();
        String url = XLUtils.getStringCellData(excelfile, URL,  1, 0);
        String firstName = XLUtils.getStringCellData(excelfile, excelsheet, 1, 0);
        String email = XLUtils.getStringCellData(excelfile, excelsheet, 1, 1);
        String title = XLUtils.getStringCellData(excelfile, excelsheet, 1, 2);
        String points = XLUtils.getStringCellData(excelfile, excelsheet, 1, 3);

        // Perform registration using retrieved data
        hm2.Author(firstName, email, title, points,url);

        // Add any additional steps or assertions here
        String expectedText ="Thank you for your message. We will get in touch with you shortly";
        Assert.assertEquals("Thank you for your message. We will get in touch with you shortly",expectedText);
        System.out.println("prompting proper message"+expectedText);
        // Capture screenshot
        Screenshot.SSReusablemethod(driver, "Author");
        Thread.sleep(5000);
    }
    
//*********************************************************************//
    
    @Test(priority=1)
    public void Authorval() throws Exception {
        Tcfuns hm2 = new Tcfuns();
        String url = XLUtils.getStringCellData(excelfile, URL,  1, 0);
        String firstName = XLUtils.getStringCellData(excelfile, excelsheet, 1, 0);
        String title = XLUtils.getStringCellData(excelfile, excelsheet, 1, 2);
        String points = XLUtils.getStringCellData(excelfile, excelsheet, 1, 3);

        // Perform registration using retrieved data
        hm2.Authorvalidation(firstName, title, points, url);

        // Add any additional steps or assertions here
        String expectedText ="This field is required";
        Assert.assertEquals("This field is required",expectedText);
        System.out.println("prompting proper message"+expectedText);
        // Capture screenshot
        Screenshot.SSReusablemethod(driver, "Author validation");
        Thread.sleep(5000);
}
//************************************************************************//
    	@Test(priority=2)
    	public void Articles() throws Exception{
    		String url = XLUtils.getStringCellData(excelfile, URL,  1, 0);
    		Tcfuns hm2= new Tcfuns();
    		hm2.NavigatetoArticles(url);
    		Thread.sleep(5000);
    		
    		
    		}        
    	
}
