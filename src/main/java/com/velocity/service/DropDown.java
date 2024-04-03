package com.velocity.service;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.springframework.stereotype.Service;

@Service
public class DropDown {

	public static void selectByVisibleText() throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");

		WebElement country = driver.findElement(By.xpath("//select[@name='country']"));

		Select x = new Select(country);

		x.selectByVisibleText("INDIA");

		x.selectByVisibleText("JAPAN");

		x.selectByVisibleText("MEXICO");

		x.selectByVisibleText("FRANCE");

		Thread.sleep(2000);
		driver.close();
	}

}
