package com.velocity.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import net.bytebuddy.utility.RandomString;

public class WebinarPage {

	public WebinarPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	private WebDriver driver;
	private static final Logger LOGGER = LogManager.getLogger(WebinarPage.class);
	String rm = RandomString.make(5);

	@FindBy(xpath = "//a[text()='Create New']")
	private WebElement CREATE_NEW_BUTTON;

	@FindBy(xpath = "//i[@class='fa fa-podcast']")
	private WebElement WEBINAR_DROPDOWN;

	@FindBy(xpath = "//span[text()='Webinar List']")
	private WebElement WEBINAR_LIST_OPTIONS;

	@FindBy(xpath = "//input[@id='webinarmaster-title']")
	private WebElement WEBINAR_TITLE;

	@FindBy(xpath = "//span[@title='Select date & time']")
	private WebElement CALENDER;

	@FindBy(xpath = "//td[@class='day active']")
	private WebElement ACTIVE_DAY;

	@FindBy(xpath = "//span[@class='hour active']")
	private WebElement ACTIVE_HOUR;

	@FindBy(xpath = "(//td//span[@class='minute'])[1]")
	private WebElement MINUTE;

	@FindBy(xpath = "(//th[@class='next'])[1]")
	private WebElement NEXT_ICON;

	@FindBy(xpath = "//input[@id='webinarmaster-location']")
	private WebElement LOCATION;

	@FindBy(xpath = "//textarea[@id='webinarmaster-description']")
	private WebElement DESCRIPTION;

	@FindBy(xpath = "//span[@id='select2-webinarmaster-type-container']")
	private WebElement WEBINAR_TYPE;

	@FindBy(xpath = "//span[@class='select2-search select2-search--dropdown']//input")
	private WebElement SEARCH_WEBINAR_TYPE;

	@FindBy(xpath = "//ul[@id='select2-webinarmaster-type-results']")
	private WebElement WOWZA_LIVE_STREAMING_OPTION;

	@FindBy(xpath = "//input[@id='webinarmaster-link']")
	private WebElement WEBINAR_LINK;

	@FindBy(xpath = "//input[@placeholder='Select Speaker']")
	private WebElement ADD_SPEAKER;

	@FindBy(xpath = "//li[text()='DR.TEST( MBBS ) ( 12769 )']")
	private WebElement SELECT_DOCTOR;

	@FindBy(xpath = "//span[@id='select2-webinarmaster-comment_flag-container']")
	private WebElement COMMENT_FLAG;

	@FindBy(xpath = "//span[@class='select2-search select2-search--dropdown']//input")
	private WebElement COMMENT_SEARCH;

	@FindBy(xpath = "(//span[text()='Browse …'])[1]")
	private WebElement BROWSE_IMAGE_1;

	@FindBy(xpath = "(//span[text()='Browse …'])[2]")
	private WebElement BROWSE_IMAGE_2;

	@FindBy(xpath = "//li[@id='select2-webinarmaster-comment_flag-result-uac6-1']")
	private WebElement ENABLE_COMMENT;

	@FindBy(xpath = "//span[@id='select2-webinarmaster-timezone-container']")
	private WebElement TIMEZONE;

	@FindBy(xpath = "//span[@class='select2-search select2-search--dropdown']//input")
	private WebElement ENTER_TIMEZONE;

	@FindBy(xpath = "//li[@id='select2-webinarmaster-timezone-result-ynrr-Asia/Kolkata']")
	private WebElement TIMEZONE_KOLKATA;

	@FindBy(xpath = "//input[@placeholder='Select specialization']")
	private WebElement SPECIALITY;

	@FindBy(xpath = "//li[text()='Cardiology']")
	private WebElement CARDIOLOGY;

	@FindBy(xpath = "//span[@id='select2-webinarmaster-is_live_comment-container']")
	private WebElement LIVE_COMMENT;

	@FindBy(xpath = "//span[@class='select2-search select2-search--dropdown']//input")
	private WebElement SEARCH_LIVE_COMMENT;

