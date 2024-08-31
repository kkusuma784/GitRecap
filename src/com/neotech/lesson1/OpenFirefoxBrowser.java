package com.neotech.lesson1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenFirefoxBrowser {

	public static void main(String[] args) throws InterruptedException {
		// Do i need to re-attach the libraries?
		// No, we already added th external jar files(Language bindings)

		// Do I have to download the driver?
		// On previous versions of Selenium we had to download the driver for any
		// browser we wanted to use.

		// Open the Firefox Browser

		WebDriver driver = new FirefoxDriver();

		// We want to go to the neotechacademy URL

		driver.get("https://www.neotechacademy.com/");

		String actualURL = driver.getCurrentUrl();

		String expectedURL = "https://www.neotechacademy.com/";

		if (actualURL.equals(expectedURL)) {

			System.out.println("TItle:" + driver.getTitle());

		}

		else {

			System.out.println("The URL is wrong");
		}

		// I can use Thread.sleep(); to stop the code for some seconds so that
		// I can see tha page
		Thread.sleep(5000);

		// Closing the browser
		driver.quit();

	}

}
