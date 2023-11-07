package com.mohs10.ActionDriver;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screenshot {
	
	
	public static void SSReusablemethod(WebDriver driver, String SSName)
    {
        try
        {
        TakesScreenshot ts = (TakesScreenshot)driver;
        File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src, new File("./screenshot/"+SSName+".png"));
        System.out.println("Screen captured and saved in Testcasescreenshots folder");
        }
        catch (Exception e)
        {
            System.out.println("Exception Occurred while taking Screenshot"+e.getMessage());
        }
    }
}


