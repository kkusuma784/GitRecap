package com.neotech.lesson1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW1 {

	public static void main(String[] args) throws InterruptedException {
//HW1: Amazon Page Title Verification: 
//Open chrome browser
//Go to “https://www.amazon.com/”
//Verify Title “Amazon.com: Online Shopping for 
//Electronics, Apparel, Computers, Books, DVDs & more” is displayed
//End the Session (close the browser).
		
	//open chrome browser
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.com/");
		
		String actualTitle = driver.getTitle();
		String expectedTitle = "Electronics, Apparel, Computers, Books, DVDs & more” is displayed";
		
		System.out.println("Actual Title : " + actualTitle);
		if(actualTitle.equals(expectedTitle)) {
			
			System.out.println("Title : "+ driver.getTitle());
		}
		else {
			System.out.println("The Title is wrong");
		}
		
		Thread.sleep(10000);
		
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
