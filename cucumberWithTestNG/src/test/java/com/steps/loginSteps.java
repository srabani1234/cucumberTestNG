package com.steps;

import org.testng.annotations.Parameters;

import com.pages.loginPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class loginSteps {

	loginPage log = new loginPage();
	@Given("^I am on cogmento login page$")
	public void i_am_on_cogmento_login_page() throws Throwable {
		loginPage log = new loginPage();
		log.checkUserField();
	}

	@When("^I enters \"([^\"]*)\"$")
	public void i_enters_as(String userName) throws Throwable {
	//	System.out.println(data.toString());
		log.useID(userName);
	}
@Parameters("password")
	@When("^I enter \"([^\"]*)\"$")
	public void i_enter_as(String password) throws Throwable {
		//System.out.println(data);
		log.passWord(password);
	}


	@When("^I select login button on cogmento login page$")
	public void i_select_login_button_on_cogmento_login_page() throws Throwable {
		log.loginButton();
	}

	@Then("^cogmento master menu page is visible$")
	public void cogmento_master_menu_page_is_visible() throws Throwable {
		log.masterMenuIcon();
	}
}