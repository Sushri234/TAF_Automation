package com.mohs10.reuse;

import java.util.Arrays;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.mohs10.ActionDriver.Action;
import com.mohs10.ActionDriver.Actionitem;
import com.mohs10.base.StartBrowser;
import com.mohs10.or.THpage;

public class Tcfuns {
	
	public Action aDriver;
	public WebDriver driver;
	public Actionitem aaDriver;
	
	public Tcfuns()
	{
		aDriver = new Action();
		driver = StartBrowser.driver;
		aaDriver = new Actionitem();
	}
	
	//************************************Author Validation *********************************************
	public void Author(String Firstname, String Email, String title, String points, String URL) throws Exception
	{
		StartBrowser.childTest = StartBrowser.parentTest.createNode("Register in Author");
		aDriver.navigateToApplication(URL);
		aDriver.click(THpage.author, " Author on Article");
		aDriver.type(THpage.firstname,Firstname, "First Name");
		aDriver.type(THpage.email, Email, "Enter email");
		aDriver.type(THpage.titlearticle, title, "Title of Article");
		aDriver.type(THpage.bulletpoints,points,"Few bullet points");
		aDriver.click(THpage.submit, "Submit");
				
	}
	
	//************************************Author Validation with missing field******************************************//
	
	public void Authorvalidation(String Firstname, String title, String points, String URL) throws Exception
	{
		StartBrowser.childTest = StartBrowser.parentTest.createNode("validating in Author");
		aDriver.navigateToApplication(URL);
		aDriver.click(THpage.author, " Author on Article");
		aDriver.type(THpage.firstname,Firstname, "First Name");
		aDriver.type(THpage.titlearticle, title, "Title of Article");
		aDriver.type(THpage.bulletpoints,points,"Few bullet points");
		aDriver.click(THpage.submit, "Submit");
	}
	
//******************************************Article Validation**********************************************************//
	public void NavigatetoArticles(String URL) throws Exception {
        StartBrowser.childTest = StartBrowser.parentTest.createNode("Validate title of the TAF articles");
        aDriver.navigateToApplication(URL);

         List<By>NavigatetoArticles = Arrays.asList(THpage.article2,THpage.article3,THpage.article4,THpage.article5,
        		THpage.article6,THpage.article7,THpage.article8,THpage.article9,THpage.article10,THpage.article11,
        		THpage.article12,THpage.article13,THpage.article14,THpage.article15,THpage.article16,THpage.article17,
        		THpage.article18,THpage.article19,THpage.article20,THpage.article21,THpage.article22,THpage.article23,
        		THpage.article24,THpage.article25);
        for (By article  : NavigatetoArticles) {
        aDriver.click(THpage.article1, "Click on 1st article");
        aDriver.click(article, "Click on each article page");
        Thread.sleep(2000);
        // Get the Title of each page
        String expectedTitle = aDriver.getTitle(driver);

        // Call the validation method from aaDriver to validate the title
        aaDriver.Title_validate(driver, expectedTitle);
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(2000);
        }
    }

}