package com.velocity.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.velocity.Dao.WebinarDao;
import com.velocity.service.DropDown;
import com.velocity.service.LoginTest;
import com.velocity.service.Webinar;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;

@Tag(name = "Yogesh  :  Selenium", description = "WebAutomation Docquity")
@RestController
public class TestController {

	@Autowired
	WebinarDao WebinarDao;

	@GetMapping("/loginTest")
	public String setup(@RequestParam("MobileNumber") String MobileNumber) throws InterruptedException {
		LoginTest loginTest = new LoginTest();
		loginTest.login(MobileNumber);
		return "successfull ..........";

	}

	@Operation(summary = "Dropdown select", description = "Dropdown select by visible text")
	@ApiResponses(value = { @ApiResponse(responseCode = "200", description = "Successfull operation") })
	@GetMapping("/selectByVisibleText")
	public String dropDownHandling() throws InterruptedException {
		DropDown.selectByVisibleText();
		return "successfull ..........";
	}

	@Operation(summary = "Create Webinar", description = "craete webianr recorded,Dstream,Wowza")
	@ApiResponses(value = { @ApiResponse(responseCode = "200", description = "Successfull operation") })
	@GetMapping("/webiar")
	public String createWebinar() throws InterruptedException {
		Webinar webinar = new Webinar();
		webinar.createWebinar();
		return "webinar created ..........";
	}

	@Operation(summary = "Create Webinar", description = "craete webianr recorded,Dstream,Wowza")
	@ApiResponses(value = { @ApiResponse(responseCode = "200", description = "Successfull operation") })
	@PostMapping("/webiar2")
	public WebinarDao createWebinar2(@RequestBody WebinarDao webinarDao) throws InterruptedException {
		Webinar webinar = new Webinar();
		System.out.println(webinarDao.getUsername());
		System.out.println(webinarDao.getPassword());
		webinar.createWebinar(webinarDao);
		return webinarDao;
	}

}
