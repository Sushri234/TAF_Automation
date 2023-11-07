package com.mohs10.or;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.github.dockerjava.api.model.Driver;

public class HomePage {
	
	//Footer TestCases

    public static By Linkdln_logo = By.xpath("//i[@class=\"fab fa-linkedin\"]");
	public static By Youtube_logo  =By.xpath("//i[@class='fab fa-youtube']");
	public static By insta_logo =By.xpath("//a[@class=\"elementor-icon elementor-social-icon elementor-social-icon- elementor-repeater-item-954c7a8\"]");
	public static By Twitter_logo =By.xpath("//i[@class='fab fa-twitter']");
	
	
	//Validate Mohs10Logo and ThankyouEmail	
	public static By Mohs10_Link = By.xpath("//a[normalize-space()='Mohs10 Technologies']");
	public static By Mohs10_Logo = By.xpath("//div[@class='site-primary-header-wrap ast-builder-grid-row-container site-header-focus-item ast-container']//img[@alt='Mohs10 Technologies']");
	
	public static By Automation_forum =By.xpath("//a[normalize-space()='info@testautomationforum.com']");
	public static By OK =By.xpath("//input[@id='ff_3_email']");
	
	public static By Email =By.xpath("//input[@id='ff_3_email']");
	public static By submit =By.xpath("//button[normalize-space()='Submit']");
	public static By thankYouMessage =By.xpath("//p[contains(text(),'Thank you for contacting us. We will get in touch ')]");
	
	
	//Search Functionality
	public static By Keyword =By.xpath("//input[@title='Search']");
	public static By Search =By.xpath("//button[@class='hfe-search-submit']");
	public static By Heading =By.xpath("//h1[@class='page-title ast-archive-title']");
	
	public static By Read_Link =By.xpath("//p[@class='read-more']//a[@href='https://testautomationforum.com/unleash-quality-and-performance-empowering-mobile-app-testing-with-appium/']");
	public static By Scroll =By.xpath("//p[16]//b[1]//span[1]");
	public static By Conclusion =By.xpath("//p[16]//b[1]//span[1]");
	
	public static By Like_button= By.xpath("//button[@aria-label='Like Button']");
	
	public static By Search1 =By.xpath("//button[@class='hfe-search-submit']");
	
	
	//ShowCase series page
	
	public static By Showcase =By.xpath("//a[normalize-space()='Showcase Series']");
	public static By series1 =By.xpath("//img[@alt='Showcase Series – ContextQA']");
	
	
	public static By series2 =By.xpath("//img[@alt='Showcase Series – Deepfactor']");
	public static By series3 =By.xpath("//img[@alt='Showcase Series – Tonic']");
	
	public static By series4 =By.xpath("//img[@alt='Showcase Series – Conformiq']");
	public static By series5 =By.xpath("//img[@alt='Showcase Series – Sahi Pro']");
	
	public static By series6 =By.xpath("//img[@alt='Showcase Series – Leapwork']");
	public static By series7 =By.xpath("//img[@alt='Showcase Series – Avo Automation']");
	
	public static By series8 =By.xpath("//img[@alt='Showcase Series – AccelQ']");
	public static By series9 =By.xpath("//img[@alt='Showcase Series – Lambdatest']");
	
	public static By series10 =By.xpath("//img[@alt='Showcase Series – Froglogic Squish']");
	public static By series11 =By.xpath("//img[@alt='Showcase Series – Testing-Whiz']");
	
	public static By series12 =By.xpath("//img[@alt='Showcase Series – SeaLights']");
	public static By series13 =By.xpath("//img[@alt='Showcase Series – AIEnsured']");
	
	public static By series14 =By.xpath("//img[@alt='Showcase Series – Simplify3x']");
//	public static By series15 =By.xpath("//img[@alt='Showcase Series  Qase.io']");
	
	
	//YouTube click and pause action in show case series
	
	public static By Showcase_YT =By.xpath("//a[normalize-space()='Showcase Series']");
	public static By Video1 =By.xpath("//img[@alt='Showcase Series – ContextQA']");

