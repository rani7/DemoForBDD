//package stepDefinitions;
//
//import java.util.Map;
//import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//
//import cucumber.api.DataTable;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//import junit.framework.Assert;
//
//public class DealsWithMapStepDefinition {
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
//		Assert.assertEquals("CRMPRO Log In Screen",title);
//		
//	}
//    
//    @Then("^user enters username and password$") 
//    public void user_enters_username_and_password(DataTable credentials){
//    	for(Map<String,String> data:credentials.asMaps(String.class, String.class)){
//    	driver.findElement(By.name("username")).sendKeys(data.get("username"));
//    	driver.findElement(By.name("password")).sendKeys(data.get("password"));
//    	}	
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
//    @Then("^user moves to new deal page$")
//    public void user_moves_to_new_deal_page(){
// 	   driver.switchTo().frame("mainpanel");
// 	   Actions action=new Actions(driver);
// 	   action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Deals')]"))).build().perform();
// 	   driver.findElement(By.xpath("//a[contains(text(),'New Deal')]")).click();
//     
//   }
//    
//    @Then("^user enters deal details$") 
//    public void user_enters_contacts_details(DataTable dealData){
//    	
//    	for(Map<String,String> dataValues:dealData.asMaps(String.class, String.class)){
//        	driver.findElement(By.name("title")).sendKeys(dataValues.get("title"));
//        	driver.findElement(By.name("amount")).sendKeys(dataValues.get("amount"));
//        	driver.findElement(By.name("probability")).sendKeys(dataValues.get("probability"));
//        	driver.findElement(By.name("commission")).sendKeys(dataValues.get("commission"));
//        	driver.findElement(By.xpath("//input[@value='Save' and @type='submit']")).click();
//        	Actions action=new Actions(driver);
//      	    action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Deals')]"))).build().perform();
//      	    driver.findElement(By.xpath("//a[contains(text(),'New Deal')]")).click();
//        	}	
//    	
//    	}
// 		
// 	@Then("^close the browser$")
// 	public void close_the_browser(){
// 			 
//     	driver.quit();
//     }
//
//}
