//package stepDefinitions;
//
//import cucumber.api.java.After;
//import cucumber.api.java.Before;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//
//public class TaggedHooksStepDefinition {
//	
//	// Global hooks:
//	@Before(order=1)
//	public void setUP(){
//		System.out.println("launch Chrome");
//		System.out.println("Enter url for free CRM");
//	}
//	
//	@After(order=1)
//	public void tearDown(){
//		System.out.println("close the browser");
//	}
//	
//	@Before(order=2)
//	public void setUP2(){
//		System.out.println("launch Chrome again");
//		System.out.println("Enter url for free CRM again");
//	}
//	
//	@After(order=2)
//	public void tearDown2(){
//		System.out.println("close the browser again");
//	}
//	
//	//local hook - only for first scenario
//	@Before("@First")
//	public void beforeFirst(){
//		System.out.println("only before first scenario");
//	}
//	
//	@After("@First")
//	public void afterFirst(){
//		System.out.println("only after first scenario");
//	}
//	
//	//local hook - only for second scenario
//	@Before("@Second")
//	public void beforeSecond(){
//		System.out.println("only before second scenario");
//	}
//	
//	@After("@Second")
//	public void afterSecond(){
//		System.out.println("only after second scenario");
//	}
//	
//	//local hook - only for third scenario
//	@Before("@Third")
//	public void beforeThird(){
//		System.out.println("only before third scenario");
//	}
//	
//	@After("@Third")
//	public void afterThird(){
//		System.out.println("only after third scenario");
//	}
//	
//	@Given("^this is the first step of first$")
//	public void this_is_the_first_step_of_first()  {
//	    System.out.println("first step of first");
//	}
//
//	@Then("^this is the second step of first$")
//	public void this_is_the_second_step_of_first()  {
//		System.out.println("second step of first");  
//	}
//
//	@Then("^this is the third step of first$")
//	public void this_is_the_third_step_of_first() {
//		System.out.println("third step of first");
//	}
//	   
//
//	@Given("^this is the first step of second$")
//	public void this_is_the_first_step_of_second()  {
//		System.out.println("first step of second");
//	}
//	    
//
//	@Then("^this is the second step of second$")
//	public void this_is_the_second_step_of_second()  {
//		System.out.println("second step of second");
//	}
//	    
//
//	@Then("^this is the third step of second$")
//	public void this_is_the_third_step_of_second()  {
//		System.out.println("third step of second");
//	}
//	    
//
//	@Given("^this is the first step of third$")
//	public void this_is_the_first_step_of_third()  {
//		System.out.println("first step of third");
//	}
//	   
//
//	@Then("^this is the second step of third$")
//	public void this_is_the_second_step_of_third()  {
//		System.out.println("second step of third");
//	}
//
//	@Then("^this is the third step of third$")
//	public void this_is_the_third_step_of_third() {
//		System.out.println("third step of third");
//	}
//
//
//}
