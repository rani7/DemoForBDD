//package stepDefinitions;
//
//import cucumber.api.java.After;
//import cucumber.api.java.Before;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class HooksStepDefinition {
//	
//	@Before
//	public void setUP(){
//		System.out.println("launch Chrome");
//		System.out.println("Enter url for free CRM");
//	}
//	
//	@After
//	public void tearDown(){
//		System.out.println("close the browser");
//	}
//	
//	@Given("^user is on deal page$")
//	public void user_is_on_deal_page() {
//		System.out.println("user is on deal page");
//	   
//	}
//
//	@When("^user fills the Deals form$")
//	public void user_fills_the_Deals_form()  {
//		System.out.println("user fills the deals form");
//	    
//	}
//
//	@Then("^deal is created$")
//	public void deal_is_created()  {
//		System.out.println("deal is created");
//	    
//	}
//	
//	@Given("^user is on contact page$")
//	public void user_is_on_contact_page() {
//		System.out.println("user is on contact page");
//	   
//	}
//
//	@When("^user fills the Contacts form$")
//	public void user_fills_the_Contacts_form()  {
//		System.out.println("user fills the contacts form");
//	    
//	}
//
//	@Then("^contact is created$")
//	public void contact_is_created()  {
//		System.out.println("contact is created");
//	    
//	}
//
//}
