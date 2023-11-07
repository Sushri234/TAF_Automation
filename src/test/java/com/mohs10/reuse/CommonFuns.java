package com.mohs10.reuse;


import java.util.Arrays;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import com.mohs10.base.StartBrowser;
import com.mohs10.or.HomePage;
import com.mohs10.or.THpage;
import com.mohs10.ActionDriver.Action;
import com.mohs10.ActionDriver.Actionitem;
import com.mohs10.ActionDriver.XLUtils;

	public class CommonFuns {
		public Actionitem aaDriver;
		public static Action aDriver;
		public static WebDriver driver;
		
		public CommonFuns()
		{
			aaDriver= new Actionitem();
			aDriver = new Action();
			driver = StartBrowser.driver;
		}
		
		
		String excelfile="C:\\Users\\DELL\\eclipse-workspace\\Mohs10_TAF\\TestData\\Taf_data.xlsx";
		String excelsheet= "Sheet2";
		
	//******************************** Footer TestCases***********************************
		   
			public void Title_validate(String URL) throws Exception
				{
					StartBrowser.childTest = StartBrowser.parentTest.createNode("Validate the title of all page");
					aDriver.navigateToApplication(URL);
					
					int rowcount = XLUtils.getRowCount(excelfile, excelsheet);
	                System.out.println(rowcount);
	                List<By> Show_page = Arrays.asList(HomePage.Linkdln_logo, HomePage.Youtube_logo, HomePage.insta_logo);

	                for(int i=0;i<=2;i++) {
	               	                
	                String title = XLUtils.getStringCellData(excelfile, excelsheet, i, 0);
					System.out.println(title);
					aDriver.click(Show_page.get(i), "Click on " + title);
                        //Window handle method
				        Set<String> windowHandles = driver.getWindowHandles();
				        // Store the handle of the parent window
				        String parentWindowHandle = driver.getWindowHandle();
				        // Iterate through the window handles to switch to the child window
				        for (String windowHandle : windowHandles) {
				            if (!windowHandle.equals(parentWindowHandle)) {
				                driver.switchTo().window(windowHandle);
				                break;
				                }
				        }
				        // Perform actions on the child window
				        aDriver.switchToNewWindow(driver);
				        aaDriver.Title_validate(driver, title);
				        Thread.sleep(3000);
				        driver.close();
				        // Switch back to the parent window
				        driver.switchTo().window(parentWindowHandle);
				        }
	                    
				}
			
	
    
		
	


//**************************************** Validate Mohs10Logo and ThankyouEmail***********************************	
				public boolean Validate_Logo(String URL) throws Exception
				{
					StartBrowser.childTest = StartBrowser.parentTest.createNode("Validate Mohs10Logo");
					aDriver.navigateToApplication(URL);
					
					aDriver.click(HomePage.Mohs10_Link, "Click on M10 Technologies");
					WebElement logo=driver.findElement(HomePage.Mohs10_Logo);
					boolean logodisplayed = logo.isDisplayed();
					Thread.sleep(3000);
					return logodisplayed;
				}
				public String Validate_Email(String Email, String URL) throws Exception
				{
				    StartBrowser.childTest = StartBrowser.parentTest.createNode("Validate Email & Mohs10Logo");
					aDriver.navigateToApplication(URL);
					
		 			aDriver.type(HomePage.Email,Email, "type your mail id");
					aDriver.click(HomePage.submit, "Click on submit button");
					String msg = aDriver.getText(HomePage.thankYouMessage, "Get the text message");
					return msg;
					
				        }
					
	
				
//************************************Search functionality*********************************
				
		public String Validate_keyword(String Keyword, String URL) throws Exception {
			StartBrowser.childTest = StartBrowser.parentTest.createNode("Validate Keyword");
			aDriver.navigateToApplication(URL);
			// Click on search button by entering a keyword
			aDriver.type(HomePage.Keyword, Keyword, "write one keyword");
			aDriver.click(HomePage.Search, "search for this keyword");
			//Validate the headings of search keyword
			String headings= aDriver.getText(HomePage.Heading, "get the headings of the page");
			//validate the title of search keyword
			aaDriver.Title_validate(driver, "You searched for "+Keyword+" - Test Automation Forum");
			Thread.sleep(3000);
			return headings;
		}
		
			public static void Validate_Readlink(String URL) throws Exception {
			StartBrowser.childTest = StartBrowser.parentTest.createNode("Validate read_link");
			aDriver.navigateToApplication(URL);
			aDriver.click(HomePage.Read_Link, "click on read link");
			// Scroll Down
//			aDriver.Scroll_down(HomePage.Scroll);
			
			Actions a = new Actions(driver);
					a.sendKeys(Keys.PAGE_DOWN).perform();

//			String conclusion = aDriver.getText(HomePage.Conclusion, "Conclusion Text");

			aDriver.click(HomePage.Like_button, "click on read link");
			System.out.println("Thanks you! Liked this");
			driver.navigate().back();
			//driver.navigate().refresh();
			Thread.sleep(3000);
			// Click on search button without entering anything
			aDriver.click(HomePage.Search1, "Search for keyword");

//			return conclusion;
		}
	
  //**************************************ShowCase series page***************************************
					
	  public void Showcase_page(String URL) throws Exception {
		StartBrowser.childTest = StartBrowser.parentTest.createNode("Validate title of the ShowCase series page");
		aDriver.navigateToApplication(URL);

		List<By> Showcase_page = Arrays.asList(HomePage.series1, HomePage.series2, HomePage.series3, HomePage.series4,HomePage.series5);
		for (By Showcase_series : Showcase_page) {
		aDriver.click(HomePage.Showcase, "Click on 1st series");
		aDriver.click(Showcase_series, "Click on each series of the page");
		Thread.sleep(2000);
        // Get the Title of each page
		String expectedTitle = aDriver.getTitle(driver);

		// Call the validation method from aaDriver to validate the title
		aaDriver.Title_validate(driver, expectedTitle);
	    Thread.sleep(2000);
		aDriver.switchToOldWindow(driver);
		Thread.sleep(2000);
		}
	}
			
		
//*************************************YouTube Video click and pause action in show case series************************
		    
	 public void ShowCaseSeries_Youtube( String URL,String SC_url) throws Exception {
		StartBrowser.childTest = StartBrowser.parentTest.createNode("Validate video for each Showcase series");
		aDriver.navigateToApplication(URL);

		// List of video elements
		List<By> videoElements = Arrays.asList(HomePage.Video1,HomePage.Video2);

		for (By videoElement : videoElements) {
		aDriver.click(HomePage.Showcase_YT, "Click on 1st series");
		aDriver.click(videoElement, "Click on video");
		Thread.sleep(2000);

		// Scroll down to the page
	    WebElement scroll = driver.findElement(By.xpath("//section[@class='elementor-section elementor-top-section elementor-element elementor-element-78bce02 elementor-section-boxed elementor-section-height-default elementor-section-height-default']"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", scroll);
        
        // Create the object of the Screen class for click operation on the video
        Screen screen = new Screen();
        Pattern play = new Pattern(SC_url);  //Here give the screenshot path of the element
        screen.wait(play, 1000);
        screen.click(play);
        Thread.sleep(5000);
        
        //Mouse over Action to pause the video
        Actions actions = new Actions(driver);
        // Move the mouse to the video element to make it visible
        actions.moveToElement(scroll).perform();
        Thread.sleep(2000);
        // Pause the video
        actions.moveByOffset(0, 0).click().perform();
        Thread.sleep(3000);
	   }
	 }
		
		//************************************Author Validation *********************************************
		public void Author(String Firstname, String Email, String title, String points, String URL) throws Exception
		{
			StartBrowser.childTest = StartBrowser.parentTest.createNode("Register in Author");
			aDriver.navigateToApplication(URL);
			aDriver.click(HomePage.author, " Author on Article");
			aDriver.type(HomePage.firstname,Firstname, "First Name");
			aDriver.type(HomePage.email, Email, "Enter email");
			aDriver.type(HomePage.titlearticle, title, "Title of Article");
			aDriver.type(HomePage.bulletpoints,points,"Few bullet points");
			aDriver.click(HomePage.submit1, "Submit");
					
		}
		
		//************************************Author Validation with missing field******************************************//
		
		public void Authorvalidation(String Firstname, String title, String points, String URL) throws Exception
		{
			StartBrowser.childTest = StartBrowser.parentTest.createNode("validating in Author");
			aDriver.navigateToApplication(URL);
			aDriver.click(HomePage.author, " Author on Article");
			aDriver.type(HomePage.firstname,Firstname, "First Name");
			aDriver.type(HomePage.titlearticle, title, "Title of Article");
			aDriver.type(HomePage.bulletpoints,points,"Few bullet points");
			aDriver.click(HomePage.submit1, "Submit");
		}
		
	//******************************************Article Validation**********************************************************//
		public void NavigatetoArticles(String URL) throws Exception {
	        StartBrowser.childTest = StartBrowser.parentTest.createNode("Validate title of the TAF articles");
	        aDriver.navigateToApplication(URL);

	         List<By>NavigatetoArticles = Arrays.asList(HomePage.article2,HomePage.article3,HomePage.article4,HomePage.article5,
	        		 HomePage.article6,HomePage.article7,HomePage.article8,HomePage.article9,HomePage.article10);
	        for (By article  : NavigatetoArticles) {
	        aDriver.click(HomePage.article1, "Click on 1st article");
	        aDriver.click(article, "Click on each article page");
	        Thread.sleep(2000);
	        // Get the Title of each pages
	        String expectedTitle = aDriver.getTitle(driver);

	        // Call the validation method from aaDriver to validate the title
	        aaDriver.Title_validate(driver, expectedTitle);
	        Thread.sleep(2000);
	        driver.navigate().back();
	        Thread.sleep(2000);
	        }

	    }
      	
	}
	 
     
		 
				   
			    
		    
		 
			
	

	
			