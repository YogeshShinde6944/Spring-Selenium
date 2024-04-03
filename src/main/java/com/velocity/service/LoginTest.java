package com.velocity.service;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.stereotype.Service;

@Service
public class LoginTest {

	public static WebElement waitForVisibilityOf(WebDriver driver, WebElement element) {
//		TestUtils.ThreadSleep(1000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOf(element));
		return element;
	}

	public void login(String MobileNumber) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://app.docquity.com");
		WebElement COOKIES = driver.findElement(By.xpath("//button[text()=' Accept']"));
		COOKIES.click();
		Thread.sleep(1000);

		WebElement MOBILE_NUMBER = driver.findElement(By.xpath("//input[@id='mobile_no']"));
		MOBILE_NUMBER.sendKeys(MobileNumber);
		Thread.sleep(1000);

		WebElement REQUEST_OTP_BUTTON = driver.findElement(By.xpath("//button[@id='requestOtpClick']"));
		REQUEST_OTP_BUTTON.click();
		Thread.sleep(1000);

		Thread.sleep(5000);
		driver.quit();
	}
}
