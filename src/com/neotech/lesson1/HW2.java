package com.neotech.lesson1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HW2 {

	public static void main(String[] args) throws InterruptedException {
//		HW2: Opening Page on Firefox Browser
//		Open Firefox browser
//		Navigate to “https://www.redfin.com/”
//		Verify that you have navigated to (https://www.redfin.com/)
//		End the Session (close the browser).
		
		//Open the browser
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.redfin.com/");
		
		String actualURL = driver.getCurrentUrl();
		String expectedURL = "https://www.redfin.com/";
		
		if(actualURL.equals(expectedURL)) {
			
			System.out.println("The test is Passed!!");
		}
		else {
			System.out.println("The test is failed!!");
			System.out.println("Actual URL is :"+ actualURL);
			System.out.println("Expected URL is :"+ expectedURL);
		}
		
		Thread.sleep(5000);
		
		driver.quit();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		
		
		
		
		
		
		
		
		
		
	}

}
