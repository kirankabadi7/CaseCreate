package com.sample.repo.selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickonSpecificLinkonUI {
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.tutorialspoint.com/selenium/practice/links.php");
		List<WebElement> links = driver.findElements(By.tagName("a"));

		for (int j = 0; j < links.size(); j++) {
			System.out.println("Text of the link is : " + links.get(j).getText());
		}

		for (int i = 0; i < links.size(); i++) {
			if (links.get(i).getText().equalsIgnoreCase("Bad Request")) {
				links.get(i).click();
				break;
			}

		}
		String Message = driver.findElement(By.xpath("//div[@class='brequest']")).getText();
		System.out.println("Message from the link is : " + Message);
		driver.quit();
	}

}