	@FindBy(xpath = "//li[@id='select2-webinarmaster-is_live_comment-result-0m5i-1']")
	private WebElement ENABLE_LIVE_COMMENT;

	@FindBy(xpath = "//input[@id='webinarmaster-estimate_duration']")
	private WebElement ESTIMATE_DURATION;

	@FindBy(xpath = "//span[@id='select2-webinarmaster-chanel_id-container']")
	private WebElement CHANNEL;

	@FindBy(xpath = "//span[@class='select2-search select2-search--dropdown']//input")
	private WebElement INPUT_CHANNEL;

	@FindBy(xpath = "//input[@PlaceHolder='Select Country']")
	private WebElement COUNTRY_BOX;

	@FindBy(xpath = "//input[@PlaceHolder='Select Association']")
	private WebElement ASSOCIATION_BOX;

	@FindBy(xpath = "//li[@class='select2-results__option select2-results__option--highlighted']")
	private WebElement ASSOCIATION_DEV_DOCQUITY;

	@FindBy(xpath = "//span[text()='Select Source Of Content']")
	private WebElement SOURCE_OF_CONTENT;

	@FindBy(xpath = "//span[@class='select2-dropdown select2-dropdown--above']//input[@class='select2-search__field']")
	private WebElement INPUT_BOX_SOURCE_OF_CONTENT;

	@FindBy(xpath = "//li[@class='select2-results__option select2-results__option--highlighted']")
	private WebElement SOURCE_OF_CONTENT_1ST_OPTION;

	@FindBy(xpath = "//input[@id='productsourcecontentmapping-source_info']")
	private WebElement SOURCE_INFO;

	@FindBy(xpath = "//span[@id='select2-pvsmodel-is_pvs_created-container']")
	private WebElement CREATE_PVS;

	@FindBy(xpath = "//li[text()='No']")
	private WebElement NO_OPTION;

	@FindBy(xpath = "//button[@class='btn btn-primary']")
	private WebElement SUBMIT_BUTTON;

	@FindBy(xpath = "//a[@id='hybridWebinarSkipButton']")
	private WebElement SKIP_BUTTON;

	@FindBy(xpath = "//span[@id='select2-contentlevel-level_id-0-container']")
	private WebElement CONTENT_LEVEL;

	@FindBy(xpath = "//span[@class='select2-search select2-search--dropdown']//input")
	private WebElement CONTENT_LEVEL_SEARCH;

	@FindBy(xpath = "(//td[@class='sorting_1'])[1]")
	private WebElement WEBINAR_ID;

	@FindBy(xpath = "(//a[text()='Start'])[1]")
	private WebElement START_WEBINAR_BUTTON;

	@FindBy(xpath = "(//a[text()='End'])[1]")
	private WebElement END_WEBINAR_BUTTON;

	@FindBy(xpath = "//input[@id='pharmalogin-username']")
	private WebElement USERNAME;

	@FindBy(xpath = "//input[@id='pharmalogin-password']")
	private WebElement PASSWORD;

	@FindBy(xpath = "//button[@name='login-button']")
	private WebElement SIGNIN_BTN;

	public void clickOnCreateNewButton() {
		LOGGER.info("Trying to click on create new button");
		TestUtils.waitForVisibilityOf(driver, CREATE_NEW_BUTTON).click();
	}

	public void enterWebinarTitle(String WebinarTitle) {
		LOGGER.info("Trying to enter webinar title");
		TestUtils.waitForVisibilityOf(driver, WEBINAR_TITLE)
				.sendKeys(WebinarTitle + " || " + TestUtils.getCurrentDate() + " " + RandomString.make(4));
	}

	public void selectDateAndTime() {
		LOGGER.info("Trying to select current date and time");
		TestUtils.waitForVisibilityOf(driver, CALENDER).click();
		TestUtils.waitForVisibilityOf(driver, ACTIVE_DAY).click();
		TestUtils.waitForVisibilityOf(driver, ACTIVE_HOUR).click();
		TestUtils.waitForVisibilityOf(driver, NEXT_ICON).click();
		TestUtils.waitForVisibilityOf(driver, MINUTE).click();
	}

