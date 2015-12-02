package com.runnerdave.seleniumTest;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WhenSearchingForDrupalUsingGoogleTest {

	public static WebDriverWait wait;
	public static WebDriver driver;

	@BeforeClass
	public static void setUp() {
		System.setProperty("webdriver.chrome.driver", "/media/runnerdave/Data/install/chromedriver");

		driver = new ChromeDriver();
	}

	@AfterClass
	public static void tearDown() {
		driver.quit();
	}

	@Test
	public void testMethod() throws InterruptedException {

		driver.get("http://www.google.ca");

		WebElement element;

		element = driver.findElement(By.xpath("//input[@id='lst-ib']"));
		assertTrue(element.isDisplayed() == true);
	}
}