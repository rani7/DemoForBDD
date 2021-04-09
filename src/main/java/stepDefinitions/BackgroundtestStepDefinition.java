package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BackgroundtestStepDefinition {
	
	@Given("^user is on the amazon site$")
	public void user_is_on_the_amazon_site() {
		System.out.println("user is on the amazon site");
	}

	@When("^user enters username and password$")
	public void user_enters_username_and_password() {
		System.out.println("user entered username and password");
	}

	@When("^user clicks on login$")
	public void user_clicks_on_login() {
		System.out.println("user clicked on login");
	}

	@Then("^user lands on the home page$")
	public void user_lands_on_the_home_page() {
		System.out.println("user lands on home page");
	}

	@When("^user clicks on menu(\\d+)$")
	public void user_clicks_on_menu(int arg1) {
		System.out.println("user clicks on menu "+arg1);
	}

	@Then("^menu(\\d+) is displayed$")
	public void menu_is_displayed(int arg1) {
		System.out.println("menu "+arg1+" is displayed");
	}

}
