//package stepDefinitions;
//
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//import junit.framework.Assert;
//
//public class LoginStepDefinition {
//	
//	WebDriver driver;
//
//    @Given("^user is already on login page$")
//	public void user_already_on_logon_page(){
//		System.setProperty("webdriver.chrome.driver", "F:\\Eclipse-selenium\\chromedriver_win32\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://classic.crmpro.com/index.html");
//    }	
//    
//    @When("^title of login page is Free CRM$")	
//	public void title_of_login_page_is_free_CRM(){
//		String title = driver.getTitle();
//		System.out.println(title);
//		Assert.assertEquals("CRMPRO - CRM software for customer relationship management, sales, and support.", title);
//		
//	}
//    
//    @Then("^user enters the \"(.*)\" and \"(.*)\"$") // this is called regular expression
//    public void user_enters_username_and_password(String username, String password){
//    	
//    	driver.findElement(By.name("username")).sendKeys(username);
//    	driver.findElement(By.name("password")).sendKeys(password);
//    	
//    }
//		
//    @Then("^user clicks on login button$")
//    public void user_clicks_on_login_button(){
//    	WebElement loginBtn = driver.findElement(By.xpath("//input[@type='submit']"));
//    	JavascriptExecutor js = (JavascriptExecutor)driver;
//    	js.executeScript("arguments[0].click();",loginBtn);
//    		
//    }
//    
//    @Then("^user is on home page$")
//    public void user_is_on_home_page(){
//    	String title = driver.getTitle();
//		System.out.println("Home page title - "+title);
//		Assert.assertEquals("CRMPRO",title);
//    }
//    
//		
//	@Then("^close the browser$")
//	public void close_the_browser(){
//			 
//    	driver.quit();
//    }
//    
//   }
