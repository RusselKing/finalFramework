package com.stay.listeners;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class TestListeners {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
								"./src/test/resources/com/stay/drivers/chromedriver.exe");
	
		WebDriver driver = new ChromeDriver();
		//Create eventFiring webdriver so we can "listen" each action
		EventFiringWebDriver eDriver = new EventFiringWebDriver(driver);
		
		//create instance of custom events listener class
		MyWebDriverListener listener = new MyWebDriverListener();
		eDriver.register(listener);
		
		eDriver.get("http://www.google.com");
		eDriver.findElement(By.linkText("Business")).click();
	}
}
