package com.mohs10.ActionDriver;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.rmi.AccessException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import com.aventstack.extentreports.MediaEntityBuilder;
import com.mohs10.base.StartBrowser;

public class Actionitem extends com.mohs10.base.StartBrowser{
	public static WebDriver driver;
	
	
	public Actionitem()
	{
		driver= StartBrowser.driver;
		
	}
	
 

//FILEUPLOAD
public static void Upload( By locator,String file) throws AWTException
{
	
	  WebElement button=driver.findElement(locator); //If the click function is not working for a particular element then this javaScrip function is working to click the element
	  JavascriptExecutor js=(JavascriptExecutor)driver; 
	  js.executeScript("arguments[0].click();",button);
	 
	try
	{
    Robot rb = new Robot();
    rb.delay(2000);
			
    StringSelection ss=new StringSelection(file);
    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
	
    rb.keyPress(KeyEvent.VK_CONTROL);
    rb.keyPress(KeyEvent.VK_V);
    rb.delay(2000);
  
    rb.keyRelease(KeyEvent.VK_CONTROL);
    rb.keyRelease(KeyEvent.VK_V);
	
    rb.keyPress(KeyEvent.VK_ENTER);
    rb.keyPress(KeyEvent.VK_ENTER);
	}
    
    	catch(Exception e)
	{
    		System.out.println("File already exists");
    }
}

//GET SYSTEM DATE AND TIME

public void GetDateAndTime() {
	
	
	
	DateFormat formatdate=new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
	Date systemDate =new Date();
	String dateofsystem=formatdate.format(systemDate);
	System.out.println(dateofsystem);
}


//CLOSE ALL CHILDWINDOW EXCEPT PARENT WINDOW

public void Windowhandle(WebDriver driver,String childwindow)
{
Set <String>s=driver.getWindowHandles();
for(String i:s)
{
//System.out.println(i);	         //It will print the id
String t=driver.switchTo().window(i).getTitle();
//System.out.println(t);           //It will print the title
try {
if(t.contains(childwindow))     //To close the particular window
{
	driver.close();
}
}
catch(Exception e){
	System.out.println("there is no childwindow");
	}
}
}



//AUTO SUGGESTION

public static void Autocompletetextfield( By locator,String element) throws InterruptedException 
{
List<WebElement>elements=driver.findElements(locator);

System.out.println(elements.size());
try {
	for(int i=0;i<elements.size();i++)
	{
		String list =elements.get(i).getText();
		System.out.println(list);
		if (list.contains(element))
		{
			elements.get(i).click();
			break;
	}
	 }
	  }
 catch (Exception e)
  {
	System.out.println("Element not found");
}
}



//Handle all the data of WebTable

public void WebTableHandle(By locator)
{
	WebElement table=driver.findElement(locator);
	List<WebElement> rows = table.findElements(By.tagName("tr"));
	List<WebElement> col= table.findElements(By.tagName("td"));
	//printing the numbers of rows and columns
	System.out.println(rows.size());
	System.out.println(col.size());
	//fetching all the data in a table by using for loop
	for(int i=0;i<rows.size();i++) {
		System.out.println(rows.get(i).getText());
		}
}

//Handle the data for a specific row and column
public void Webtable(By locator)
{
	 WebElement baseTable = driver.findElement(locator);
	     //To find third row of table
		  WebElement tableRow = baseTable.findElement(locator);
		  String rowtext = tableRow.getText();
		  System.out.println("Third row of table : "+rowtext);
		 
	      //to get 3rd row's 2nd column data
		  WebElement cellIneed = tableRow.findElement(locator);
		  String valueIneed =cellIneed.getText(); 
		  System.out.println("Cell value is : " + valueIneed);
		  driver.close();
	  }



//Validate Title of the page
public void Title_validate(WebDriver driver,String Title)
{
String expTitle = (Title);
System.out.print("The expected title is= "+expTitle);

// Define the actual title
String actTitle=driver.getTitle(); 
System.out.println("The actual title is = "+actTitle);

// Compare the actual title with the expected title
if (expTitle.equals(actTitle)) {
    System.out.println("Page title is validated successfully.");
} else {
    System.out.println("Page title validation failed.");
}
}

//Validate Thank you message
public void Message_validate(By Locator)
{
WebElement thankYouMessage = driver.findElement(Locator);
if (thankYouMessage.isDisplayed()) {
       System.out.println("Thank you message displayed successfully!");
   } else {
       System.out.println("Thank you message not found!");
   }

}


//Scroll down method
public void Scroll_down(By scroll1) throws FindFailed, InterruptedException
{
WebElement scroll= driver.findElement(scroll1);
JavascriptExecutor js = (JavascriptExecutor) driver;
js.executeScript("arguments[0].scrollIntoView();", scroll);


}





public String getTitle() {
	// TODO Auto-generated method stub
	return null;
}

}