	public static By Video2 =By.xpath("//img[@alt='Showcase Series – Deepfactor']");
	public static By Video3 =By.xpath("//img[@alt='Showcase Series – Tonic']");
	
	
	//Author
		public static By author = By.xpath("//div[@class='elementor-element elementor-element-98ab44a elementor-align-center elementor-mobile-align-center elementor-widget elementor-widget-button']//span[@class='elementor-button-text'][normalize-space()='Author an Article']");
		public static By firstname = By.xpath("//input[@id='ff_1_names_first_name_']");
		public static By email = By.xpath("//input[@id='ff_1_email']");
		public static By titlearticle = By.xpath("//input[@id='ff_1_subject']");
		public static By bulletpoints = By.xpath("//textarea[@id='ff_1_message']");
		public static By submit1 = By.xpath("//button[@class=\"ff-btn ff-btn-submit ff-btn-lg ff_btn_style\"]");
		public static By conrfm = By.xpath("//*[@id=\"fluentform_1_success\"]");
		
	//**************************************************************************************************//	
		// Article
		public static By article1 = By.xpath("//a[normalize-space()='Articles']");
		public static By article2= By.xpath("//img[@alt='Optimizing performance of your E-commerce apps to ensure seamless customer experience']");
		public static By article3= By.xpath("//img[@alt='“Say Goodbye to Coding: Control Your Browser with English Inputs”']");
		public static By article4 = By.xpath("//img[@alt='leveraging openai gpt-3 for next-gen test automation']");
		public static By article5 = By.xpath("//img[@alt='Enabling reliable end-to-end testing for enterprise Web Apps using Playwright']");
		public static By article6 = By.xpath("//img[@alt='Enabling continuous testing for an E-commerce application using Selenium hybrid framework']");
		public static By article7 = By.xpath("/html/body/div[1]/div/div/div/main/article/div/div[1]/div/div/section/div[2]/div/div/div/div/div[5]/div/div/div/div[5]/div/div[1]/a/img");
		public static By article8 = By.xpath("//img[@alt='How DevOps builds the future of the software industry?']");
		public static By article9 = By.xpath("//img[@alt='in-depth testing of AI applications that use images']");
		public static By article10 = By.xpath("//div[@id='post-items--20855ba']//img[@alt='Why Codeless Automated Testing is gaining popularity?']");
		public static By article11 = By.xpath("//div[@id='post-items--20855ba']//img[@alt='In this age of Hyper-Automation why Manual testing is still a boon for enterprise app testing?']");
		public static By article12 = By.xpath("//div[@id='post-items--20855ba']//img[@alt='The Top 10 Application Security Issues of 2021 (OWASP) & how to test them']");
		public static By article13 = By.xpath("//*[@id=\"post-items--20855ba\"]/div[11]/div/div[1]/a/img");
		public static By article14 = By.xpath("//*[@id=\"post-items--20855ba\"]/div[12]/div/div[1]/a/img");
		public static By article15 = By.xpath("//*[@id=\"post-items--20855ba\"]/div[12]/div/div[1]/a/img");
		public static By article16 = By.xpath("//img[@alt='Selecting the right Test Automation Tool for your organization']");
		public static By article17 = By.xpath("//img[@alt='Key Benefits of Continuous Testing in Mobile application development']");
		public static By article18 = By.xpath("//img[@alt='Setting up ROBOT FRAMEWORK using Red Editor']");
		public static By article19 = By.xpath("//img[@alt='Is Script-Less Test Automation The Future ? Part-2']");
		public static By article20 = By.xpath("//img[@alt='Is script-less test automation the future ?']");
		public static By article21 = By.xpath("//img[@alt='Performance Testing & Engineering trends of 2020']");
		public static By article22 = By.xpath("//img[@alt='Test data management using AI-powered synthetic data generators']");
		public static By article23 = By.xpath("//div[@id='post-items--20855ba']//img[@alt='How to reduce test script rework effort and increase test development speed noticeably']");
		public static By article24 = By.xpath("//img[@alt='API Testing – An approach to shift-left ideology']");
		public static By article25 = By.xpath("//img[@alt='How To Setup Effective Continuous Testing In DevOps?']");
		
		
	
	
	
	}
	

	
	





	