	public void enterLocation(String WebinarLocation) {
		LOGGER.info("enterLocation");
		TestUtils.waitForVisibilityOf(driver, LOCATION).sendKeys(WebinarLocation);
	}

	public void enterWebinarDescription(String WebinarDescription) {
		LOGGER.info("Trying to enter webinar description");
		TestUtils.waitForVisibilityOf(driver, DESCRIPTION).sendKeys(WebinarDescription);
	}

	public void selectWebinarType(String WebinarType) throws InterruptedException {
		LOGGER.info("Trying to select webinar type as wowza");
		TestUtils.waitForVisibilityOf(driver, WEBINAR_TYPE).click();
		Thread.sleep(1000);
		TestUtils.waitForVisibilityOf(driver, SEARCH_WEBINAR_TYPE).sendKeys(WebinarType);
		Thread.sleep(1000);
		TestUtils.waitForVisibilityOf(driver, WOWZA_LIVE_STREAMING_OPTION).click();
	}

	public void enterWebinarLink(String WebinarLink) {
		LOGGER.info("Trying to enter webinar description");
		TestUtils.waitForVisibilityOf(driver, WEBINAR_LINK).sendKeys(WebinarLink);
	}

	public void selectSpeaker(String SpakerName) {
		LOGGER.info("Trying to select speaker");
		TestUtils.waitForVisibilityOf(driver, ADD_SPEAKER).click();
		TestUtils.waitForVisibilityOf(driver, ADD_SPEAKER).sendKeys(SpakerName);
		TestUtils.performEnterAction(driver);
	}

	public void enableComment(String CommentEnable) throws InterruptedException {
		LOGGER.info("Trying to enable comment");
		TestUtils.waitForVisibilityOf(driver, COMMENT_FLAG).click();
		TestUtils.waitForVisibilityOf(driver, COMMENT_SEARCH).sendKeys(CommentEnable);
		TestUtils.performEnterAction(driver);
	}

	public void selectTimezone() {
		LOGGER.info("Trying to select timezone kolkata");
		TestUtils.waitForVisibilityOf(driver, TIMEZONE).click();
		TestUtils.waitForVisibilityOf(driver, ENTER_TIMEZONE).sendKeys("kolkata");
		TestUtils.performEnterAction(driver);
	}

	public void selectSpeciality() {
		LOGGER.info("Trying to select speciality");
		TestUtils.waitForVisibilityOf(driver, SPECIALITY).click();
		TestUtils.waitForVisibilityOf(driver, CARDIOLOGY).click();
	}

	public void enableLiveComment(String LiveCommentSearch) {
		LOGGER.info("Trying to enable live comment");
		TestUtils.waitForVisibilityOf(driver, LIVE_COMMENT).click();
		TestUtils.waitForVisibilityOf(driver, SEARCH_LIVE_COMMENT).sendKeys(LiveCommentSearch);
		TestUtils.performEnterAction(driver);
	}

	public void enterEstimateDuration(String duration) {
		LOGGER.info("Trying to enter estimate duration");
		TestUtils.waitForVisibilityOf(driver, ESTIMATE_DURATION).sendKeys(duration);
	}

	public void selectChannel(String Channel) {
		LOGGER.info("Trying to select channel");
		TestUtils.waitForVisibilityOf(driver, CHANNEL).click();
		TestUtils.waitForVisibilityOf(driver, INPUT_CHANNEL).sendKeys(Channel);
		TestUtils.performEnterAction(driver);
	}

	public void selectAssociation(String Association) {
		LOGGER.info("Trying to select association", LOGGER);
		TestUtils.ThreadSleep(2000);
		TestUtils.waitForVisibilityOf(driver, ASSOCIATION_BOX).click();
		TestUtils.ThreadSleep(1000);
		TestUtils.waitForVisibilityOf(driver, ASSOCIATION_BOX).sendKeys(Association);
		TestUtils.ThreadSleep(500);
		TestUtils.performEnterAction(driver);
	}

