package com.sample.repo.selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropdownPlay {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.tutorialspoint.com/selenium/practice/select-menu.php");

		WebElement dropdown = driver.findElement(By.id("demo-multiple-select"));
		Select drpdwn = new Select(dropdown);

		List<WebElement> options = drpdwn.getOptions();

		for (WebElement dpdwn : options) {
			System.out.println(dpdwn.getText());
		}

		System.out.println("Dropdown is multi select? :" + drpdwn.isMultiple());

		drpdwn.selectByIndex(7);
		drpdwn.deselectByValue("Books");

		drpdwn.deselectAll();

	}

}
