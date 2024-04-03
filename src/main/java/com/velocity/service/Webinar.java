package com.velocity.service;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.velocity.Dao.WebinarDao;

public class Webinar {

	public static void createWebinar(WebinarDao webinarDao) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://devchannel.docquity.com/index.php?r=site%2Flogin");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		WebinarPage webinar = new WebinarPage(driver);
		webinar.enterUsername(webinarDao.getUsername());
		webinar.enterPassword(webinarDao.getPassword());
		webinar.clickOnSignInButton();

		webinar.clickOnWebinarDropdown();
		webinar.clickOnWebinarListOption();
		webinar.clickOnCreateNewButton();
		webinar.enterWebinarTitle(webinarDao.getWebinarTitle());
		webinar.selectDateAndTime();
		webinar.enterLocation(webinarDao.getCountry());
		webinar.enterWebinarDescription(webinarDao.getDescription());

		webinar.selectWebinarType(webinarDao.getWebinarType());
		webinar.enterWebinarLink(webinarDao.getLink());
		webinar.selectSpeaker(webinarDao.getSpeaker());
		webinar.enableComment("enable");
		webinar.selectTimezone();
		webinar.selectSpeciality();
		webinar.enableLiveComment("enable");
		webinar.enterEstimateDuration(webinarDao.getEstimateDuration());
		webinar.selectChannel(webinarDao.getChannel());
		webinar.selectAssociation(webinarDao.getAssociation());
		webinar.selectSourceOfContent(webinarDao.getSourceOfContent());
		webinar.enterSourceInfo(webinarDao.getSourceInfo());
		webinar.selectCreatePvsNo();
		webinar.clickOnSubmitButton();
		webinar.selectContentLevel(webinarDao.getContentLevel());
		webinar.clickOnSubmitButton();
		String WebinarId = webinar.getWebinarId();

		System.out.println(WebinarId);
	}

	public static void createWebinar() throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://devchannel.docquity.com/index.php?r=site%2Flogin");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		WebinarPage webinar = new WebinarPage(driver);
		webinar.enterUsername("docquityinternal");
		webinar.enterPassword("123456");
		webinar.clickOnSignInButton();

		webinar.clickOnWebinarDropdown();
		webinar.clickOnWebinarListOption();
		webinar.clickOnCreateNewButton();
		webinar.enterWebinarTitle("Autmation Test Recorded Webinar");
		webinar.selectDateAndTime();
		webinar.enterLocation("india");
		webinar.enterWebinarDescription("description");

		webinar.selectWebinarType("recorded");
		webinar.enterWebinarLink(
				"https://dmvupy168sfqk.cloudfront.net/c910c3b6-ceb8-43d2-878c-896dc609e77a/hls/file_1592336982docquity5ee92256cd50d.m3u8");
		webinar.selectSpeaker("ankita");
		webinar.enableComment("enable");
		webinar.selectTimezone();
		webinar.selectSpeciality();
		webinar.enableLiveComment("enable");
		webinar.enterEstimateDuration("1200");
		webinar.selectChannel("content for doctors");
		webinar.selectAssociation("team docquity");
		webinar.selectSourceOfContent("pharma");
		webinar.enterSourceInfo("Source Info");
		webinar.selectCreatePvsNo();
		webinar.clickOnSubmitButton();
		webinar.selectContentLevel("student");
		webinar.clickOnSubmitButton();
		String WebinarId = webinar.getWebinarId();

		System.out.println(WebinarId);
	}

}