	public void clickOnSubmitButton() {
		LOGGER.info("Trying to click on sumbit button");
		TestUtils.waitForVisibilityOf(driver, SUBMIT_BUTTON).click();
	}

	public void clickOnSkipButton() {
		LOGGER.info("Trying to click on skip button");
		TestUtils.waitForVisibilityOf(driver, SKIP_BUTTON).click();
	}

	public void selectContentLevel(String ContentLevel) throws InterruptedException {
		LOGGER.info("Trying to select content level");
		TestUtils.waitForVisibilityOf(driver, CONTENT_LEVEL).click();
		Thread.sleep(1000);
		TestUtils.waitForVisibilityOf(driver, CONTENT_LEVEL_SEARCH).sendKeys(ContentLevel);
		Thread.sleep(1000);

		TestUtils.performEnterAction(driver);
	}

	public String getWebinarId() {
		LOGGER.info("Trying to get webinar id");
		String WebinarId = TestUtils.waitForVisibilityOf(driver, WEBINAR_ID).getText();
		return WebinarId;
	}

	public void clickOnStartWebinarButton() {
		LOGGER.info("Trying to click on start webinar button");
		TestUtils.waitForVisibilityOf(driver, START_WEBINAR_BUTTON).click();
		TestUtils.ThreadSleep(3000);
		TestUtils.waitForVisibilityOf(driver, END_WEBINAR_BUTTON).isDisplayed();
	}

	public void clickOnEndWebinarButton() {
		LOGGER.info("Trying to click on end webinar button");
		TestUtils.waitForVisibilityOf(driver, END_WEBINAR_BUTTON).click();
	}

	public void enterUsername(String username) throws InterruptedException {
		LOGGER.info("trying to enter username");
		Thread.sleep(1000);
		TestUtils.waitForVisibilityOf(driver, USERNAME).sendKeys(username);
	}

	public void enterPassword(String password) {
		LOGGER.info("trying to enter password");
		TestUtils.waitForVisibilityOf(driver, PASSWORD).sendKeys(password);
	}

	public void clickOnSignInButton() {
		LOGGER.info("Trying to click on the signin button");
		TestUtils.waitForVisibilityOf(driver, SIGNIN_BTN).click();
	}

	public void clickOnWebinarDropdown() {
		LOGGER.info("Trying to click on webinar dropdown");
		TestUtils.waitForVisibilityOf(driver, WEBINAR_DROPDOWN).click();
	}

	public void clickOnWebinarListOption() {
		LOGGER.info("Trying to click on webinar list option");
		TestUtils.waitForVisibilityOf(driver, WEBINAR_LIST_OPTIONS).click();
	}

	public void loginDevChannel(String Username, String Password) throws InterruptedException {
		WebinarPage webinar = new WebinarPage(driver);
		webinar.enterUsername(Username);
		webinar.enterPassword(Password);
		webinar.clickOnSignInButton();
	}

	public void selectSourceOfContent(String SourceContent) {
		TestUtils.waitForVisibilityOf(driver, SOURCE_OF_CONTENT).click();
		TestUtils.waitForVisibilityOf(driver, INPUT_BOX_SOURCE_OF_CONTENT).sendKeys(SourceContent);
		TestUtils.waitForVisibilityOf(driver, SOURCE_OF_CONTENT_1ST_OPTION).click();
	}

	public void selectCreatePvsNo() {
		TestUtils.waitForVisibilityOf(driver, CREATE_PVS).click();
		TestUtils.waitForVisibilityOf(driver, NO_OPTION).click();
	}

	public void enterSourceInfo(String SourceInfo) {
		TestUtils.waitForVisibilityOf(driver, SOURCE_INFO).sendKeys(SourceInfo);
	}

}
