package StepDeficitions_Hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HooksSteps {
	
	@Before
	public void browserSetup()
	{
		System.out.println("Chrom browser load");
	}
	
	@Given("user is on login page")
	public void user_is_on_login_page() {
		System.out.println("login page");
	}
	@When("user enters valid username and password")
	public void user_enters_valid_username_and_password() {
		System.out.println("validation");
	}
	@And("click on login button")
	public void click_on_login_button() {
		System.out.println("LOGIN click");
	}
	@Then("user is navigated to the homepage")
	public void user_is_navigated_to_the_homepage() {
	   
	}
	
	@After
	public void browserClose()
	{
		System.out.println("Chrom browser close");
	}

}
