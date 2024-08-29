package com.neotech.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.CommonMethods;

public class LoginPage extends CommonMethods{

	public WebElement username = driver.findElement(By.id("username"));
	
	public WebElement password = driver.findElement(By.id("password"));
	
	public WebElement loginBtn = driver.findElement(By.xpath("//button"));
}
