package com.sample.repo.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LauncTpt {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		// URL launch and get the browser title
		driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
		Thread.sleep(2000);
		System.out.println("Browser title after launch: " + driver.getTitle());
		System.out.println("Browing the URL of : " + driver.getCurrentUrl());

		WebElement inputName = driver.findElement(By.xpath("//input[@id='name']"));
		inputName.sendKeys("Kiran Kabadi");
		Thread.sleep(1000);
		System.out.println("Initial value in input box is :" + inputName.getAttribute("value"));
		inputName.clear();
		Thread.sleep(1000);
		System.out.println("After clearing input value in input box is :" + inputName.getAttribute("value"));

		driver.quit();

	}
}