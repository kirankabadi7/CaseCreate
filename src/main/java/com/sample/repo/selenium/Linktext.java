package com.sample.repo.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linktext {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.tutorialspoint.com/selenium/practice/links.php");
		WebElement t = driver.findElement(By.linkText("Created"));
		t.click();
		WebElement e = driver.findElement(By.xpath("/html/body/main/div/div/div[2]/div[1]"));
		String text = e.getText();
		System.out.println("Text is: " + text);
		driver.quit();
	}
}