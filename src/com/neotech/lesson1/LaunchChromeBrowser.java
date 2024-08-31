package com.neotech.lesson1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChromeBrowser {

	public static void main(String[] args) throws InterruptedException {
		//open the browser
		
		WebDriver driver = new ChromeDriver();//CTRL+SHIFT+O---import the necessary objects
		
		//Go to the URL
		driver.get("https://www.neotechacademy.com/");
		
		//Do whatever test you need
		//this would be where the actions takes place
		
		//for noe  i just want to code to stop here.so that I can see the page loading
		
		Thread.sleep(10000);//this is stoppong the execution for seconds so that 
       //I can see the page
		driver.quit();

	}

}
