package com.project.basePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import io.github.bonigarcia.wdm.WebDriverManager;


public class basePage {
	public static WebDriver driver;

	public   WebDriver browserinit(){
		String browserName="Chrome";
		if(browserName.equalsIgnoreCase("Chrome")){
			//System.setProperty("webdriver.chrome.driver", "E:\\chromedriver\\chromedriver.exe");
			WebDriverManager.chromedriver().setup();
			driver= new ChromeDriver();
			driver.get("https://www.google.com");
		}

		else{
			System.out.println("Given browser is not available in this machine");

		}
		return driver;
	}



	public basePage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(this.driver, this);
	}



}
